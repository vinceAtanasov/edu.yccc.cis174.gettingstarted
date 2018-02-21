package edu.yccc.cis174.vinceAtanasov.JavaExam;

/**
 * 
 * @author Vince
 *
 */
public class Answer {
	// Creating variable for possibleAnswers.
	private String possibleAnswers;

	// Getter and setter for the variable possibleAnswers.
	public String getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(String possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	// An empty constructor for answers.
	public Answer() {

	}

	// Constructor for Answers.
	public Answer(String possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

}
