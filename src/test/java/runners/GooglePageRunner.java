package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "." //(for taking all the which has .feature extension, used while running the entire suit)
		features = "src//test//resources//features//googlesearch.feature",
		glue = {"stepdefs"},
	//	dryRun = true //(for checking if all the step definitions are included) 
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", 
	//			"html:target/reports/report.html",
	//			"usage:target/reports/usagereport",
	//			"json:target/reports/jsonreport.json",
	//			"junit:target/reports/junitreport.xml",
	//			"rerun:target//failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
		)
public class GooglePageRunner {

}
