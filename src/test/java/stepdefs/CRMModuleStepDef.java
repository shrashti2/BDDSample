package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMModuleStepDef {
	@Before(order = 2)
//	@BeforeStep
//	@Befroe(@Regression)
	public void launchChrome()
	{ System.out.println("Init Chrome Browser");}
	
	@Before(order = 3)
	public void setupDB()
	{ System.out.println("DB Setup");}
	
	@Before(order = 1)
	public void readProperty()
	{ System.out.println("read from property file");}
	
	@Given("user logged in")
		public void user_logged_in() {
		System.out.println("User logged in"); 
		
		}

		@When("create Contact is clicked")
		public void create_contact_is_clicked() {
			System.out.println("Create Contact is clicked"); 
	
		}
		

		@When("update Contact is clicked")
		public void update_contact_is_clicked() {
			System.out.println("Update Contact is clicked"); 
		
		}

		@When("create Companies is clicked")
		public void create_companies_is_clicked() {
			System.out.println("Create Companies is clicked"); 
	
		}

		@When("update Companies is clicked")
		public void update_companies_is_clicked() {
			System.out.println("Update Companies is clicked"); 

		}

		@When("create Deals is clicked")
		public void create_deals_is_clicked() {
			System.out.println("Create Deal is clicked"); 

		}

		@When("update Deals is clicked")
		public void update_deals_is_clicked() {
			System.out.println("Update Deal is clicked"); 
	
		}

		@Given("user logged out")
		public void user_logged_out() {
			System.out.println("User Logged out"); 
		
		}
		
		@When("create Task is clicked")
		public void create_task_is_clicked() {
			System.out.println("Create Task is clicked"); 
		}

	
			@When("create Cases is clicked")
			public void create_cases_is_clicked() {
				System.out.println("Create Cases is clicked"); 
			
			}

			@After
	//		@AfterStep
			public void teardown()
			{ System.out.println("Browser Closed");}



}
