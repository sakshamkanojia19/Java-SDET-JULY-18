//package Selenium_Test.Selenium_tst;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class SynchronizationSelenum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub  
//		
////		 By using waits
//		
//		 ChromeOptions chromeOptions = new ChromeOptions();
//	        WebDriverManager.chromedriver().setup();
//	        WebDriver driver = new ChromeDriver(chromeOptions);
//
//	        // Navigate to the URL
//	        driver.get("https://ui.shadcn.com/docs/components/date-picker");
//	        driver.manage().window().maximize();
//	        
//	        
//	        //Implecite wait applied within web driver lifespane before it throwa element not found 
//	        //Default global time for all web elements it will apply wait of 5 seconds
////	        try catch is important in every code
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	
////	 can i wait fot single web element 
////	        explicit wait 
//	        
//	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	        wait.until(ExpectedConditons.visibilityOf(username));
//	        username.sendKeys("Admin");
//	        wait.until((d->admin.isDisplayed));
//	        
//	        
//	        
////	       Fluent / customisable wait useful with performsne scinarios and in api calls 
//	        
//	        Wait<WebDriver> wait1 = new FluentWait<>(driver) {
//	        	
//	        }
// 	        
//	        
//	        
//	        Actions act = new Actions(driver);
//	
//	}
//
//}




package Selenium_Test.Selenium_tst;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationSelenium {

    public static void main(String[] args) {

        // Setup ChromeDriver using WebDriverManager
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to a reliable test website
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();

        // --------------------------
        // 1. Implicit Wait
        // --------------------------
        // Implicit wait tells WebDriver to wait for a certain amount of time
        // when trying to find any element (global for all findElement calls).
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // --------------------------
        // 2. Explicit Wait
        // --------------------------
        // Explicit wait is for a specific condition for a specific element.
        // Here, we click the "Start" button and wait for the text to appear.
        driver.findElement(By.cssSelector("#start button")).click();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement finishText = explicitWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
        );
        System.out.println("Text found with Explicit Wait: " + finishText.getText());

        // --------------------------
        // 3. Fluent Wait
        // --------------------------
        // Fluent wait lets us define polling frequency and exceptions to ignore.
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))      // total wait time
                .pollingEvery(Duration.ofMillis(500))     // check every 0.5s
                .ignoring(NoSuchElementException.class);  // ignore missing elements during polling

        // Example usage: wait for a header element to appear
        WebElement header = fluentWait.until(d -> d.findElement(By.tagName("h4")));
        System.out.println("Header found with Fluent Wait: " + header.getText());

        // --------------------------
        // Actions Example (optional)
        // --------------------------
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();

        // Close browser
        driver.quit();
    }
}
