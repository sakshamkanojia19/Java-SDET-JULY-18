Feature: Login Functionality
 
#Background: Given User is on the login page 
#and its common for every secinario use given in background
 
 
 #For positve tes cases
@regression
Scenario: Verify the login functionality for valid credentials
  Given User is on the login page
  When user enters the username
  And user enters the password
  And user clicks on the login button
  Then user is navigated to home page 


#2nd for Negative testcases
#@regression @negative
#Scenario: Verify the login functionality for invalid password
 # Given User is on the login page
 # When user enters the username
 # And user enters invalid password
 # And user clicks on the login button
 # Then user sees an error message
  

#for +e and -ve cases generate ss on failed case 
 
@sanity
Scenario Outline: Verify the login functionality for multiple credentials
  Given User is on the login page
  When user enters the "<username>" and "<password>"
  And user clicks on the login button	
  Then user is navigated to home page 

 Examples:
    | username | password |
    | Admin    | admin123 |
    | Admin    | admin123 |
    | Admin    | admin123 |
    | Admin    | saksham  |
    | Saksham  | Kanojia  |
  
  
  #For diffrenttiate negative and postive 
  
  
 
  
#  Feature: Login Functionality

 # @regression
  #Scenario: Verify the login functionality for valid credentials
   # Given User is on the login page
    #When user enters the username
   # And user enters the password
    #And user clicks on the login button
    #Then user is navigated to home page 

  #@negative
  #Scenario: Verify the login functionality for invalid credentials
   # Given User is on the login page
   # When user enters the "Admin" and "wrongpass"
   # And user clicks on the login button
   # Then an error message is displayed

#  @sanity
 # Scenario Outline: Verify the login functionality for multiple credentials
  #  Given User is on the login page
   # When user enters the "<username>" and "<password>"
    #And user clicks on the login button
   # Then user is navigated to home page 

    #Examples:
     # | username | password  |
     # | Admin    | admin123  |
     # | Admin    | wrongpass |
     # | Wrong    | admin123  |
      
      
      
 # for data table feature file : 
 
 #@sanity
#Scenario: Login with multiple users
#	 Given User is on the login page
#	 When user enters credentials
   #   | username | password  |
  #    | Admin    | admin123  |  
  # And user clicks on the login button	
#	Then user is naqvigated to home page     
      
