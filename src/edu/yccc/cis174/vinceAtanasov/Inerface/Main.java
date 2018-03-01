package edu.yccc.cis174.vinceAtanasov.Inerface;

public class Main {

	public static void main(String[] args) {
		JavaExam ex1 = new JavaExam();
		ChemistryExam ex2 = new ChemistryExam();
		
		// 1. Load exams;
		ex1.loadQuestions();
		ex1.loadAnswers();
		ex1.loadCorrectAnswers();

		
		// 2. Offer to the user all of the available exams.
		
		// 3. Give exam.
		ex1.exam();
			// a. Ask questions.
			// b. Collect responses.
		// 4. Calculate grade.
		ex1.calculateGrade();

	}

}
