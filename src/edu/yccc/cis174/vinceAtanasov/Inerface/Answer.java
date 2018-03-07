package edu.yccc.cis174.vinceAtanasov.Inerface;

public class Answer {
	private String possibleAnswer;

	public Answer() {

	}

	public Answer(String possibleAnswer) {
		this.possibleAnswer = possibleAnswer;

	}

	public String getPossibleAnswer() {
		return possibleAnswer;
	}

	public void setPossibleAnswer(String possibleAnswer) {
		this.possibleAnswer = possibleAnswer;
	}

	public String toString() {
		return this.possibleAnswer;
	}

}
