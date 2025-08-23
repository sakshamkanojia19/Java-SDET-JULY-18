//package Session_16_08;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class WindowHandling {
//
//	public static void main(String[] args) {
//
//		
//		  ChromeOptions chromeOptions = new ChromeOptions();
//	        WebDriverManager.chromedriver().setup();
//	        WebDriver driver = new ChromeDriver(chromeOptions);
//
//	        driver.get(" driver.get(\"https://the-internet.herokuapp.com/dynamic_loading/1\");");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.OfSeconds(5));
//		
// 
//		WebElement clickhere = driver.findElement(By.xpath("//a[contains(text(),'Click']")) ;
//	
//		clickhere.click();
//		
//		
////		browser give session id to windows like 1 and 2 each in backend
////		fetch all the window handles  2 handles indexing concept : 1 -> 2 indexing 0 and 1 indexing 
//	
////	0 and 1 2 window handles 0  is default and 1 is another 
//		
////		convert to array
//	Object[] windowhandles = driver.getWindowHandles().toArray();
//		
//		
//		
//		driver.switchTo().window((String) windowhandles[1]); //moving to child 1
//		
//		
//		//assert on title of new windoww
//		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		
//		Thread.sleep(2000);
//		
//		driver.close(); //for closing session of second window and move back to parent 
//		
////		move back to parent to 0
//		
//		driver.switchTo().window((String) windowHandles[0]);
//		
//		drvier.quit();
//	
//	
//	
//	}
//
//}



package Session_16_08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

    public static void main(String[] args) {
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.get("https://the-internet.herokuapp.com/windows");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            WebElement clickhere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")) ;
            clickhere.click();

            // browser give session id to windows like 1 and 2 each in backend
            // fetch all the window handles  2 handles indexing concept : 1 -> 2 indexing 0 and 1 indexing 

            // 0 and 1 2 window handles 0  is default and 1 is another 

            // convert to array
            Object[] windowhandles = driver.getWindowHandles().toArray();

            driver.switchTo().window((String) windowhandles[1]); //moving to child 1

            // assert on title of new windoww
            String title = driver.getTitle();
            System.out.println(title);

            Thread.sleep(2000);

            driver.close(); //for closing session of second window and move back to parent 

            // move back to parent to 0
            driver.switchTo().window((String) windowhandles[0]);

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






