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

	public List<String> exam() {

		Scanner console = new Scanner(System.in);

		for (String q : questions) {
			System.out.println(q);
			System.out.println(possibleAnswers.get(q.indexOf(q)));
			System.out.println();
			System.out.print("Answer: ");
			String ans = console.next().toUpperCase();
			userAnswers.add(ans);
		}
		System.out.println(userAnswers);
		return userAnswers;
	}

	public static void main(String[] args) {
		Exam ex1 = new Exam();
		ex1.loadQuestions();
		ex1.loadAnswers();
		ex1.loadCorrectAnswers();
		ex1.exam();

	}

}
