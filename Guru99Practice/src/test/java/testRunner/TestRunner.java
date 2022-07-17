package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//features/LoginPage.feature",
		glue= {"stepDefination"},
		monochrome=true,
		dryRun=true,
		plugin= {"pretty","html:test-output"},
		tags= {"regression"})
		
public class TestRunner {

}
