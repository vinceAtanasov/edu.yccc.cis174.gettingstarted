package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamService {

	List<Exam> exams = new ArrayList<Exam>();
	public String userChoise;

	public void loadExams() {
		exams.add(new JavaExam());
		exams.add(new ChemistryExam());
	}

	public String selectExam() {
		Scanner console = null;
		console = new Scanner(System.in);
		int count = 0;
		System.out.println("Welcome!\n");
		System.out.println("Please, select an exam!");
		for (Exam ex : exams) {
			System.out.print(count++ + ": ");
			ex.describe();
		}
		userChoise = console.next();
		console.close();
		return userChoise;
	}

	public void runExam() {
		Exam e = exams.get(Integer.valueOf(userChoise).intValue());
		e.loadQuestions();
		e.loadAnswers();
		e.loadCorrectAnswers();
		e.exam();
		e.calculateGrade();
	}

	public static void main(String[] args) {
		ExamService exs = new ExamService();

		// 1. Load exams;
		exs.loadExams();
		// 2. Offer to the user all of the available exams.
		exs.selectExam();
		// 3. Give exam, Ask questions, collect responses, calculate grade.
		exs.runExam();
	}

}
