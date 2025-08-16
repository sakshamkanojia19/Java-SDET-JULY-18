package Selenium_Test.Selenium_tst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeBrowser {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}

/*
 * Manual driver invoking example (Edge):
 * 
 * // Set path to EdgeDriver executable
 * System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
 * // Create EdgeDriver instance
 * WebDriver driver = new EdgeDriver();
 * // Open a webpage
 * driver.get("https://www.google.com");
 */
