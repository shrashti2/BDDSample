@Functional
Feature: CRM ModuleOne Feature
Background: User Login
  Given user logged in
@Regression 
  Scenario: Create a new contact
    When create Contact is clicked
@Regression
 Scenario: Update a contact
        When update Contact is clicked
@Regression @Smoke
  Scenario: Create a new Companies
      When create Companies is clicked
 @Regression   
     Scenario: Update a Companies
     When update Companies is clicked
@Smoke      
     Scenario: Create a new Deals
      When create Deals is clicked
    
     Scenario: Update a Deals
    When update Deals is clicked
    
     Scenario: Logout
    Given user logged out
