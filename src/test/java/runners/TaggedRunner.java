package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src//test//resources//taggedFeatures//",
		glue = {"stepdefs"},
		dryRun = false,
		monochrome = true,
//		tags = "@Regression"
//		tags = "@Regression or @Smoke"
//		tags = "@Regression and @Smoke"
//		tags = "@Regression and not @Smoke"
//		tags = "@EndtoEnd and @Regression"
//		tags = "@Regression and not @EndtoEnd"
		tags = "@Functional"
//		tags = "@Functional and not @Regression and not @Smoke"
	)
public class TaggedRunner {

}
