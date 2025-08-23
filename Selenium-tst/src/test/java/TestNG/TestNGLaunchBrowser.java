package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGLaunchBrowser {

	//Annotations control the flow of executions
	
	
	
//	@Test annotation Marks a class or a Methods as test case
	
	@Test
	public void launchbrowser() {
		
		  ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/tables"); // correct site with webtables
        driver.manage().window().maximize();
       
	}
	
	
	
	
	

}
