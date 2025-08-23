//package Session_16_08;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class WebTable {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		  ChromeOptions chromeOptions = new ChromeOptions();
//          WebDriverManager.chromedriver().setup();
//          WebDriver driver = new ChromeDriver(chromeOptions);
//
//          driver.get("https://www.amazon.in");
//          driver.manage().window().maximize();
//
//          //xpath //table[@id = 'table1']/thead/tr/th[2]
//// for email  th[3], 
//          //for Frank //table[@id='table1']/tbody/tr[2]/td[2]
//          
////          for tconway@earthlink.net email access :  //table[@id = 'table1']/tbody/tr[4]/td[3]
//          
//          
//   //find the number of rows present
//          
//          List<WebElement> rows = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr"));
//          
//          
//          int rowcount  = rows.size();
//          
//          System.out.println(rowcount);
//          
//          List<WebElement> rows = driver.findElement(By.xpath("//table[@id = 'table1']/thead/tr[1]/th"));
//          
//             //number of columns
//          
//          
//          int colucount  = cols.size();
//          
//          System.out.println(colocount);
//          
//          
//          //text of a cell
//          
//          
//          WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
//          
//          String actualcelltext = celltext.getText();
//          
//          String expectedcelltext = "tconway@earthlink.net";
//          
//          if(actualcelltext == expectedcelltext) {
//        	  System.out.println(" The text matched");
//          } else {
//        	  System.out.println("Text not matched");
//          }
//          
//	}
//
//}




package Session_16_08;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.get("https://the-internet.herokuapp.com/tables"); // correct site with webtables
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            // xpath //table[@id = 'table1']/thead/tr/th[2]
            // for email  th[3], 
            // for Frank //table[@id='table1']/tbody/tr[2]/td[2]

            // for tconway@earthlink.net email access :  //table[@id = 'table1']/tbody/tr[4]/td[3]

            // find the number of rows present
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
            int rowcount = rows.size();
            System.out.println("Row count: " + rowcount);

            // number of columns
            List<WebElement> cols = driver.findElements(By.xpath("//table[@id = 'table1']/thead/tr[1]/th"));
            int colcount = cols.size();
            System.out.println("Column count: " + colcount);

            // text of a cell
            WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
            String actualcelltext = celltext.getText();
            String expectedcelltext = "tconway@earthlink.net";

            if (actualcelltext.equals(expectedcelltext)) {
                System.out.println("The text matched");
            } else {
                System.out.println("Text not matched");
            }

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
