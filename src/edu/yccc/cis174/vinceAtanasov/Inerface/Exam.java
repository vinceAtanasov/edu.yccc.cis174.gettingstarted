package edu.yccc.cis174.vinceAtanasov.Inerface;

import java.util.List;

public interface Exam {
	public List<Question> loadQuestions();

	public List<Answer> loadAnswers();

	public List<Answer> loadCorrectAnswers();

	public float calculateGrade();
}