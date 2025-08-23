package Session_16_08;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		   /*
		    * [11:11, 16/08/2025] Sk 2: dynamic web elements - values

keep changing and they have aplha numeric values starts with

//input[@id = 'id_43546']

//input[@id = 'id_67769']

//input[@id = 'id_45545']

ends with

regular expressions to handle the dynamic web elements

//input[starts-with(@id), 'id_']

//input[starts-with(text(), 'id_')]

//input[ends-with(@id), '_name']

//a[contains(text(),'name')]

//button[@name = 'login' and @type = 'submit'l
[11:16, 16/08/2025] Sk 2: ends with

//input[@id = '56566_name']

//input[@id = '78999_name']

//input[@id = '32344_name*/
		 
		
		  ChromeOptions chromeOptions = new ChromeOptions();
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver(chromeOptions);

          driver.get("https://the-internet.herokuapp.com/tables"); // correct site with webtables
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

}
