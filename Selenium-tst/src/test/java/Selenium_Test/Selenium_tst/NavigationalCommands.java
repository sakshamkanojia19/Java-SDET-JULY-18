package Selenium_Test.Selenium_tst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();

        // Open first site
        driver.get("https://www.google.com");
        Thread.sleep(1000);

        // Open second site
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

        // Navigate back to Google
        driver.navigate().back();
        Thread.sleep(1000);

        // Navigate forward to Rahul Shetty site
        driver.navigate().forward();
        Thread.sleep(1000);

        // Refresh the page
        driver.navigate().refresh();

        driver.quit();
    }
}
