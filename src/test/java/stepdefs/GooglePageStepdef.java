package stepdefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepdef {
	WebDriver driver;
		@Given("I Launch google page")
		public void i_launch_google_page() {
			WebDriverManager.chromedriver().setup();
			driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
		}
	
		@When("I search Java Tutorial")
		public void i_search_java_tutorial() {
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Java Tutorial");
			searchBox.submit();
		 
		}
		@Then("Should display Java result page")
		public void should_display_java_result_page() {
			Assert.assertEquals("Java Tutorial - Google Search", driver.getTitle());
			
		    
		}
		@Then("Close the Browser")
		public void close_the_browser() {
			driver.close();
			System.out.println("Updated by user 2");
		}
	
		@When("I search Selenium Tutorial")
		public void i_search_selenium_tutorial() {
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium Tutorial");
			searchBox.submit();
			   
			}

		@Then("Should display Selenium result page")
		public void should_display_selenium_result_page() {
			Assert.assertEquals("Selenium Tutorial - Google Search", driver.getTitle());
			}

@After
public void teardown(Scenario scenario) throws IOException
{
	if(scenario.isFailed()) {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", "image1");
	}
}



}
