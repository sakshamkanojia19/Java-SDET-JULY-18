package TestNG_Selenium_Frame_19_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestNGLogin {

    // Using Log4j logger
    private static final Logger log = LogManager.getLogger(TestNGLogin.class);
 
    /*
    [10:49, 20/08/2025] +91 90276 81589: private static final Logger log = LogManager.getLogger(TestNGTestcase.class);
[10:50, 20/08/2025] +91 90276 81589: If we write this line instead of the one given by ma'am and import LogManager 
then we don't have to create LoggerHelper file I don't know why ma'am is making it lengthy process
     * */
    
    
    @Test
    public void launchbrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/windows");
        log.info("Invoking the browser");
        // maximize the window
        driver.manage().window().maximize();

        driver.quit();
    }

    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        log.info("Navigated to OrangeHRM Login Page");

        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        log.info("Entering the username");
        username.sendKeys("Admin");

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        log.info("Entering the password");
        password.sendKeys("admin123");

        Thread.sleep(2000);
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
        loginbutton.click();
        log.info("Clicked on Login button");

        Thread.sleep(2000);
        driver.quit();
    }
}
