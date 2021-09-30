#Author
#date and description

Feature: feature to test login frunctionality
  
  
  Scenario: check login is succesful with valid credentials
  
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  
