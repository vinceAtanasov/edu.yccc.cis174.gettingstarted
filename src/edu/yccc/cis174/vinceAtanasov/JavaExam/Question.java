package edu.yccc.cis174.vinceAtanasov.JavaExam;

/**
 * 
 * @author Vince
 *
 */
public class Question{
	// Creating variable question.
	private String qustion;

	// Getter and setter for the variable question.
	public String getQustion() {
		return qustion;
	}

	public void setQustion(String qustion) {
		this.qustion = qustion;
	}

	// Constructor for questions.
	public Question(String qustion) {
		this.qustion = qustion;
	}

	// An empty constructor.
	public Question() {

	}

	// Overriding the toString method.
	public String toString() {
		return this.qustion;
	}

}
