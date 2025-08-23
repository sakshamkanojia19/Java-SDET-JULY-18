package TestNG_18_08;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Labsession2_BookingflowTest {

    WebDriver driver;

    // --- Reusable method ---
    public static void clickEvent(WebDriver driver, String xpath, String keys) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        if (!keys.isEmpty()) {
            element.clear();
            element.sendKeys(keys);
        }
    }

    // --- Setup ---
    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }

    // --- Open App ---
    @Test(priority = 1, groups = {"smoke"})
    public void openApp() throws InterruptedException {
        driver.get("https://phptravels.net/");
        Thread.sleep(1500);
        Assert.assertTrue(driver.getTitle().contains("PHPTRAVELS"));
    }

    // --- Select Hotel & City ---
    @Test(priority = 2, groups = {"regression"}, dependsOnMethods = {"openApp"})
    @Parameters("cityName")
    public void selectHotelCity(String cityName) throws InterruptedException {
        clickEvent(driver, "//ul[@id='tab']/li[2]/button", "");
        clickEvent(driver, "//span[@id='select2-hotels_city-container']", "");
        WebElement city = driver.findElement(By.xpath("//input[@role='searchbox']"));
        city.sendKeys(cityName);
        Thread.sleep(500);
        city.sendKeys(Keys.ENTER);
    }

    // --- Dates ---
    @Test(priority = 3, groups = {"regression"}, dependsOnMethods = {"selectHotelCity"})
    @Parameters({"checkinDate", "checkoutDate"})
    public void selectDates(String checkinDate, String checkoutDate) throws InterruptedException {
        clickEvent(driver, "//input[@id='checkin']", checkinDate);
        clickEvent(driver, "//input[@id='checkout']", checkoutDate);
    }

    // --- Travellers ---
    @Test(priority = 4, groups = {"sanity"}, dependsOnMethods = {"selectDates"})
    public void selectTravellers() throws InterruptedException {
        clickEvent(driver, "//form[@id='hotels-search']//div[@class='dropdown dropdown-contain show active']", "");
        clickEvent(driver, "//input[@id='hotels_rooms']", "2");
        clickEvent(driver, "//input[@id='hotels_adults']", "");
    }

    // --- Search ---
    @Test(priority = 5, groups = {"smoke"}, dependsOnMethods = {"selectTravellers"})
    public void searchHotels() throws InterruptedException {
        clickEvent(driver, "//form[@id='hotels-search']//button[@type='submit']", "");
    }

    // --- Select Hotel ---
    @Test(priority = 6, groups = {"regression"}, dependsOnMethods = {"searchHotels"})
    public void selectHotel() throws InterruptedException {
        Thread.sleep(2000);
        clickEvent(driver, "//li[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[2]//a[1]", "");
    }

    // --- Book Now ---
    @Test(priority = 7, groups = {"regression"}, dependsOnMethods = {"selectHotel"})
    public void bookNow() throws InterruptedException {
        Thread.sleep(4000);
        clickEvent(driver, "//button[@class='btn btn-primary rounded-1 waves-effect']", "");
    }

    // --- Personal Information ---
    @Test(priority = 8, groups = {"sanity"}, dependsOnMethods = {"bookNow"})
    @Parameters({"firstName", "lastName", "email", "phone", "address"})
    public void enterPersonalInfo(String firstName, String lastName, String email, String phone, String address) throws InterruptedException {
        clickEvent(driver, "//input[@id='p-first-name']", firstName);
        clickEvent(driver, "//input[@id='p-last-name']", lastName);
        clickEvent(driver, "//input[@id='p-email']", email);
        clickEvent(driver, "//input[@id='p-phone']", phone);
        clickEvent(driver, "//input[@id='p-address']", address);
    }

    // --- Traveller Information ---
    @Test(priority = 9, groups = {"sanity"}, dependsOnMethods = {"enterPersonalInfo"})
    @Parameters({"traveller1First", "traveller1Last", "traveller2First", "traveller2Last"})
    public void enterTravellerInfo(String t1First, String t1Last, String t2First, String t2Last) throws InterruptedException {
        clickEvent(driver, "//input[@name='firstname_1']", t1First);
        clickEvent(driver, "//input[@name='lastname_1']", t1Last);
        Thread.sleep(500);
        clickEvent(driver, "//input[@name='firstname_2']", t2First);
        clickEvent(driver, "//input[@name='lastname_2']", t2Last);
    }

    // --- Payment & Agreement ---
    @Test(priority = 10, groups = {"regression"}, dependsOnMethods = {"enterTravellerInfo"})
    public void paymentAndAgreement() throws InterruptedException {
        clickEvent(driver, "//input[@id='gateway_bank_transfer']", "");
        clickEvent(driver, "//input[@id='agreechb']", "");
    }

    // --- Confirm Booking ---
    @Test(priority = 11, groups = {"smoke"}, dependsOnMethods = {"paymentAndAgreement"})
    public void confirmBooking() throws InterruptedException {
        clickEvent(driver, "//div[@class='btn-box mt-3']", "");
    }

    // --- Tear Down ---
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}





/*



testng.xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="BookingFlowSuite" parallel="false">

    <parameter name="browser" value="chrome"/>
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

    <test name="BookingFlowTests">
        <groups>
            <run>
                <include name="smoke"/>
                <include name="regression"/>
                <include name="sanity"/>
            </run>
        </groups>

        <classes>
            <class name="labsession_18_08.Labsession2_BookingflowTest"/>
        </classes>
    </test>

</suite>





 * 
 * */
