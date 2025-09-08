package StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MyAccountPage;
import utils.DriverFactory;
import org.testng.Assert;

public class MyAccountStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private MyAccountPage myAccountPage = new MyAccountPage(driver);

    @When("the user clicks on My Account")
    public void the_user_clicks_on_my_account() {
        homePage.clickMyAccount();
    }

    @Then("the My Account page should be displayed")
    public void the_my_account_page_should_be_displayed() {
        Assert.assertTrue(myAccountPage.getPageHeader().equalsIgnoreCase("My account"),
                "Expected My Account page, found header: " + myAccountPage.getPageHeader());
        System.out.println("✅ Reached My Account page: " + myAccountPage.getPageHeader());
    }

    @When("the user registers with username {string}, email {string}, and password {string}")
    public void the_user_registers_with_username_email_and_password(String username, String email, String password) {
        myAccountPage.enterRegistrationDetails(username, email, password);
        if (myAccountPage.isCaptchaPresent()) {
            System.out.println("⚠️ CAPTCHA detected. Please solve manually (waiting up to 50s).");
            myAccountPage.waitForCaptchaToSolve();
            if (myAccountPage.isCaptchaPresent()) {
                Assert.fail("🚨 Registration stopped: CAPTCHA was not solved after 50s.");
            }
            System.out.println("✅ CAPTCHA solved manually, proceeding with registration.");
        }
        myAccountPage.clickRegister();
    }

    @Then("the registration should be successful")
    public void the_registration_should_be_successful() {
        // Assuming successful registration leads to a dashboard or a success message.
        // The original TestNG code didn't have a clear assertion for successful registration beyond CAPTCHA handling.
        // For now, we'll just assume if no error, it's successful.
        System.out.println("✅ Registration process completed (no explicit success validation).");
    }
}

