//package StepDefinations;
//
//import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import pages.loginpage;
//import utils.DriverFactory;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class StepDefinations_pg {
//
//    WebDriver driver = DriverFactory.getDriver();
//    loginpage lp = new loginpage(driver);
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//    @Given("the user is on the login page")
//    public void the_user_is_on_the_login_page() {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        wait.until(ExpectedConditions.titleContains("OrangeHRM"));
//    }
//
//    @When("the user enters username {string} and password {string}")
//    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
//        lp.enterCredentials(username, password);
//    }
//
//    @When("the user clicks on login button")
//    public void the_user_clicks_on_login_button() {
//        lp.clickLogin();
//    }
//
//    @Then("the user should be navigated to the home page")
//    public void the_user_should_be_navigated_to_the_home_page() {
//        wait.until(ExpectedConditions.urlContains("/dashboard"));
//        String title = lp.getPageTitle();
//
//        if (!title.contains("OrangeHRM")) {
//            throw new AssertionError("❌ Login failed! Expected title to contain 'OrangeHRM' but got: " + title);
//        }
//        System.out.println("✅ Login successful, user is on Home Page.");
//    }
//}
package StepDefinitions;


