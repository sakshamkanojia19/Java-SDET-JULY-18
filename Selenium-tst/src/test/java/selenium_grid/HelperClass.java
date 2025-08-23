//package selenium_grid;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//public class HelperClass {
//
//    // Remote WebDriver to support remote execution on Grid
//    // ThreadLocal is used for parallel execution
//    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
//
//    // Hub URL (make sure it matches your hub machine)
//    public static String remote_url = "http://192.168.1.3:4444";  // ✅ updated to hub IP
//
//    @BeforeMethod
//    public void setDriver() throws MalformedURLException {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*"); // avoids some chrome 111+ issues
//        driver.set(new RemoteWebDriver(new URL(remote_url), options));
//
//        driver.get().get("https://opensource-demo.orangehrmlive.com/");
//        driver.get().manage().window().maximize();
//    }
//
//    public WebDriver getDriver() {
//        return driver.get();
//    }
//
//    @AfterMethod
//    public void closeBrowser() {
//        if (driver.get() != null) {
//            driver.get().quit();
//            driver.remove();
//        }
//    }
//}




//For multiple browsers



package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HelperClass {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url = "http://192.168.1.3:4444"; // Hub IP

    public void setDriver(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver.set(new RemoteWebDriver(new URL(remote_url), options));
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver.set(new RemoteWebDriver(new URL(remote_url), options));
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        driver.get().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void closeBrowser() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
