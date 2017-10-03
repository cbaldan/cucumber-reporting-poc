package stepdef;

import cucumber.api.java.en.Then;

public class StepDefClass {

	@Then("^This step is run$")
	public void this_step_is_run() throws Throwable {
	}

	@Then("^This step fails$")
	public void this_step_fails() throws Throwable {
		throw new RuntimeException();
	}

}
