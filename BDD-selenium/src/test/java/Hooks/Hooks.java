//package Hooks;
//
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import utils.DriverFactory;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
// 
//public class Hooks {
//
// 
//	
//	// Inject WebDriver from DriverFactory
//	 @Before
//	 public void setUp() {
//		 DriverFactory.getDriver();
//		 System.out.println("Browser launched before scenario");
//	 }
//	 @After
//	 public void tearDown(Scenario scenario) {
//		 WebDriver driver = DriverFactory.getDriver();
//		 if(scenario.isFailed()) {
//			  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	          scenario.attach(screenshot, "image/png", "Failed Screenshot"); 
//		 }
//		 DriverFactory.quitDriver();
//		 System.out.println("Browser closed after the scenario");
//
//
//
//	 }
//
//
//
//}




//Hooks for better screenshot capability in negative cases

/*
package Hooks;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
        System.out.println("Browser launched before scenario");
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = DriverFactory.getDriver();

        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName() + "_FailedScreenshot");
                System.out.println("📸 Screenshot captured for failed scenario: " + scenario.getName());
            } catch (Exception e) {
                System.out.println("⚠️ Screenshot capture failed: " + e.getMessage());
            }
        }

        DriverFactory.quitDriver();
        System.out.println("Browser closed after the scenario");
    }
}
*/



//try 2
//package Hooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import utils.DriverFactory;
//
//public class Hooks {
//
//    private WebDriver driver;
//
//    @Before
//    public void setUp() {
//        driver = DriverFactory.getDriver();
//        System.out.println("Browser launched before scenario");
//    }
//
//    @After
//    public void tearDown(Scenario scenario) {
//        try {
//            if (scenario.isFailed() && driver != null) {
//                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", scenario.getName());
//                System.out.println("📸 Screenshot attached for failed scenario: " + scenario.getName());
//            }
//        } catch (Exception e) {
//            System.out.println("⚠️ Could not capture screenshot: " + e.getMessage());
//        } finally {
//            DriverFactory.quitDriver();   // ✅ close after screenshot
//            System.out.println("Browser closed after the scenario");
//        }
//    }
//}


 //Hooks for tutorials registeration testing

package Hooks;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
        System.out.println("Browser launched before scenario");
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = DriverFactory.getDriver();
        
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName() + "_FailedScreenshot");
                System.out.println("📸 Screenshot captured for failed scenario: " + scenario.getName());
            } catch (Exception e) {
                System.out.println("⚠️ Screenshot capture failed: " + e.getMessage());
            }
        }
        
        DriverFactory.quitDriver();
        System.out.println("Browser closed after the scenario");
    }
}


