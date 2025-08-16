package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Setup Chrome
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);

            // Open Amazon
            driver.get("https://www.amazon.in");
            driver.manage().window().maximize();

            // Actions class is used to simulate mouse-related activities
            Actions act = new Actions(driver);

            // Double-click on 'Sell'
            WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
            act.doubleClick(sell).perform();

            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);

            // Context click (right-click) on 'Mobiles'
            WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
            act.contextClick(mobiles).perform();

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
