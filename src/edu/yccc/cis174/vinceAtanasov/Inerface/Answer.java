package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.util.ArrayList;
import java.util.List;

public class Answer {
	private String possibleAnswer;
	private String correctAnswer;
	public List<Answer> possibleAnswers = new ArrayList<Answer>();
	public List<Answer> correctAnswers = new ArrayList<Answer>();

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

	public List<Answer> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(List<Answer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public List<Answer> getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(List<Answer> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public Answer() {

	}

	public Answer(String possibleAnswer, String correctAnswer, List<Answer> possibleAnswers,
			List<Answer> correctAnswers) {
		this.possibleAnswer = possibleAnswer;
		this.correctAnswer = correctAnswer;
		this.possibleAnswers = possibleAnswers;
		this.correctAnswers = correctAnswers;
	}

}
