Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "admin" and password "admin123"
    And the user clicks on login button
    Then the user should be navigated to the home page

    
    #can we try for multiple entires using examples and entries