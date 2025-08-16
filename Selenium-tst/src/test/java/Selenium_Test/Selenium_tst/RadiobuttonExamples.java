package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonExamples {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Locate Radio Button 3 by XPath
        WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));

        // Locate Checkbox 1 by ID
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));

        // Click Radio Button
        radio3.click();
        Thread.sleep(1000);

        // Verify if Radio Button is selected
        if (radio3.isSelected()) {
            System.out.println("Radio Button 3 is selected successfully!");
        } else {
            System.out.println("Radio Button 3 is NOT selected!");
        }

        // Click Checkbox
        checkbox1.click();
        Thread.sleep(1000);

        // Verify if Checkbox is selected
        if (checkbox1.isSelected()) {
            System.out.println("Checkbox 1 is selected successfully!");
        } else {
            System.out.println("Checkbox 1 is NOT selected!");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
