package Selenium_Test.Selenium_tst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		
		
		 ChromeOptions chromeOptions = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOptions);

	        driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	        
	       String title = driver.getTitle() ;
	       
	       System.out.println(title);
	       
	       String pagesource = driver.getPageSource();

	       System.out.println(pagesource);
	       

	       
	       String url = driver.getCurrentUrl();
	       
	       System.out.println(url);
	       
	       
	       driver.close();
	       
//	       close all can also use quit 
	       
	       
	       

	}

}
