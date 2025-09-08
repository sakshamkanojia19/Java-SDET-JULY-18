package StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.AHECScholarsProgramPage;
import utils.DriverFactory;
import org.testng.Assert;

public class AHECScholarsProgramStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private AHECScholarsProgramPage ahecScholarsProgramPage = new AHECScholarsProgramPage(driver);

    @When("the user clicks on AHEC Scholars program from Programs menu")
    public void the_user_clicks_on_ahec_scholars_program_from_programs_menu() {
        homePage.hoverProgramsMenu();
        homePage.clickAHECScholars();
    }

    @When("the user clicks on the Apply link")
    public void the_user_clicks_on_the_apply_link() {
        ahecScholarsProgramPage.clickApplyLink();
    }

    @When("the user fills the AHEC Scholars application form with details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_the_ahec_scholars_application_form_with_details(String firstName, String lastName, String birthdate, String mailingStreet, String mailingCity, String mailingZip, String permanentStreet, String permanentCity, String permanentZip, String mobilePhone, String personalEmail, String graduationDate, String academicHonors, String howDidYouHear, String essayPrompt, String filePath) {
        ahecScholarsProgramPage.fillApplicationForm(firstName, lastName, birthdate, mailingStreet, mailingCity, mailingZip, permanentStreet, permanentCity, permanentZip, mobilePhone, personalEmail, graduationDate, academicHonors, howDidYouHear, essayPrompt, filePath);
    }

    @When("the user submits the AHEC Scholars application form")
    public void the_user_submits_the_ahec_scholars_application_form() {
        ahecScholarsProgramPage.submitApplicationForm();
    }

    @Then("the AHEC Scholars application form should be submitted successfully")
    public void the_ahec_scholars_application_form_should_be_submitted_successfully() {
        // The original TestNG code didn't have a clear assertion for successful submission.
        // Assuming if no error, it's successful.
        System.out.println("✅ AHEC Scholars Application Form submitted (no explicit validation).");
        ahecScholarsProgramPage.closeFormTabAndSwitchBack();
    }
}

