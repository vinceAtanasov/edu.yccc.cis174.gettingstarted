package edu.yccc.cis174.vinceAtanasov.Validator;

import java.util.ArrayList;
import java.util.List;

public class TestValidation {

	List<Validator> validators = new ArrayList<Validator>();

	public void loadValidators() {
		validators.clear();
		validators.add(new HAValidator());
		validators.add(new RepoValidator());
	}

	public void runValidation() {

		List<String> tests = new ArrayList<String>();
		tests.add("images:tomcat replicas:1");
		tests.add("images:repo.lm.com/tomcat replicas:1");
		for (String test : tests) {
			loadValidators();
			for (Validator v : validators) {

				v.setApp(test);
				v.validate();
				System.out.println("Message: " + v.getValidationErrorMessage());
				System.out.println("Severity: " + v.getSeverity());
			}
		}
	}

	public static void main(String[] args) {

		TestValidation vc = new TestValidation();
		vc.loadValidators();
		vc.runValidation();

	}

}
