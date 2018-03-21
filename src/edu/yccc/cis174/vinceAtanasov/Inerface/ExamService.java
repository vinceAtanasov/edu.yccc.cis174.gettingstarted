package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamService {

	List<Exam> exams = new ArrayList<Exam>();
	public String userChoise;
	public Scanner console = new Scanner(System.in);
	

	public void loadExams() {
		exams.add(new JavaExam());
		exams.add(new ChemistryExam());
	}

	public String selectExam() {
		int count = 0;
		System.out.println("Welcome!\n");
		System.out.println("Please, select an exam!");
		for (Exam ex : exams) {
			System.out.print(count++ + ": ");
			ex.describe();
		}
		userChoise = console.next();
		return userChoise;
	}

	public void runExam() {
		Exam exam = exams.get(Integer.valueOf(userChoise).intValue());
		exam.loadQuestions();
		exam.loadAnswers();
		exam.loadCorrectAnswers();
		exam.exam();
		exam.calculateGrade();
		//exam.writeExamResult(userName, exam.calculateGrade());
	}
	
	
	public static void main(String[] args) {
		ExamService exS = new ExamService();
		
		// 1. Load exams;
		exS.loadExams();
		// 2. Offer to the user all of the available exams.
		exS.selectExam();
		// 3. Give exam, Ask questions, collect responses, calculate grade.
		exS.runExam();
	}

}
