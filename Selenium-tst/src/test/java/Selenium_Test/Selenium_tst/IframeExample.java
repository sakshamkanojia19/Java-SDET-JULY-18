package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeExample {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        try {
            // Navigate to the demo page with iframe
            driver.get("https://jqueryui.com/droppable/");
            driver.manage().window().maximize();

            // Identify the iframe and switch to it
            WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//            driver.switchTo().frame(Frame);

//            By indexing concept
            driver.switchTo().frame(0);
            
            Thread.sleep(2000);

            // Locate draggable and droppable elements
            WebElement drag = driver.findElement(By.id("draggable"));
            WebElement drop = driver.findElement(By.id("droppable"));

            // Perform drag and drop
            Actions act = new Actions(driver);
            act.dragAndDrop(drag, drop).perform();

            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
