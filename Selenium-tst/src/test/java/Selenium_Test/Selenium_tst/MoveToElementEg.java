package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementEg {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Setup ChromeDriver
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // Open Amazon
            driver.get("https://www.amazon.in");
            driver.manage().window().maximize();

            // Create Actions instance
            Actions act = new Actions(driver);

            // Hover over "Prime"
            WebElement prime = driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
            act.moveToElement(prime).perform();
            Thread.sleep(4000);

            // Click "Join Now" under Prime
            WebElement joinNow = driver.findElement(By.xpath("//a[@href='/prime']"));
            act.click(joinNow).perform();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
