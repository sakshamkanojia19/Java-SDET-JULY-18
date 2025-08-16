package Selenium_Test.Selenium_tst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutliCheckBox {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // ✅ Handle Checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Checkboxes: " + checkboxes.size());

        for (int i = 0; i < checkboxes.size(); i++) {
            Thread.sleep(1000);
            WebElement checkbox = checkboxes.get(i);
            checkbox.click();
            System.out.println("Checkbox " + (i + 1) + " clicked. Selected: " + checkbox.isSelected());
        }

        Thread.sleep(2000);

        // ✅ Handle Radio Buttons
        List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total Radio Buttons: " + radios.size());

        for (int i = 0; i < radios.size(); i++) {
            Thread.sleep(1000);
            WebElement radio = radios.get(i);
            radio.click();
            System.out.println("Radio Button " + (i + 1) + " clicked. Selected: " + radio.isSelected());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
