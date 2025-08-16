package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEx {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Locate dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

        // Create Select object
        Select sel = new Select(dropdown);

        // 1️⃣ Select by Visible Text
        sel.selectByVisibleText("Option1");
        Thread.sleep(1000);

        // 2️⃣ Select by Value
        sel.selectByValue("option2");
        Thread.sleep(1000);

        // 3️⃣ Select by Index (0-based index)
        sel.selectByIndex(3); // Option3
        Thread.sleep(1000);

        driver.quit();
    }
}
