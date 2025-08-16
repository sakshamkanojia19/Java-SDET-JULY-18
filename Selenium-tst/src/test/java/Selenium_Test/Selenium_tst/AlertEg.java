package Selenium_Test.Selenium_tst;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertEg {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // ===== Simple Alert =====
        WebElement simpleAlertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        simpleAlertBtn.click();
        Thread.sleep(1000);

        Alert alert1 = driver.switchTo().alert();
        System.out.println("Simple Alert text: " + alert1.getText());
        alert1.accept(); // Click OK

        Thread.sleep(1000);

        // ===== Confirmation Alert =====
        WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        confirmAlertBtn.click();
        Thread.sleep(1000);

        Alert alert2 = driver.switchTo().alert();
        System.out.println("Confirm Alert text: " + alert2.getText());
        alert2.dismiss(); // Click Cancel

        Thread.sleep(1000);

        // ===== Prompt Alert =====
        WebElement promptAlertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        promptAlertBtn.click();
        Thread.sleep(1000);

        Alert alert3 = driver.switchTo().alert();
        System.out.println("Prompt Alert text: " + alert3.getText());
        alert3.sendKeys("Saksham");
        alert3.accept(); // Click OK

        Thread.sleep(2000);

        driver.quit();
    }
}
