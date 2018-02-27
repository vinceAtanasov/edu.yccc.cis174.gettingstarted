package edu.yccc.org.cis174.vinceAtanasov.Interface;

import java.util.ArrayList;
import java.util.List;

public class Question {
	private String question;
	public List<Question> questions = new ArrayList<Question>();
	
	public Question() {
		
	}
	
	public Question(String question, List<Question> questions) {
		this.question = question;
		this.questions = questions;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
