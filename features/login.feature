
Feature: Login feature
  Validating login feature test cases

 @Regression
  Scenario: Validate valid username and password
  Given user is on login page 
  When user enters valid username"Testing@gmail.com"
   And user enters valid password"P2333"
  And clicks on submit button
 
 
@smoke
Scenario Outline: Validate the valid username and password with mulitiple username
   Given user is on login page 
  When user enters valid Pusername"<username>"
   And user enters valid Ppassword"<password>"
  And clicks on submit button

    Examples: 
      | username  | password |
      | Testing@gmail.com|P23222 |
      | Nareshit@gmail.com |P2ss234 |