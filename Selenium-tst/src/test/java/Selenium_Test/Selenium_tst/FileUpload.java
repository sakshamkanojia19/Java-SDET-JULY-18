package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		   ChromeOptions chromeOptions = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOptions);

	        // Open the download page
	        driver.get("https://the-internet.herokuapp.com/upload");
	        driver.manage().window().maximize();
	        
	  

	        // Click the file link to download
	        WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
	        fileupload.sendKeys("C:\\Users\\ASUS\\Downloads\\test-file.txt");

	
	        WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
	        
	        submit.click();
	        
	        WebElement validationmsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
	        
	        if (validationmsg.isDisplayed()) {
	        	System.out.println("The message is Displayed");
	        } else {
	        	System.out.println("The message is not displayed");
	        }
	
	        driver.quit();
	}

}
