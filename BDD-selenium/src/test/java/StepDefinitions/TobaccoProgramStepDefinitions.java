package StepDefinitions;


import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TobaccoProgramPage;
import utils.DriverFactory;
import org.testng.Assert;

public class TobaccoProgramStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private TobaccoProgramPage tobaccoProgramPage = new TobaccoProgramPage(driver);

    @When("the user hovers over Programs menu")
    public void the_user_hovers_over_programs_menu() {
        homePage.hoverProgramsMenu();
    }

    @When("clicks on Tobacco program")
    public void clicks_on_tobacco_program() {
        homePage.clickQuitTobacco();
    }

    @Then("the Tobacco Program page should be displayed")
    public void the_tobacco_program_page_should_be_displayed() {
        Assert.assertTrue(driver.getTitle().contains("Tobacco"), "Tobacco Program page not displayed.");
        System.out.println("✅ Reached Tobacco Program page");
    }

    @When("the user clicks on Quit Tobacco Read More")
    public void the_user_clicks_on_quit_tobacco_read_more() {
        tobaccoProgramPage.clickQuitTobaccoReadMore();
    }

    @Then("the Quit Tobacco page should be verified")
    public void the_quit_tobacco_page_should_be_verified() {
        Assert.assertTrue(driver.getTitle().contains("Quit Tobacco"), "Quit Tobacco page not displayed.");
        System.out.println("✅ Quit Tobacco Page Verified");
    }
}
