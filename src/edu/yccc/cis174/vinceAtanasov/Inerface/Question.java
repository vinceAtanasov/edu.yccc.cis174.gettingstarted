package edu.yccc.cis174.vinceAtanasov.Inerface;

public class Question {
	private String question;

	public Question() {

	}

	public Question(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String toString() {
		return this.question;
	}

}
