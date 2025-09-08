package StepDefinitions;


import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;
import org.testng.Assert;

public class SearchStepDefinitions {
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);

    @When("the user searches for {string}")
    public void the_user_searches_for(String searchText) {
        homePage.performSearch(searchText);
    }

    @Then("the search results page should be displayed")
    public void the_search_results_page_should_be_displayed() {
        Assert.assertTrue(driver.getCurrentUrl().contains("s="), "Search results page not displayed. Current URL: " + driver.getCurrentUrl());
        System.out.println("✅ Search executed. Current URL: " + driver.getCurrentUrl());
    }
}

