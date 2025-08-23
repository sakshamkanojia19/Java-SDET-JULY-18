package labsession_18_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Labsession2_Bookingflow {

    // ✅ Robust clickEvent (scroll + JS fallback)
    public static void clickEvent(WebDriver driver, String xpath, String inputText) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
        Thread.sleep(500);

        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }

        if (inputText != null && !inputText.isEmpty()) {
            element.clear();
            element.sendKeys(inputText);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        Thread.sleep(1500);

        // ✅ Hotels tab
        clickEvent(driver, "//ul[@id='tab']/li[2]/button", "");

        // ✅ City
        clickEvent(driver, "//span[@id='select2-hotels_city-container']", "");
        WebElement city = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@role='searchbox']")));
        city.sendKeys("Dubai");
        Thread.sleep(500);
        city.sendKeys(Keys.ENTER);

        // ✅ Checkin / Checkout
        clickEvent(driver, "//input[@id='checkin']", "25-08-2025");
        clickEvent(driver, "//input[@id='checkout']", "26-08-2025");

        // ✅ Travellers dropdown
        clickEvent(driver, "//form[@id='hotels-search']//div[contains(@class,'dropdown')]", "");

        // ✅ Rooms + Adults
        clickEvent(driver, "//input[@id='hotels_rooms']", "2");
        clickEvent(driver, "//input[@id='hotels_adults']", "2");

        // ✅ Search
        clickEvent(driver, "//form[@id='hotels-search']//button[@type='submit']", "");

        // ✅ Wait and select first hotel (with scroll + JS fallback)
        Thread.sleep(2000);
        WebElement firstHotel = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(@href,'details')])[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", firstHotel);
        Thread.sleep(1000);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(firstHotel)).click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstHotel);
        }

        // ✅ Book Now
        Thread.sleep(4000);
        clickEvent(driver, "//button[@class='btn btn-primary rounded-1 waves-effect']", "");
        Thread.sleep(1000);

        // ✅ Personal Info
        clickEvent(driver, "//input[@id='p-first-name']", "Saksham");
        clickEvent(driver, "//input[@id='p-last-name']", "Kanojia");
        clickEvent(driver, "//input[@id='p-email']", "saksham@xyz.com");
        clickEvent(driver, "//input[@id='p-phone']", "9047459639");
        clickEvent(driver, "//input[@id='p-address']", "Gurgaon, Haryana, India");

        // ✅ Travellers Info
        clickEvent(driver, "//input[@name='firstname_1']", "Saksham");
        clickEvent(driver, "//input[@name='lastname_1']", "Kanojia");
        Thread.sleep(500);
        clickEvent(driver, "//input[@name='firstname_2']", "Sita");
        clickEvent(driver, "//input[@name='lastname_2']", "Kanojia");

        // ✅ Select Payment
        clickEvent(driver, "//input[@id='gateway_bank_transfer']", "");

        // ✅ Agreement checkbox
        clickEvent(driver, "//input[@id='agreechb']", "");

        // ✅ Confirm booking
        clickEvent(driver, "//div[@class='btn-box mt-3']", "");

        // Optional close
        // driver.quit();
    }
}
