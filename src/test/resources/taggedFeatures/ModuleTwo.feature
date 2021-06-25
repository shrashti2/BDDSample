@EndtoEnd
Feature: CRM ModuleTwo Feature

@Smoke  
  Scenario: Create a new Task
    Given user logged in
    When create Task is clicked
@Regression
 Scenario: Create a new Cases
    Given user logged in
      When create Cases is clicked