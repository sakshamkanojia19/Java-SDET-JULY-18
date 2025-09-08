//
//package utils;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
// 
//import io.github.bonigarcia.wdm.WebDriverManager;
// 
//public class DriverFactory {
//	public  static WebDriver driver;
//	public static WebDriver getDriver() {
//		if (driver == null ) {
//			ChromeOptions chromeOptions = new ChromeOptions();
// 
//			WebDriverManager.chromedriver().setup();
// 
//			driver = new ChromeDriver(chromeOptions);
//	        driver.manage().window().maximize();
//		}
//		return driver;
//	}
//	public static void quitDriver() {
//
//		if(driver != null) {
//
//			driver.quit();
//			driver = null;
//		}
//	}
//
//
// 
//}


//DriverFactory for better screenshots

/*
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*"); 
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
*/



//Driver Factory for Registration

//package utils;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DriverFactory {
//    private static WebDriver driver;
//
//    public static WebDriver getDriver() {
//        if (driver == null) {
//            WebDriverManager.chromedriver().setup();
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*"); 
//            driver = new ChromeDriver(options);
//            driver.manage().window().maximize();
//        }
//        return driver;
//    }
//
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//}


package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverFactory {
   private static WebDriver driver;
   public static WebDriver getDriver() {
       if (driver == null) {
           WebDriverManager.chromedriver().setup();
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--remote-allow-origins=*");
           driver = new ChromeDriver(options);
           driver.manage().window().maximize();
       }
       return driver;
   }
   public static void quitDriver() {
       if (driver != null) {
           driver.quit();
           driver = null;
       }
   }
}



