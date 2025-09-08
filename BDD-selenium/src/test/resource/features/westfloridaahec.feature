Feature: West Florida AHEC Website Functionality

  @Sanity
  Scenario: Verify website title and basic navigation
    Given the user is on the West Florida AHEC home page
    Then the website title should contain "West Florida"

  @Sanity @Regression
  Scenario Outline: Search functionality and navigation back
    Given the user is on the West Florida AHEC home page
    When the user searches for "<searchText>"
    Then the search results page should be displayed
    And the user navigates back to the home page
    Then the website title should contain "West Florida"
    Examples:
      | searchText |
      | programs   |
      | health     |

  @Regression
  Scenario: My Account page access and registration attempt
    Given the user is on the West Florida AHEC home page
    When the user clicks on My Account
    Then the My Account page should be displayed
    When the user registers with username "TestUser", email "test@example.com", and password "Test@123"
    Then the registration should be successful

  @Regression
  Scenario: Home page navigation to Health Insurance Navigation
    Given the user is on the West Florida AHEC home page
    When the user clicks on Health Insurance Navigation
    Then the Health Insurance Navigation page should be displayed
    And the user navigates back to the home page

  @Regression
  Scenario: Home page navigation to AHEC Scholars from home page section
    Given the user is on the West Florida AHEC home page
    When the user clicks on AHEC Scholars from the home page
    Then the AHEC Scholars page should be displayed
    And the user navigates back to the home page

  @Regression
  Scenario: Navigate to and verify Tobacco Program page
    Given the user is on the West Florida AHEC home page
    When the user hovers over Programs menu
    And clicks on Tobacco program
    Then the Tobacco Program page should be displayed
    When the user clicks on Quit Tobacco Read More
    Then the Quit Tobacco page should be verified
    And the user navigates back to the home page
    And the user navigates back to the home page

  @Regression
  Scenario: Fill and submit Healthy Aging Program form
    Given the user is on the West Florida AHEC home page
    When the user clicks on Healthy Aging program
    Then the Healthy Aging page should be displayed
    When the user fills the Healthy Aging form with details: "John", "Doe", "1234567890", "john.doe@example.com", "Engineer", "This is a test comment."
    And the user submits the Healthy Aging form
    Then the Healthy Aging form should be submitted successfully
    And the user navigates back to the home page
    And the user navigates back to the home page

  @Regression
  Scenario: Fill and submit AHEC Scholars Program form
    Given the user is on the West Florida AHEC home page
    When the user clicks on AHEC Scholars program from Programs menu
    Then the AHEC Scholars page should be displayed
    When the user clicks on the Apply link
    And the user fills the AHEC Scholars application form with details: "Jane", "Doe", "01/01/2000", "123 Main St", "Anytown", "12345", "123 Main St", "Anytown", "12345", "0987654321", "jane.doe@example.com", "12/31/2025", "Dean's List", "Online Search", "My essay content", "/path/to/dummy.pdf"
    And the user submits the AHEC Scholars application form
    Then the AHEC Scholars application form should be submitted successfully
    And the user navigates back to the home page

  @Regression
  Scenario: Fill and submit Covering Florida Program form
    Given the user is on the West Florida AHEC home page
    When the user clicks on Covering Florida program
    When the user fills the Covering Florida form with zip code "32536", miles away 2, and language 1
    Then the Covering Florida form should be submitted successfully
    And the user navigates back to the home page

  @Regression
  Scenario: Navigate to Community Based Student Education and Training page
    Given the user is on the West Florida AHEC home page
    When the user hovers over Services menu
    And clicks on "Community Based Student Education and Training"
    Then the website title should contain "Community Based Student Education and Training"
    And the user navigates back to the home page

  @Regression
  Scenario: Navigate to Continuing Education page
    Given the user is on the West Florida AHEC home page
    When the user hovers over Services menu
    And clicks on "Continuing Education"
    Then the website title should contain "Continuing Education"
    And the user navigates back to the home page


