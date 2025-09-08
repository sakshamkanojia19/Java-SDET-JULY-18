package StepDefinitions;


import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;
import org.testng.Assert;

public class HomePageNavigationStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);

    @When("the user clicks on Health Insurance Navigation")
    public void the_user_clicks_on_health_insurance_navigation() {
        homePage.clickElementByText("Health Insurance Navigation");
    }

    @Then("the Health Insurance Navigation page should be displayed")
    public void the_health_insurance_navigation_page_should_be_displayed() {
        Assert.assertTrue(driver.getTitle().contains("Health Insurance Navigation"), "Health Insurance Navigation page not displayed.");
        System.out.println("✅ Navigated to Health Insurance Navigation");
    }

    @When("the user clicks on AHEC Scholars from the home page")
    public void the_user_clicks_on_ahec_scholars_from_the_home_page() {
        homePage.scrollToElement(org.openqa.selenium.By.xpath("//h2[normalize-space()=\'AHEC SCHOLARS\']"));
        homePage.clickElementByText("AHEC SCHOLARS");
    }

    @Then("the AHEC Scholars page should be displayed")
    public void the_ahec_scholars_page_should_be_displayed() {
        Assert.assertTrue(driver.getTitle().contains("AHEC Scholars"), "AHEC Scholars page not displayed.");
        System.out.println("✅ Navigated to AHEC Scholars");
    }
}

