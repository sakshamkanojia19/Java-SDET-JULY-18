package TestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPriority {

    // Default priority = 0 (if not mentioned).
    // If multiple test methods have the same priority, they run in alphabetical order.
    // Lower priority value = Higher execution order priority = 0 runs before priority = 1.

    @Test(priority = 2)
    public void testalerts() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // click on simple alert
        WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        simplealert.click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.accept(); // click on ok button
        Thread.sleep(2000);

        // click on confirmational alert
        WebElement confirmalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        confirmalert.click();
        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        alt1.dismiss(); // click on cancel button
        Thread.sleep(2000);

        // click on prompt alert
        WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        promptalert.click();
        Thread.sleep(2000);
        Alert alt2 = driver.switchTo().alert();
        String alerttext = alt2.getText();
        System.out.println(alerttext);
        alt2.sendKeys("Harsha");
        Thread.sleep(2000);
        alt2.accept(); // click on ok button
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 1)
    public void testcheckbox() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement checkbox = driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']"));
        checkbox.click();
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 0)
    public void testdragdrop() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Actions class is used to simulate the mouse related activities
        Actions act = new Actions(driver);

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        act.dragAndDrop(from, to).perform();

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void radiobuttons() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio3 = driver.findElement(By.xpath("//input[@value = 'radio3']"));
        radio3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
