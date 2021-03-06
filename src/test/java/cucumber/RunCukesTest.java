package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		plugin = { "pretty",
	    "json:target/cucumber.json" },
				 	glue = "stepdef",
				 	monochrome=true
		)

public class RunCukesTest {
}