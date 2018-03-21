package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaExam implements Exam {
	public List<Question> questions = new ArrayList<Question>();
	public List<Answer> possibleAnswers = new ArrayList<Answer>();
	public List<String> correctAnswers = new ArrayList<String>();
	public List<String> userAnswers = new ArrayList<String>();
	public String userName;

	@Override
	// Method that reads the file with the questions and returns list with them.
	public List<Question> loadQuestions() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(new File("javaQuestions.txt"));
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
		return questions;
	}

	@Override
	public List<Answer> loadAnswers() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(new File("javaAnswers.txt"));
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
		return possibleAnswers;
	}

	@Override
	public List<String> loadCorrectAnswers() {
		Scanner scanner = null;
		try {
			// Creating scanner that reads the questions.txt file.
			scanner = new Scanner(new File("javaCorrectAnswers.txt"));
			// Loop that goes over the file and adding each line as a string element to the
			// list. The result is full list with the questions.
			while (scanner.hasNextLine()) {

				correctAnswers.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Closing the scanner.
		finally {
			scanner.close();
		}
		return correctAnswers;
	}

	@Override
	public float calculateGrade() {
		// Creating variables for correct answers, total questions and the grade itself.
		int correct = 0;
		int total = 10;
		float grade = 0;
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
		grade = (float) ((double) correct / total * 100);
		System.out.println();
		System.out.println(userName + " " + "your grade is: " + grade);
		return grade;
	}

	@Override
	public List<String> exam() {
		// Creating a scanner that takes the user input from the console.
		Scanner console = null;
		console = new Scanner(System.in);
		// Loop that goes through the list with the questions.
		for (Question q : questions) {
			// Printing the questions one after another.
			System.out.println(q);
			// Printing the possible answers for each question.
			System.out.println(possibleAnswers.get(questions.indexOf(q)));
			System.out.println();
			System.out.print("Answer: ");
			// Collecting the user's input from the console and converting the letter to
			// upper case.
			String userAnswer = console.next().toUpperCase();
			// Adding the user's answer to the list the user's answers.
			userAnswers.add(userAnswer);
		}
		console.close();
		return userAnswers;
	}

	@Override
	public void describe() {
		System.out.println("Java exam");
	}

	@Override
	// Method that writes a file. We'are passing arguments for user name and grade.
	public void writeExamResult(String userName, float grade) {
		// Creating empty BufferedWriter out.
		BufferedWriter out = null;
		try {
			// Creating FileWriter with the path for the text file.
			FileWriter fStream = new FileWriter("Examresults.txt", true);
			out = new BufferedWriter(fStream);
			// Writing out the user name and the result to a text file.
			out.write(" ");
			out.write(userName + " ");
			out.write(grade + ";" + "\n");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getUserName() {
		// Creating a scanner that takes the user input from the console.
		Scanner console = null;
		console = new Scanner(System.in);
		System.out.println("What is your name?");
		userName = console.next();
		return userName;
	}
}