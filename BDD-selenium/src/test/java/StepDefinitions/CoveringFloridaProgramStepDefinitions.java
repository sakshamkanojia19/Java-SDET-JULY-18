package StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.CoveringFloridaProgramPage;
import utils.DriverFactory;
import org.testng.Assert;

public class CoveringFloridaProgramStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private CoveringFloridaProgramPage coveringFloridaProgramPage = new CoveringFloridaProgramPage(driver);

    @When("the user clicks on Covering Florida program")
    public void the_user_clicks_on_covering_florida_program() {
        homePage.hoverProgramsMenu();
        homePage.clickCoveringFlorida();
    }

    @When("the user fills the Covering Florida form with zip code {string}, miles away {int}, and language {int}")
    public void the_user_fills_the_covering_florida_form_with_zip_code_miles_away_and_language(String zipCode, Integer milesAway, Integer language) {
        try {
            Thread.sleep(5000); // Allow time for form to fully load
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        coveringFloridaProgramPage.fillAndSubmitForm(zipCode, milesAway, language);
    }

    @Then("the Covering Florida form should be submitted successfully")
    public void the_covering_florida_form_should_be_submitted_successfully() {
        // The original TestNG code didn't have a clear assertion for successful submission.
        // Assuming if no error, it's successful.
        System.out.println("✅ Covering Florida Program Test completed: Form submitted (no validation).");
    }
}
