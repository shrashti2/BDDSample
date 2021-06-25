
Feature: CRM Login

#  Scenario: Valid Login Scenario
#     Given User is already on login page
#     When User enters login credential
#     Then User is on Home Page
#     Then Close Browser

#      Scenario: Valid Login Scenario
#    Given User is already on login page
 #  When User enters "shrashtisingh@gmail.com" and "Shrashti"
 #  Then User is on Home Page
#   Then Close Browser
 
#    Scenario Outline: Valid Login Scenario
#   Given User is already on login page
#   When User enters "<username>" and "<password>"
#   Then User is on Home Page
#   Then Close Browser 
   
#   Examples:
#   |username|password|
#   |testuser1 | welcome123|
#   |shrashtisingh@gmail.com | Shrashti |
   
   Scenario: Valid Login Scenario
   Given User is already on login page
   When User enters login credential
   |username| password|
   |shrashtisingh@gmail.com | Shrashti|
   
   Then User is on Home Page
   Then Close Browser 