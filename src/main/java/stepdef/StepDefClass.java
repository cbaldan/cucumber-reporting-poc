package stepdef;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Then;

public class StepDefClass {

	private static final Logger LOGGER = Logger.getLogger(StepDefClass.class);

	@Then("^This step is run$")
	public void this_step_is_run() throws Throwable {
		LOGGER.info("The one step was run");
	}

}
