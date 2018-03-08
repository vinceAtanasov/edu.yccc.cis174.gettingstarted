package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	List<Exam> exams = new ArrayList<Exam>();

	public void loadExams() {
		exams.add(new JavaExam());
		exams.add(new ChemistryExam());
	}

	public static void main(String[] args) {
		Main ex = new Main();
		ChemistryExam ex2 = new ChemistryExam();

		// 1. Load exams;
		//ex.loadExams();
		ex2.loadQuestions();
		ex2.loadAnswers();
		ex2.loadCorrectAnswers();

		// 2. Offer to the user all of the available exams.

		// 3. Give exam.
		ex2.exam();
		// a. Ask questions.
		// b. Collect responses.
		// 4. Calculate grade.
		ex2.calculateGrade();

	}

}
