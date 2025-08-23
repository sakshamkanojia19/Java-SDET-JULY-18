package TestNG_18_08;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillingTest {

    WebDriver driver;

    // --- Setup ---
    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOption = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOption);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // --- Open Application ---
    @Test(priority = 1, groups = {"smoke"})
    public void openApp() {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }

    // --- Fill Personal Details ---
    @Test(priority = 2, groups = {"regression"}, dependsOnMethods = {"openApp"})
    @Parameters({"firstName", "lastName"})
    public void fillName(String firstName, String lastName) {
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        driver.findElement(By.name("lastname")).sendKeys(lastName);
    }

    // --- Select Gender & Experience ---
    @Test(priority = 3, groups = {"regression"}, dependsOnMethods = {"fillName"})
    public void selectGenderExperience() {
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-0")).click();
    }

    // --- Fill Date ---
    @Test(priority = 4, groups = {"regression"}, dependsOnMethods = {"selectGenderExperience"})
    @Parameters("dateValue")
    public void fillDate(String dateValue) {
        driver.findElement(By.id("datepicker")).sendKeys(dateValue);
    }

    // --- Select Profession & Tools ---
    @Test(priority = 5, groups = {"sanity"}, dependsOnMethods = {"fillDate"})
    public void selectProfessionTools() {
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
    }

    // --- Select Continent & Commands ---
    @Test(priority = 6, groups = {"sanity"}, dependsOnMethods = {"selectProfessionTools"})
    public void selectContinentCommands() {
        driver.findElement(By.id("continents")).click();
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();
    }

    // --- File Upload ---
    @Test(priority = 7, groups = {"regression"}, dependsOnMethods = {"selectContinentCommands"})
    @Parameters("filePath")
    public void uploadFile(String filePath) throws InterruptedException {
        driver.findElement(By.id("photo")).sendKeys(filePath);
        Thread.sleep(2000);
    }

    // --- Submit Form ---
    @Test(priority = 8, groups = {"smoke"}, dependsOnMethods = {"uploadFile"})
    public void submitForm() throws InterruptedException {
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
    }

    // --- Tear Down ---
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}





//TestNG.xml of this file 


/*
 *
 * 
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="FormFillingSuite" parallel="false">

    <parameter name="browser" value="chrome"/>
    <parameter name="firstName" value="Varaprasad"/>
    <parameter name="lastName" value="Reddy"/>
    <parameter name="dateValue" value="18-08-2025"/>
    <parameter name="filePath" value="C:\\Users\\princ\\Downloads\\New folder\\test-file.txt"/>

    <test name="FormFillingTests">
        <groups>
            <run>
                <include name="smoke"/>
                <include name="regression"/>
                <include name="sanity"/>
            </run>
        </groups>

        <classes>
            <class name="labsession_18_08.FormFillingTest"/>
        </classes>
    </test>

</suite>

 * */

