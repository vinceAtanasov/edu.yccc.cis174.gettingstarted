package edu.yccc.cis174.vinceAtanasov.JavaExam;

/** 
 * This is a program that evaluates the student's knowledge of Java.
 * @author Vince
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {
	// Creating empty lists for the questions, possible answers and the answer key,
	// which will host the data from the text files.
	public List<String> questions = new ArrayList<String>();
	public List<String> possibleAnswers = new ArrayList<String>();
	public List<String> correctAnswers = new ArrayList<String>();

	// Creating an empty list, where I will collect the student's input.
	public List<String> userAnswers = new ArrayList<String>();

	// Method that reads the file with the questions and returns list with them.
	public List<String> loadQuestions() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(new File(
					"J:\\git\\edu.yccc.cis174.vinceAtanasov\\src\\edu\\yccc\\cis174\\vinceAtanasov\\JavaExam\\questions.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the questions.
			while (scanner.hasNextLine()) {
				questions.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return questions;
	}

	// Method that reads the file with the possible answers and returns list with
	// them.
	public List<String> loadAnswers() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the answers.txt file.
			scanner = new Scanner(new File(
					"J:\\git\\edu.yccc.cis174.vinceAtanasov\\src\\edu\\yccc\\cis174\\vinceAtanasov\\JavaExam\\answers.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the possible answers.
			while (scanner.hasNextLine()) {
				possibleAnswers.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return possibleAnswers;
	}

	// Method that reads the file with the correct answers and returns list with
	// them.
	public List<String> loadCorrectAnswers() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the correctAnswers.txt file.
			scanner = new Scanner(new File(
					"J:\\git\\edu.yccc.cis174.vinceAtanasov\\src\\edu\\yccc\\cis174\\vinceAtanasov\\JavaExam\\correctAnswers.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the correct answers.
			while (scanner.hasNextLine()) {
				correctAnswers.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return correctAnswers;
	}

	// Method that does the examination of the student. Prints out each question
	// with its possible answers and collect an input from the student. The method
	// returns a list with the student's answers.
	public List<String> exam() {
		Scanner console = null;
		// Creating a scanner that takes the user input from the console.
		console = new Scanner(System.in);
		// Loop that goes through the list with the questions.
		for (String q : questions) {
			// Printing the questions one after another.
			System.out.println(q);
			// Printing the possible answers for each question.
			System.out.println(possibleAnswers.get(questions.indexOf(q)));
			System.out.println();
			System.out.print("Answer: ");
			// Collecting the user's input from the console and converting the letter to
			// upper case.
			String userAnswer = console.next().toUpperCase();
			// Adding the user's answer to the list the user's answers.F
			userAnswers.add(userAnswer);
		}
		console.close();
		return userAnswers;
	}

	// Method that calculates and prints the student's grade after performing the
	// exam.
	public void grade() {
		// Creating variables for correct answers, total questions and the grade itself.
		int correct = 0;
		int total = 10;
		int grade = 0;
		// Loop that goes around the list with user's answers and correct answers.
		for (int i = 0; i < 10; i++) {
			// Creating variable result which compare the elements from the two list index
			// by index.
			int result = (userAnswers.get(i).compareTo(correctAnswers.get(i)));
			// Condition that increments the variable correct with one every time when there
			// is match between the lists' elements by index.
			if (result == 0) {
				correct++;
			}
		}
		// Calculating the grade of the student.
		grade = (int) ((double) correct / total * 100);
		System.out.println();
		System.out.println("Your grade is: " + grade);
	}

	// The main method.
	public static void main(String[] args) {
		// Creating an instance of Exam.
		Exam ex1 = new Exam();
		// Calling all of the methods one after one.
		ex1.loadQuestions();
		ex1.loadAnswers();
		ex1.loadCorrectAnswers();
		ex1.exam();
		ex1.grade();
	}
}