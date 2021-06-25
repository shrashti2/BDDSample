package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class CRMTestStepDef {

	WebDriver driver;
		@Given("User is already on login page")
		public void user_is_already_on_login_page() {
			WebDriverManager.chromedriver().setup();
			driver =  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.navigate().to("https://ui.cogmento.com/");
		}

		// for scenario outline 		
//		@When("User enters {string} and {string}")
//		public void user_enters_login_credential(String strUser, String strPwd) {
//		driver.findElement(By.name("email")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.xpath( "//div[@class='ui fluid large blue submit button']")).click();
		

		// for data table without the column name fetching as a list
//		@When("User enters login credential")
//		public void user_enters_login_credential(DataTable userCred) {
//			List<List<String>> data = userCred.asLists();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.xpath( "//div[@class='ui fluid large blue submit button']")).click();
		
		// for data table fetching as a Map
//		@When("User enters login credential")
//		public void user_enters_login_credential(DataTable userCred) {
//			List<Map<String, String>> data = userCred.asMaps();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
//		driver.findElement(By.xpath( "//div[@class='ui fluid large blue submit button']")).click();
		
		// Using java Domain Object
		@When("User enters login credential")
		public void user_enters_login_credential(DataTable userCred) {
			List<Map<String, String>> data = userCred.asMaps();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.xpath( "//div[@class='ui fluid large blue submit button']")).click();
		
		}
		@Then("User is on Home Page")
		public void user_is_on_home_page() {
			boolean isValid = driver.findElement(By.className("user-display")).isDisplayed();
			Assert.assertTrue(isValid);
		}
		@Then("Close Browser")
		public void close_browser() {
			driver.close();

		}



}
