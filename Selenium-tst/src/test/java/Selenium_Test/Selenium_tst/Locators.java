//package Selenium_Test.Selenium_tst;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Locators {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		
//		 ChromeOptions chromeOptions = new ChromeOptions();
//
//	        WebDriverManager.chromedriver().setup();
//
//	        WebDriver driver = new ChromeDriver(chromeOptions);
//
//   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//		
////	        enter text in password field
//	        
//      Thread.sleep(2000);
//   
//		WebElement username = driver.findElement(By.name("username"));
//		
//		username.sendKeys("Admin");
//		
//		WebElement password  = driver.findElement(By.xpath("//button[@type='submit'"));
//		
//				
//				password.sendKeys("admin123");
//		
//		
//	WebElement loginbutton  = driver.findElement(By.xpath("Login"));
//		
//				
//			loginbutton.click();
//		
//	}
//
//}




package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for username field and enter value
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");

        // Wait for password field and enter value
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        // Wait for login button and click
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginButton.click();

        // Optional: Verify login success
        wait.until(ExpectedConditions.urlContains("/dashboard"));
        System.out.println("Login successful!");
    }
}
