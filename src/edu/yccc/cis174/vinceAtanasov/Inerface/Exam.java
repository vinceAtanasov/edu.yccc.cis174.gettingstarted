package edu.yccc.org.cis174.vinceAtanasov.Interface;

import java.util.List;

public interface Exam {
	public List<Question> loadQuestions();

	public List<Answer> loadAnswers();

	public List<Answer> loadCorrectAnswers();

	public float calculateGrade();
}