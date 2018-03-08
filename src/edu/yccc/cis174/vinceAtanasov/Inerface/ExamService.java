package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamService {
	JavaExam ex1 = new JavaExam();
	ChemistryExam ex2 = new ChemistryExam();
	List<Exam> exams = new ArrayList<Exam>();
	public String userChoise;

	public void loadExams() {
		exams.add(new JavaExam());
		exams.add(new ChemistryExam());
	}

	public String selectExam() {
		Scanner console = null;
		console = new Scanner(System.in);
		int count = 1;
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
		if (userChoise == "1") {
			ex1.loadQuestions();
			ex1.loadAnswers();
			ex1.loadCorrectAnswers();
			ex1.exam();
			ex1.calculateGrade();
		}
		if (userChoise == "2") {
			ex2.loadQuestions();
			ex2.loadAnswers();
			ex2.loadCorrectAnswers();
			ex2.exam();
			ex2.calculateGrade();
		}
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
