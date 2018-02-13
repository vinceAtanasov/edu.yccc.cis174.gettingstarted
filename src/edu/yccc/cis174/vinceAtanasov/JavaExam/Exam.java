package edu.yccc.cis174.vinceAtanasov.JavaExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {
	public List<Questions> questions = new ArrayList<Questions>();

	
	public List<Questions> loadQuestions() {
		//questions.add(new Questions("Is Java multiplatform language?", null));
		//System.out.println(questions);
		try {
			Scanner scanner = new Scanner(new File("questions.txt"));

			while(scanner.hasNextLine()){
			    questions.add(scanner.nextLine());
			}
		    return questions;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		Exam ex1 = new Exam();
		ex1.loadQuestions();

	}

}
