package edu.yccc.cis174.vinceAtanasov.Validator;

/**
 * 
 * @author Vince This validator assures that all docker images come from a
 *         repository in our domain.
 */

public class RepoValidator implements Validator {

	String errorMesagge;
	String app;
	int severiry;

	@Override
	public void validate() {
		String image = app.substring(app.indexOf(":") + 1, app.indexOf(" "));
		if (!image.startsWith("repo.lm.com")) {
			errorMesagge = "The image is not stored in an LM repo";
			severiry = 2;
		} else {
			errorMesagge = "looks good";
		}

	}

	@Override
	public String getValidationErrorMessage() {

		return errorMesagge;
	}

	@Override
	public int getSeverity() {

		return severiry;
	}

	@Override
	public void setApp(String app) {
		this.app = app;

	}

}
