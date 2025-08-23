package TestNG_Selenium_Frame_19_08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSoftAssertion {

    @Test
    public void testlogin() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "OrangeHRM";

        // Soft assertion
        SoftAssert soft = new SoftAssert();
        soft.assertNotEquals(actualTitle, expectedTitle, "Title should not match the wrong value");

        WebElement username = driver.findElement(By.name("username"));

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> username.isDisplayed());
        username.sendKeys("Admin");

        Thread.sleep(2000);

        // Password field
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

        // Fluent wait
        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);

        wait1.until(d -> password.isDisplayed());

        password.sendKeys("admin123");

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(2000);

        driver.quit();

        // Report all soft assertion results
        soft.assertAll();
    }
}
