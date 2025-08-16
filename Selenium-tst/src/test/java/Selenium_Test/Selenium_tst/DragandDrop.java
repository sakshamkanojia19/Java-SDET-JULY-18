package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Setup ChromeDriver
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // Open the site
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");

            // Maximize window
            driver.manage().window().maximize();

            // Create Actions instance
            Actions act = new Actions(driver);

            // Locate source and target elements
            WebElement from = driver.findElement(By.id("column-a"));
            WebElement to = driver.findElement(By.id("column-b"));

            // Perform drag and drop
            act.dragAndDrop(from, to).perform();

            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
