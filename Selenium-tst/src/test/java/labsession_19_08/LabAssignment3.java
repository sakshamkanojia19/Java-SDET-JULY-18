package labsession_19_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

// Attach listener at class level
@Listeners(TestNGListener2.class)
public class LabAssignment3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Test Case 1: Positive Login Test
    @Test(priority = 0)
    public void positiveLoginTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        // Hard assert for URL (critical check)
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"),
                "❌ URL verification failed!");

        // Soft asserts for non-critical validations
        WebElement message = driver.findElement(By.tagName("h1"));
        softAssert.assertTrue(message.getText().contains("Logged In Successfully"),
                "❌ Success message mismatch!");

        WebElement logoutBtn = driver.findElement(By.linkText("Log out"));
        softAssert.assertTrue(logoutBtn.isDisplayed(),
                "❌ Log out button not displayed!");

        // Collate all soft assertions
        softAssert.assertAll();
    }

    // Test Case 2: Negative Username Test
    @Test(priority = 1)
    public void negativeUsernameTest() {
        driver.findElement(By.id("username")).sendKeys("incorrectUser");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        WebElement error = driver.findElement(By.id("error"));
        Assert.assertTrue(error.isDisplayed(), "❌ Error message not displayed!");

        // Hard assert because exact text is critical
        Assert.assertEquals(error.getText().trim(), "Your username is invalid!",
                "❌ Incorrect error message text!");
    }

    // Test Case 3: Negative Password Test
    @Test(priority = 2)
    public void negativePasswordTest() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("incorrectPassword");
        driver.findElement(By.id("submit")).click();

        WebElement error = driver.findElement(By.id("error"));
        Assert.assertTrue(error.isDisplayed(), "❌ Error message not displayed!");
        Assert.assertEquals(error.getText().trim(), "Your password is invalid!",
                "❌ Incorrect error message text!");
    }
}