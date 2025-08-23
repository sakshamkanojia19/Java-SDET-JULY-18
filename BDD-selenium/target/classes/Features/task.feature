



#tags are small use tags just like groups in testng
##Scenario Outline: Verify the login functionality for multiple credentials
 # Given User is on the login page
 # When user enters the "<username>" and "<password>"
 # And user clicks on the login button	
 # Then user is navigated to home page 

 #Examples:
  #  | username | password |
  #  | Admin    | admin123 |
  #  | Admin    | admin123 |
  #  | Admin    | admin123 |
  #  | Admin    | saksham  |
  #  | Saksham  | Kanojia  |