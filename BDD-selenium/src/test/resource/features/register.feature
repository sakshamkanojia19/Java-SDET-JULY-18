Feature: Student Registration functionality

  Background:
    Given the user is on the registration page

   @Sanity @positive
  Scenario: Successful registration with valid credentials - Test 1
    When the user enters name "Saksham kanojia"
    And the user enters email "sakshamkanojia20@gmail.com"
    And the user selects gender "male"
    And the user enters mobile "9310244556"
    And the user enters date of birth "09/19/2002"
    And the user enters subjects "Physics, Maths, Bio, Aerospace"
    And the user selects hobbies "Sports, Reading"
    And the user uploads picture "/home/ubuntu/automation_project/src/test/resources/testdata/sample_image.jpg"
    And the user enters address "16/5 Ms Ext Rama Park Mohan Garden Dwarka Mor New Delhi 11"
    And the user selects state "NCR"
    And the user selects city "Agra"
    And the user clicks on submit button
    Then the registration should be successful

   @Sanity @positive
  Scenario: Successful registration with valid credentials - Test 2
    When the user enters name "Priya kanojia"
    And the user enters email "sakshamkanojia20@gmail.com"
    And the user selects gender "female"
    And the user enters mobile "93102455645"
    And the user enters date of birth "09/19/2002"
    And the user enters subjects "Physics, Maths, Bio, Aerospace"
    And the user selects hobbies "Sports, Reading, Music"
    And the user uploads picture "/home/ubuntu/automation_project/src/test/resources/testdata/sample_image.jpg"
    And the user enters address "dwarka"
    And the user selects state "NCR"
    And the user selects city "Meerut"
    And the user clicks on submit button
    Then the registration should be successful

  @regression
  Scenario Outline: Verify registration functionality with multiple data sets
    When the user enters name "<name>"
    And the user enters email "<email>"
    And the user selects gender "<gender>"
    And the user enters mobile "<mobile>"
    And the user enters date of birth "<dob>"
    And the user enters subjects "<subjects>"
    And the user selects hobbies "<hobbies>"
    And the user uploads picture "<picture>"
    And the user enters address "<address>"
    And the user selects state "<state>"
    And the user selects city "<city>"
    And the user clicks on submit button
    Then the registration should be successful

    Examples:
      | name           | email                      | gender | mobile      | dob        | subjects                      | hobbies           | picture                                                                    | address                                                | state | city   |
      | Saksham kanojia| sakshamkanojia20@gmail.com | male   | 9310244556  | 09/19/2002 | Physics, Maths, Bio, Aerospace| Sports, Reading   | /home/ubuntu/automation_project/src/test/resources/testdata/sample_image.jpg | 16/5 Ms Ext Rama Park Mohan Garden Dwarka Mor New Delhi 11 | NCR   | Agra   |
      | Priya kanojia  | sakshamkanojia20@gmail.com | female | 93102455645 | 09/19/2002 | Physics, Maths, Bio, Aerospace| Sports, Reading, Music | /home/ubuntu/automation_project/src/test/resources/testdata/sample_image.jpg | dwarka                                                 | NCR   | Meerut |

  @negative
  Scenario: Registration with missing required fields
    When the user enters name ""
    And the user enters email ""
    And the user enters mobile ""
    And the user clicks on submit button
    Then the registration should fail with error message

  @negative
  Scenario: Registration with invalid email format
    When the user enters name "Test User"
    And the user enters email "invalid-email"
    And the user selects gender "male"
    And the user enters mobile "1234567890"
    And the user clicks on submit button
    Then the registration should fail with error message

  @negative
  Scenario: Registration with invalid mobile number
    When the user enters name "Test User"
    And the user enters email "test@example.com"
    And the user selects gender "male"
    And the user enters mobile "123"
    And the user clicks on submit button
    Then the registration should fail with error message

