package TestNG_18_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Labsession_2_Booking2 {

    WebDriver driver;

    // Reusable clickEvent method
    public static void clickEvent(WebDriver driver, String xpath, String keys) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        if (!keys.isEmpty()) {
            element.clear();
            element.sendKeys(keys);
        }
    }

    // Setup before test
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Main booking flow test
    @Test
    @Parameters({"cityName", "checkinDate", "checkoutDate", "firstName", "lastName", "email", "phone", "address",
                 "traveller1First", "traveller1Last", "traveller2First", "traveller2Last"})
    public void bookingFlow(String cityName, String checkinDate, String checkoutDate,
                            String firstName, String lastName, String email, String phone, String address,
                            String t1First, String t1Last, String t2First, String t2Last) throws InterruptedException {
        driver.get("https://phptravels.net/");
        Thread.sleep(1500);

        // Hotels
        clickEvent(driver, "//ul[@id='tab']/li[2]/button", "");

        // City
        clickEvent(driver, "//span[@id='select2-hotels_city-container']", "");
        WebElement city = driver.findElement(By.xpath("//input[@role='searchbox']"));
        city.sendKeys(cityName);
        Thread.sleep(500);
        city.sendKeys(Keys.ENTER);

        // Dates
        clickEvent(driver, "//input[@id='checkin']", checkinDate);
        clickEvent(driver, "//input[@id='checkout']", checkoutDate);

        // Travellers
        clickEvent(driver, "//form[@id='hotels-search']//div[@class='dropdown dropdown-contain show active']", "");
        clickEvent(driver, "//input[@id='hotels_rooms']", "2");
        clickEvent(driver, "//input[@id='hotels_adults']", "");

        // Search
        clickEvent(driver, "//form[@id='hotels-search']//button[@type='submit']", "");

        // Select hotel
        Thread.sleep(2000);
        clickEvent(driver, "//li[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[2]//a[1]", "");

        // Book now
        Thread.sleep(4000);
        clickEvent(driver, "//button[@class='btn btn-primary rounded-1 waves-effect']", "");
        Thread.sleep(1000);

        // Personal info
        clickEvent(driver, "//input[@id='p-first-name']", firstName);
        clickEvent(driver, "//input[@id='p-last-name']", lastName);
        clickEvent(driver, "//input[@id='p-email']", email);
        clickEvent(driver, "//input[@id='p-phone']", phone);
        clickEvent(driver, "//input[@id='p-address']", address);

        // Traveller info
        clickEvent(driver, "//input[@name='firstname_1']", t1First);
        clickEvent(driver, "//input[@name='lastname_1']", t1Last);
        Thread.sleep(500);
        clickEvent(driver, "//input[@name='firstname_2']", t2First);
        clickEvent(driver, "//input[@name='lastname_2']", t2Last);

        // Payment & agreement
        clickEvent(driver, "//input[@id='gateway_bank_transfer']", "");
        clickEvent(driver, "//input[@id='agreechb']", "");

        // Confirm booking
        clickEvent(driver, "//div[@class='btn-box mt-3']", "");
    }

    // Cleanup after test
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}











/*
 * 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="BookingFlowSuite">

    <test name="BookingFlowTest">
        <parameter name="cityName" value="Dubai"/>
        <parameter name="checkinDate" value="25-08-2025"/>
        <parameter name="checkoutDate" value="26-08-2025"/>
        <parameter name="firstName" value="Mayank"/>
        <parameter name="lastName" value="Kumar"/>
        <parameter name="email" value="mayank@xyz.com"/>
        <parameter name="phone" value="9273293747"/>
        <parameter name="address" value="Gurgaon, Haryana, India"/>
        <parameter name="traveller1First" value="Mayank"/>
        <parameter name="traveller1Last" value="Kumar"/>
        <parameter name="traveller2First" value="Dhruv"/>
        <parameter name="traveller2Last" value="Mangla"/>

        <classes>
            <class name="labsession_18_08.Labsession2_BookingflowTest"/>
        </classes>
    </test>

</suite>

 * 
 * */
