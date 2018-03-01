package edu.yccc.cis174.vinceAtanasov.Inerface;

public class Answer {
	private String possibleAnswer;
	private String correctAnswer;
	private String userAnswer;

	public Answer() {

	}

	public Answer(String possibleAnswer, String correctAnswer, String userAnswer) {
		this.possibleAnswer = possibleAnswer;
		this.correctAnswer = correctAnswer;
		this.userAnswer = userAnswer;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public String getPossibleAnswer() {
		return possibleAnswer;
	}

	public void setPossibleAnswer(String possibleAnswer) {
		this.possibleAnswer = possibleAnswer;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String toString() {
		return this.possibleAnswer;
	}

}
