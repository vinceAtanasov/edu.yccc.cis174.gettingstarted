package edu.yccc.cis174.vinceAtanasov.JavaExam;

/**
 * 
 * @author Vince
 *
 */
public class Questions {

	private String qustion;
	private String possibleAnswers;

	public String getQustion() {
		return qustion;
	}

	public void setQustion(String qustion) {
		this.qustion = qustion;
	}

	public String getPossibleAnswer() {
		return possibleAnswers;
	}

	public void setPossibleAnswer(String answer) {
		this.possibleAnswers = answer;
	}

	public Questions(String qustion, String possibleAnswers) {
		this.qustion = qustion;
		this.possibleAnswers = possibleAnswers;
	}

	public Questions() {

	}

}
