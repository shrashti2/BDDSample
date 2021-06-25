package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target//failed_scenarios.txt",
		glue = {"stepdefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)
public class RerunTest {

}
