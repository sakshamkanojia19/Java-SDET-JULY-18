package StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HealthyAgingProgramPage;
import utils.DriverFactory;
import org.testng.Assert;

public class HealthyAgingProgramStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private HealthyAgingProgramPage healthyAgingProgramPage = new HealthyAgingProgramPage(driver);

    @When("the user clicks on Healthy Aging program")
    public void the_user_clicks_on_healthy_aging_program() {
        homePage.hoverProgramsMenu();
        homePage.clickHealthyAging();
    }

    @Then("the Healthy Aging page should be displayed")
    public void the_healthy_aging_page_should_be_displayed() {
        Assert.assertTrue(healthyAgingProgramPage.getPageTitle().equalsIgnoreCase("Healthy Aging"),
                "Expected 'Healthy Aging' page but found: " + healthyAgingProgramPage.getPageTitle());
    }

    @When("the user fills the Healthy Aging form with details: {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_the_healthy_aging_form_with_details(String firstName, String lastName, String phone, String email, String occupation, String comments) {
        healthyAgingProgramPage.fillForm(firstName, lastName, phone, email, occupation, comments);
    }

    @When("the user submits the Healthy Aging form")
    public void the_user_submits_the_healthy_aging_form() {
        healthyAgingProgramPage.submitForm();
    }

    @Then("the Healthy Aging form should be submitted successfully")
    public void the_healthy_aging_form_should_be_submitted_successfully() {
        Assert.assertTrue(healthyAgingProgramPage.getSuccessMessage().contains("TAI CHI FOR ARTHRITIS"), "Healthy Aging form submission failed.");
        System.out.println("✅ Healthy Aging Form Submitted Successfully");
    }
}
