package edu.yccc.cis174.vinceAtanasov.JavaExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {
	public List<String> questions = new ArrayList<String>();
	public List<String> possibleAnswers = new ArrayList<String>();
	public List<String> correctAnswers = new ArrayList<String>();
	List<String> userAnswers = new ArrayList<String>();

	public List<String> loadQuestions() {
		try {
			Scanner scanner = new Scanner(new File(
					"C:\\Users\\velik\\git\\edu.yccc.cis174.vinceAtanasov\\src\\edu\\yccc\\cis174\\vinceAtanasov\\JavaExam\\questions.txt"));

			while (scanner.hasNextLine()) {
				questions.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return questions;
	}

	public List<String> loadAnswers() {
		try {
			Scanner scanner = new Scanner(new File(
					"C:\\Users\\velik\\git\\edu.yccc.cis174.vinceAtanasov\\src\\edu\\yccc\\cis174\\vinceAtanasov\\JavaExam\\answers.txt"));

			while (scanner.hasNextLine()) {
				possibleAnswers.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return possibleAnswers;
	}

	public List<String> loadCorrectAnswers() {
		try {
			Scanner scanner = new Scanner(new File(
					"C:\\Users\\velik\\git\\edu.yccc.cis174.vinceAtanasov\\src\\edu\\yccc\\cis174\\vinceAtanasov\\JavaExam\\correctAnswers.txt"));

			while (scanner.hasNextLine()) {
				correctAnswers.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return correctAnswers;
	}

	public List<String> exam() {

		Scanner console = new Scanner(System.in);

		for (String q : questions) {
			System.out.println(q);
			System.out.println(possibleAnswers.get(questions.indexOf(q)));
			System.out.println();
			System.out.print("Answer: ");
			String userAnswer = console.next().toUpperCase();
			userAnswers.add(userAnswer);
		}
		return userAnswers;
	}

	public void grade() {
		int correct = 0;
		int total = 10;
		double grade = 0;
		
		userAnswers.retainAll(correctAnswers);
		grade = (correct / total) * 100;
		System.out.println(userAnswers);
	}

	public static void main(String[] args) {
		Exam ex1 = new Exam();
		ex1.loadQuestions();
		ex1.loadAnswers();
		ex1.loadCorrectAnswers();
		ex1.exam();
		ex1.grade();

	}

}
