package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        try {
            // Navigate to Facebook
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();

            Actions act = new Actions(driver);

            // Type HELLO in email field (uppercase)
            WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
            act.moveToElement(email)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();

            Thread.sleep(2000);

            // Type Saksham in password field
            WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
            act.moveToElement(password)
                .click()
                .sendKeys("Saksham")
                .build()
                .perform();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // driver.quit();
        }
    }
}
