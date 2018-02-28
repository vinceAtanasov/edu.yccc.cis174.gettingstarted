package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaExam implements Exam {
	public List<Question> questions = new ArrayList<Question>();
	public List<Answer> possibleAnswers = new ArrayList<Answer>();
	public List<Answer> correctAnswers = new ArrayList<Answer>();
	public List<Answer> userAnswers = new ArrayList<Answer>();

	@Override
	// Method that reads the file with the questions and returns list with them.
	public List<Question> loadQuestions() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(
					new File("C:\\Users\\velik\\git\\edu.yccc.cis174.vinceAtanasov\\src\\javaQuestions.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the questions.
			while (scanner.hasNextLine()) {
				Question q = new Question();
				q.setQuestion(scanner.nextLine());
				questions.add(q);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Closing the scanner.
		finally {
			scanner.close();
		}
		System.out.println(questions.toString());
		return questions;
	}

	@Override
	public float calculateGrade() {
		return 0;
		
	}

	@Override
	public List<Answer> loadAnswers() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(
					new File("C:\\Users\\velik\\git\\edu.yccc.cis174.vinceAtanasov\\src\\javaAnswers.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the questions.
			while (scanner.hasNextLine()) {
				Answer a = new Answer();
				a.setPossibleAnswer(scanner.nextLine());
				possibleAnswers.add(a);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Closing the scanner.
		finally {
			scanner.close();
		}
		System.out.println(possibleAnswers.toString());
		return possibleAnswers;
	}

	@Override
	public List<Answer> loadCorrectAnswers() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(
					new File("C:\\Users\\velik\\git\\edu.yccc.cis174.vinceAtanasov\\src\\javaCorrectAnswers.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the questions.
			while (scanner.hasNextLine()) {
				Answer a = new Answer();
				a.setPossibleAnswer(scanner.nextLine());
				correctAnswers.add(a);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Closing the scanner.
		finally {
			scanner.close();
		}
		System.out.println(correctAnswers.toString());
		return correctAnswers;
	}

}
