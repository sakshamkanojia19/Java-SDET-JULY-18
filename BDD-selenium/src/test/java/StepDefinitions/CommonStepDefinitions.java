package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;
import org.testng.Assert;

public class CommonStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);

    @Given("the user is on the West Florida AHEC home page")
    public void the_user_is_on_the_west_florida_ahec_home_page() {
        homePage.navigateToHomePage("https://westfloridaahec.org/");
    }

    @Then("the website title should contain {string}")
    public void the_website_title_should_contain(String expectedTitlePart) {
        String title = homePage.getPageTitle();
        Assert.assertTrue(title != null && title.toLowerCase().contains(expectedTitlePart.toLowerCase()),
                "Website title did not contain expected text: " + expectedTitlePart + ", Actual title: " + title);
        System.out.println("✅ Website title verified: " + title);
    }

    @Given("the user navigates back to the home page")
    public void the_user_navigates_back_to_the_home_page() {
        homePage.navigateBack();
    }
}