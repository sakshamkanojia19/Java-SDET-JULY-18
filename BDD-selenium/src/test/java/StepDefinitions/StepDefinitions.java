//package StepDefinations;
//
//
////package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class StepDefinations {
//
//    private WebDriver driver;
//
//    // --- tiny helper so we don't have to throw InterruptedException everywhere ---
//    private void sleep(long ms) {
//        try {
//            Thread.sleep(ms);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            throw new RuntimeException(e);
//        }
//    }
//
//    // simple polling using only Thread.sleep (no WebDriverWait)
//    private void waitForUrlContains(String part, long timeoutMs) {
//        long end = System.currentTimeMillis() + timeoutMs;
//        while (System.currentTimeMillis() < end) {
//            if (driver.getCurrentUrl().contains(part)) return;
//            sleep(500);
//        }
//        throw new AssertionError("Expected URL to contain: " + part + " but was: " + driver.getCurrentUrl());
//    }
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() {
//        ChromeOptions options = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        // give the page plenty of time to settle
//        sleep(4000);
//    }
//
//    @When("user enters the username")
//    public void user_enters_the_username() {
//        // small pause to ensure field is interactable
//        sleep(1000);
//        WebElement username = driver.findElement(By.name("username"));
//        username.clear();
//        username.sendKeys("Admin");
//
//        // extra pause because you mentioned it wasn't moving to password
//        sleep(2000);
//    }
//
//    @When("user enters the password")
//    @When("user enters teh password") // supports the original typo as well
//    public void user_enters_the_password() {
//        sleep(1000);
//        WebElement password = driver.findElement(By.name("password")); // correct locator
//        password.clear();
//        password.sendKeys("admin123");
//        sleep(1500);
//    }
//
//    @When("user clicks on the login button")
//    public void user_clicks_on_the_login_button() {
//        sleep(1000);
//        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); // correct locator type
//        loginButton.click();
//        // give time for navigation
//        sleep(3000);
//    }
//
//    @Then("user is navigated to home page")
//    @Then("user is naqvigated to home page") // supports original typo
//    public void user_is_navigated_to_home_page() {
//        // Poll with Thread.sleep only (no WebDriverWait)
//        waitForUrlContains("/dashboard", 10000); // up to 10s
//        System.out.println("Login successful!");
//        sleep(1000);
//        driver.quit();
//    }
//}




// way 2

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class StepDefinitions {
//
//	public static WebDriver driver;
//
//	@Given("User is on the login page")
//	public void user_is_on_the_login_page() throws InterruptedException {
//		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(chromeOptions);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//
//	}
//
//	@When("user enters the username")
//	public void user_enters_the_username() throws InterruptedException {
//
//		// username
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("Admin");
//		Thread.sleep(2000);
//
//	}
//
//	@When("user enters the password")
//	public void user_enters_the_password() throws InterruptedException {
//
//		// password
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("admin123");
//		Thread.sleep(2000);
//
//	}
//
//	@When("user clicks on the login button")
//	public void user_clicks_on_the_login_button() throws InterruptedException {
//		
//		// login
//		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
//		loginbutton.click();
//		Thread.sleep(2000);
//
//	}
//
//	@Then("user is naqvigated to home page")
//	public void user_is_naqvigated_to_home_page() {
//		WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
//
//		if (admin.isDisplayed()) {
//			System.out.println("User is on the home page");
//		} else {
//			System.out.println("User is not on the home page");
//		}
//
//	}
//
//}




//For Negative test case for negative or wrong password 

//
//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class StepDefinations {
//
//    private WebDriver driver;
//
//    private void sleep(long ms) {
//        try {
//            Thread.sleep(ms);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            throw new RuntimeException(e);
//        }
//    }
//
//    private void waitForUrlContains(String part, long timeoutMs) {
//        long end = System.currentTimeMillis() + timeoutMs;
//        while (System.currentTimeMillis() < end) {
//            if (driver.getCurrentUrl().contains(part)) return;
//            sleep(500);
//        }
//        throw new AssertionError("Expected URL to contain: " + part + " but was: " + driver.getCurrentUrl());
//    }
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() {
//        ChromeOptions options = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        sleep(4000);
//    }
//
//    @When("user enters the username")
//    public void user_enters_the_username() {
//        sleep(1000);
//        WebElement username = driver.findElement(By.name("username"));
//        username.clear();
//        username.sendKeys("Admin");
//        sleep(2000);
//    }
//
//    @When("user enters the password")
//    public void user_enters_the_password() {
//        sleep(1000);
//        WebElement password = driver.findElement(By.name("password"));
//        password.clear();
//        password.sendKeys("admin123");
//        sleep(1500);
//    }
//
//    @When("user enters invalid password")
//    public void user_enters_invalid_password() {
//        sleep(1000);
//        WebElement password = driver.findElement(By.name("password"));
//        password.clear();
//        password.sendKeys("wrongpass123"); // invalid password
//        sleep(1500);
//    }
//
//    @When("user clicks on the login button")
//    public void user_clicks_on_the_login_button() {
//        sleep(1000);
//        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        loginButton.click();
//        sleep(3000);
//    }
//
//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() {
//        waitForUrlContains("/dashboard", 10000);
//        System.out.println("✅ Login successful!");
//        sleep(1000);
//        driver.quit();
//    }
//
//    @Then("user sees an error message")
//    public void user_sees_an_error_message() {
//        sleep(2000);
//        WebElement errorMsg = driver.findElement(
//                By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
//        );
//        String text = errorMsg.getText();
//        System.out.println("❌ Login failed. Error message: " + text);
//
//        if (!text.equalsIgnoreCase("Invalid credentials")) {
//            throw new AssertionError("Expected 'Invalid credentials' but got: " + text);
//        }
//        driver.quit();
//    }
//}





/*Now We are using parameterization + reusable methods:*/


/*Your feature file now uses Scenario Outline with parameters, so you want your step definition class to:

Have one reusable method for entering both username and password.

Still support the original positive login scenario (with hardcoded steps).

Reuse the same login flow for both positive and negative test cases*/


// for paramerer for both negative and psotive all test should pass

//@When("user enters the {string} and {string}")
//
//public void user_enters_the(String username , String password ) throws InterruptedException {
//
//	WebElement username1 = driver.findElement(By.name("username"));
//
//	username1.sendKeys(username);
//
//	Thread.sleep(2000);
//
//
//	WebElement password1 = driver.findElement(By.name("password"));
//
//	password1.sendKeys(password);
//
//	Thread.sleep(2000);
//
//
//}


//
//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class StepDefinations {
//
//    private WebDriver driver;
//
//    // --- sleep helper to avoid repeating try/catch ---
//    private void sleep(long ms) {
//        try {
//            Thread.sleep(ms);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            throw new RuntimeException(e);
//        }
//    }
//
//    // --- reusable method to type into input boxes ---
//    private void type(By locator, String value) {
//        WebElement element = driver.findElement(locator);
//        element.clear();
//        element.sendKeys(value);
//        sleep(1500);
//    }
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() {
//        ChromeOptions options = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        sleep(4000);
//    }
//
//    // --- original steps for hardcoded positive scenario ---
//    @When("user enters the username")
//    public void user_enters_the_username() {
//        type(By.name("username"), "Admin");
//    }
//
//    @When("user enters teh password")
//    public void user_enters_teh_password() {
//        type(By.name("password"), "admin123");
//    }
//
//    // --- parameterized step for Scenario Outline ---
//    @When("user enters the {string} and {string}")
//    public void user_enters_the(String username, String password) {
//        type(By.name("username"), username);
//        type(By.name("password"), password);
//    }
//
//    @When("user clicks on the login button")
//    public void user_clicks_on_the_login_button() {
//        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        loginButton.click();
//        sleep(3000);
//    }
//
//    @Then("user is navigated to home page")
//    public void user_is_naqvigated_to_home_page() {
//        // simple URL contains check (Thread.sleep based)
//        long end = System.currentTimeMillis() + 10000;
//        while (System.currentTimeMillis() < end) {
//            if (driver.getCurrentUrl().contains("/dashboard")) {
//                System.out.println("✅ Login successful!");
//                driver.quit();
//                return;
//            }
//            sleep(500);
//        }
//        throw new AssertionError("Expected to navigate to dashboard, but current URL is: " + driver.getCurrentUrl());
//    }
//
//    @Then("user sees an error message")
//    public void user_sees_an_error_message() {
//        sleep(2000);
//        WebElement errorMsg = driver.findElement(
//                By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
//        );
//        String text = errorMsg.getText();
//        System.out.println("❌ Login failed. Error message: " + text);
//
//        if (!text.equalsIgnoreCase("Invalid credentials")) {
//            throw new AssertionError("Expected 'Invalid credentials' but got: " + text);
//        }
//        driver.quit();
//    }
//}
//







//try 2 parameter 

//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class StepDefinations {
//
//    private WebDriver driver;
//
//    // --- sleep helper to avoid repeating try/catch ---
//    private void sleep(long ms) {
//        try {
//            Thread.sleep(ms);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            throw new RuntimeException(e);
//        }
//    }
//
//    // --- reusable method to type into input boxes ---
//    private void type(By locator, String value) {
//        WebElement element = driver.findElement(locator);
//        element.clear();
//        element.sendKeys(value);
//        sleep(1500);
//    }
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() {
//        ChromeOptions options = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        sleep(4000);
//    }
//
//    // --- hardcoded positive scenario steps ---
//    @When("user enters the username")
//    public void user_enters_the_username() {
//        type(By.name("username"), "Admin");
//    }
//
//    @When("user enters teh password")
//    public void user_enters_teh_password() {
//        type(By.name("password"), "admin123");
//    }
//
//    // --- parameterized step for Scenario Outline ---
//    @When("user enters the {string} and {string}")
//    public void user_enters_the(String username, String password) {
//        type(By.name("username"), username);
//        type(By.name("password"), password);
//    }
//
//    @When("user clicks on the login button")
//    public void user_clicks_on_the_login_button() {
//        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        loginButton.click();
//        sleep(3000);
//    }
//
//    @Then("user is naqvigated to home page")
//    public void user_is_naqvigated_to_home_page() {
//        // Try for 10s: either dashboard OR error message
//        long end = System.currentTimeMillis() + 10000;
//        while (System.currentTimeMillis() < end) {
//            // ✅ Positive case: dashboard URL
//            if (driver.getCurrentUrl().contains("/dashboard")) {
//                System.out.println("✅ Login successful!");
//                driver.quit();
//                return;
//            }
//
//            // ❌ Negative case: error message visible
//            try {
//                WebElement errorMsg = driver.findElement(
//                        By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
//                );
//                String text = errorMsg.getText();
//                if (text.equalsIgnoreCase("Invalid credentials")) {
//                    System.out.println("❌ Login failed. Error message: " + text);
//                    driver.quit();
//                    return;
//                }
//            } catch (Exception ignore) {
//                // element not found yet, keep waiting
//            }
//
//            sleep(500);
//        }
//        throw new AssertionError("Neither dashboard nor error message appeared. Current URL: " + driver.getCurrentUrl());
//    }
//}
//




//For using hook so to attach screenshot of fail case treat both -ve and +ve cases as passed
//
//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utils.DriverFactory;
//
//public class StepDefinations {
//
//    WebDriver driver = DriverFactory.getDriver();
//
//    // --- small helper sleep ---
//    private void sleep(long ms) {
//        try {
//            Thread.sleep(ms);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            throw new RuntimeException(e);
//        }
//    }
//
//    // --- reusable method to type into input boxes ---
//    private void type(By locator, String value) {
//        WebElement element = driver.findElement(locator);
//        element.clear();
//        element.sendKeys(value);
//        sleep(1000);
//    }
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() {
//        // Navigate to login page (browser already launched in Hooks)
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        sleep(3000);
//    }
//
//    // --- hardcoded positive scenario ---
//    @When("user enters the username")
//    public void user_enters_the_username() {
//        type(By.name("username"), "Admin");
//    }
//
//    @When("user enters teh password")
//    public void user_enters_teh_password() {
//        type(By.name("password"), "admin123");
//    }
//
//    // --- parameterized step for Scenario Outline ---
//    @When("user enters the {string} and {string}")
//    public void user_enters_the(String username, String password) {
//        type(By.name("username"), username);
//        type(By.name("password"), password);
//    }
//
//    @When("user clicks on the login button")
//    public void user_clicks_on_the_login_button() {
//        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        loginButton.click();
//        sleep(2000);
//    }
//
//    @Then("user is naqvigated to home page")
//    public void user_is_naqvigated_to_home_page() {
//        // Robust: check either dashboard OR error message
//        long end = System.currentTimeMillis() + 8000;
//        while (System.currentTimeMillis() < end) {
//            // ✅ Positive case: dashboard URL
//            if (driver.getCurrentUrl().contains("/dashboard")) {
//                System.out.println("✅ Login successful!");
//                return; // Hooks will quit driver
//            }
//
//            // ❌ Negative case: error message visible
//            try {
//                WebElement errorMsg = driver.findElement(
//                        By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
//                );
//                String text = errorMsg.getText();
//                if (text.equalsIgnoreCase("Invalid credentials")) {
//                    System.out.println("❌ Login failed. Error message: " + text);
//                    return; // Hooks will quit driver
//                }
//            } catch (Exception ignore) {
//                // element not found yet
//            }
//
//            sleep(500);
//        }
//
//        throw new AssertionError(
//            "Neither dashboard nor error message appeared. Current URL: " + driver.getCurrentUrl()
//        );
//    }
//}


//for treating -ve as negative and +ve as positive
//
/*
package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class StepDefinations {

    WebDriver driver = DriverFactory.getDriver();

    // --- small helper sleep ---
    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    // --- reusable method to type into input boxes ---
    private void type(By locator, String value) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(value);
        sleep(1000);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // Navigate to login page (browser already launched in Hooks)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        sleep(3000);
    }

    // --- hardcoded positive scenario ---
    @When("user enters the username")
    public void user_enters_the_username() {
        type(By.name("username"), "Admin");
    }

    @When("user enters the password")
    public void user_enters_teh_password() {
        type(By.name("password"), "admin123");
    }

    // --- parameterized step for Scenario Outline ---
    @When("user enters the {string} and {string}")
    public void user_enters_the(String username, String password) {
        type(By.name("username"), username);
        type(By.name("password"), password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        sleep(2000);
    }

    @Then("user is navigated to home page")
    public void user_is_naqvigated_to_home_page() {
        // Check either dashboard OR error message
        long end = System.currentTimeMillis() + 8000;
        while (System.currentTimeMillis() < end) {
            // ✅ Positive case: dashboard URL
            if (driver.getCurrentUrl().contains("/dashboard")) {
                System.out.println("✅ Login successful!");
                return; // PASS
            }

            // ❌ Negative case: error message visible
            try {
                WebElement errorMsg = driver.findElement(
                        By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
                );
                String text = errorMsg.getText();
                if (text.equalsIgnoreCase("Invalid credentials")) {
                    System.out.println("❌ Login failed. Error message: " + text);
                    // Mark test as FAILED → triggers Hooks screenshot
                    throw new AssertionError("Login failed with error: " + text);
                }
            } catch (Exception ignore) {
                // element not found yet
            }

            sleep(500);
        }

        // If neither success nor error → fail the test
        throw new AssertionError(
            "❌ Neither dashboard nor error message appeared. Current URL: " + driver.getCurrentUrl()
        );
    }
}

*/



//Try 2 for failed and positive case - and  + having screenshots
/*
package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class StepDefinations {

    WebDriver driver = DriverFactory.getDriver();

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void type(By locator, String value) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(value);
        sleep(1000);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        sleep(2000);
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        type(By.name("username"), "Admin");
    }

    @When("user enters the password")
    public void user_enters_teh_password() {
        type(By.name("password"), "admin123");
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the(String username, String password) {
        type(By.name("username"), username);
        type(By.name("password"), password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        sleep(2000);
    }

    @Then("user is navigated to home page")
    public void user_is_naqvigated_to_home_page() {
        long end = System.currentTimeMillis() + 6000;

        while (System.currentTimeMillis() < end) {
            if (driver.getCurrentUrl().contains("/dashboard")) {
                System.out.println("✅ Login successful!");
                return;
            }

            try {
                WebElement errorMsg = driver.findElement(
                        By.xpath("//*[@id='app']//p[contains(text(),'Invalid credentials')]")
                );
                if (errorMsg.isDisplayed()) {
                    throw new AssertionError("❌ Login failed. Error message: " + errorMsg.getText());
                }
            } catch (Exception ignored) {}
            sleep(500);
        }

        throw new AssertionError("❌ Neither dashboard nor error message appeared. URL: " + driver.getCurrentUrl());
    }
}
*/



//2
//from friend
//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import io.cucumber.java.en.*;
//import utils.DriverFactory;
//
//public class StepDefinations {
//
//    WebDriver driver = DriverFactory.getDriver();
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() throws InterruptedException {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(2000);
//    }
//
//    @When("user enters the username")
//    public void user_enters_the_username() throws InterruptedException {
//        WebElement username = driver.findElement(By.name("username"));
//        username.sendKeys("Admin");
//        Thread.sleep(2000);
//    }
//
//    @When("user enters the password")
//    public void user_enters_the_password() throws InterruptedException {
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("admin123");
//        Thread.sleep(2000);
//    }
//
//    @When("user clicks on the login button")
//    public void user_clicks_on_the_login_button() throws InterruptedException {
//        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//        button.click();
//        Thread.sleep(2000);
//    }
//
//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() {
//        WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
//        if (!admin.isDisplayed()) {
//            throw new AssertionError("Home page not displayed!");
//        }
//    }
//
//    @Then("an error message is displayed")
//    public void an_error_message_is_displayed() throws InterruptedException {
//        Thread.sleep(2000);
//        String errorText = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")).getText();
//        if (!errorText.contains("Invalid credentials")) {
//            throw new AssertionError("Expected error message not found. Actual: " + errorText);
//        }
//        System.out.println("Login failed as expected. Error message: " + errorText);
//    }
//
//    // ✅ Reusable step for scenario outline
//    @When("user enters the {string} and {string}")
//    public void user_enters_the_and(String username, String password) throws InterruptedException {
//        WebElement usernameField = driver.findElement(By.name("username"));
//        usernameField.clear();
//        usernameField.sendKeys(username);
//
//        WebElement passwordField = driver.findElement(By.name("password"));
//        passwordField.clear();
//        passwordField.sendKeys(password);
//
//        Thread.sleep(2000);
//    }
//}


// using Data Table

// add this for data table:

/*
 * 
 @When("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
 
		
 
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
 
		for (Map<String, String> user : users) {

 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
			Thread.sleep(10000);
 
			String username = user.get("username");
			String password = user.get("password");
 
			WebElement username1 = driver.findElement(By.name("username"));
 
			Thread.sleep(4000);
 
			username1.sendKeys(username);
 
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
 
			password1.sendKeys(password);
 
			Thread.sleep(2000);
 
			

 
	}
 */





 










/*Page Object model for diverse step codes in diverse manner  */
 



//Best code till now : 

/*
package StepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class StepDefinations {

    WebDriver driver = DriverFactory.getDriver();
    loginpage lp = new loginpage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        button.click();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        WebElement admin = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//a[1]//span[1]")));
        if (admin.isDisplayed()) {
            System.out.println("User is on the home page");
        } else {
            System.out.println("User is not on the home page");
        }
    }

    @When("user enters the invalid password")
    public void user_enters_the_invalid_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("wrongpass"); // invalid password
    }

    @Then("user sees an error message for invalid credentials")
    public void an_error_message_is_displayed() {
        WebElement error = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")));
        String errorText = error.getText().trim();
        if (!errorText.equals("Invalid credentials")) {
            throw new AssertionError("Expected error message not found. Actual: " + errorText);
        }
        System.out.println("Login failed as expected. Error message: " + errorText);
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the(String username, String password) {
        WebElement username1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username1.sendKeys(username);

        WebElement password1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password1.sendKeys(password);
    }
    
    @When("user enters credentials")

	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
 
		
 
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
 
		for (Map<String, String> user : users) {

 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
			Thread.sleep(10000);
 
			String username = user.get("username");

			String password = user.get("password");
 
			WebElement username1 = driver.findElement(By.name("username"));
 
			Thread.sleep(4000);
 
			username1.sendKeys(username);
 
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
 
			password1.sendKeys(password);
 
			Thread.sleep(2000);
 
			

 
	}
    }
		@Given("the user is on the login page")
		public void the_user_is_on_the_login_page() throws InterruptedException {
			// launch the application on the chrome browser
					Thread.sleep(10000);
	 
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
					Thread.sleep(2000);
	 
		}
	 
		@When("the user enters username {string} and password {string}")
		public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
	 
		lp.enterCredentials(username, password);
		}
	 
		@Then("the user should be navigated to the home page")
		public void the_user_should_be_navigated_to_the_home_page() {
			lp.clickLogin();
		}
 
 
}

*/



//test 4 best code :
/*
package StepDefinations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {

    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.clear();
        username.sendKeys("Admin");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.clear();
        password.sendKeys("admin123");
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String username, String password) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameField.clear();
        usernameField.sendKeys(username);

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        button.click();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        try {
            // Success condition: Dashboard or Admin menu appears
            WebElement dashboard = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='Dashboard']"))
            );
            if (!dashboard.isDisplayed()) {
                throw new AssertionError("Dashboard not visible even after login.");
            }
            System.out.println("✅ User is on the home page");
        } catch (TimeoutException e) {
            // Failure condition: check for error message
            WebElement error = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"))
            );
            String errorText = error.getText().trim();
            throw new AssertionError("❌ Login failed. Error message: " + errorText);
        }
    }
}
*/


//editions 


/*
package StepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class StepDefinations {

    WebDriver driver = DriverFactory.getDriver();
    loginpage lp = new loginpage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        button.click();
    }

//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() {
//        WebElement admin = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//a[1]//span[1]")));
//        if (admin.isDisplayed()) {
//            System.out.println("User is on the home page");
//        } else {
//            System.out.println("User is not on the home page");
//        }
//    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Wait for URL first (quickest signal)
        wait.until(ExpectedConditions.urlContains("/dashboard"));

        WebElement header = wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.cssSelector("h6.oxd-text--h6.oxd-topbar-header-breadcrumb-module")));

        if (!"Dashboard".equalsIgnoreCase(header.getText().trim())) {
            throw new AssertionError("Expected to be on Dashboard, but saw: " + header.getText());
        }
        System.out.println("User is on the home page");
    }

    
    @When("user enters the invalid password")
    public void user_enters_the_invalid_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("wrongpass"); // invalid password
    }

//    @Then("user sees an error message for invalid credentials")
//    public void an_error_message_is_displayed() {
//        WebElement error = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")));
//        String errorText = error.getText().trim();
//        if (!errorText.equals("Invalid credentials")) {
//            throw new AssertionError("Expected error message not found. Actual: " + errorText);
//        }
//        System.out.println("Login failed as expected. Error message: " + errorText);
//    }
    @Then("user sees an error message for invalid credentials")
    public void an_error_message_is_displayed() {
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector("p.oxd-text.oxd-text--p.oxd-alert-content-text")));
        String errorText = error.getText().trim();
        if (!"Invalid credentials".equals(errorText)) {
            throw new AssertionError("Expected 'Invalid credentials'. Actual: " + errorText);
        }
        System.out.println("Login failed as expected. Error message: " + errorText);
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the(String username, String password) {
        WebElement username1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username1.sendKeys(username);

        WebElement password1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password1.sendKeys(password);
    }
    
    @When("user enters credentials")

	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
 
		
 
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
 
		for (Map<String, String> user : users) {

 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
			Thread.sleep(10000);
 
			String username = user.get("username");

			String password = user.get("password");
 
			WebElement username1 = driver.findElement(By.name("username"));
 
			Thread.sleep(4000);
 
			username1.sendKeys(username);
 
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
 
			password1.sendKeys(password);
 
			Thread.sleep(2000);
 
			

 
	}
    }
		@Given("the user is on the login page")
		public void the_user_is_on_the_login_page() throws InterruptedException {
			// launch the application on the chrome browser
					Thread.sleep(10000);
	 
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
					Thread.sleep(2000);
	 
		}
	 
		@When("the user enters username {string} and password {string}")
		public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
	 
		lp.enterCredentials(username, password);
		}
	 
		@Then("the user should be navigated to the home page")
		public void the_user_should_be_navigated_to_the_home_page() {
			lp.clickLogin();
		}
 
 
}
*/
package StepDefinitions;


import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    loginpage lp = new loginpage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        button.click();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        WebElement admin = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//a[1]//span[1]")));
        if (admin.isDisplayed()) {
            System.out.println("User is on the home page");
        } else {
            System.out.println("User is not on the home page");
        }
    }

    @When("user enters the invalid password")
    public void user_enters_the_invalid_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("wrongpass"); // invalid password
    }

    @Then("user sees an error message for invalid credentials")
    public void an_error_message_is_displayed() {
        WebElement error = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")));
        String errorText = error.getText().trim();
        if (!errorText.equals("Invalid credentials")) {
            throw new AssertionError("Expected error message not found. Actual: " + errorText);
        }
        System.out.println("Login failed as expected. Error message: " + errorText);
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the(String username, String password) {
        WebElement username1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username1.sendKeys(username);

        WebElement password1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password1.sendKeys(password);
    }
    
    @When("user enters credentials")

	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
 
		
 
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
 
		for (Map<String, String> user : users) {

 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
			Thread.sleep(10000);
 
			String username = user.get("username");

			String password = user.get("password");
 
			WebElement username1 = driver.findElement(By.name("username"));
 
			Thread.sleep(4000);
 
			username1.sendKeys(username);
 
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
 
			password1.sendKeys(password);
 
			Thread.sleep(2000);
 
			

 
	}
    }
		@Given("the user is on the login page")
		public void the_user_is_on_the_login_page() throws InterruptedException {
			// launch the application on the chrome browser
					Thread.sleep(10000);
	 
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
					Thread.sleep(2000);
	 
		}
	 
		@When("the user enters username {string} and password {string}")
		public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
	 
		lp.enterCredentials(username, password);
		}
	 
		@Then("the user should be navigated to the home page")
		public void the_user_should_be_navigated_to_the_home_page() {
			lp.clickLogin();
		}
 
 
}

