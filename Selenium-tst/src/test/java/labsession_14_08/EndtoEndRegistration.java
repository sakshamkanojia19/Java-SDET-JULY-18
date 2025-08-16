package labsession_14_08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class EndtoEndRegistration {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

            // First Name
            driver.findElement(By.id("name")).sendKeys("Saksham Kanojia");

            // Email
            driver.findElement(By.id("email")).sendKeys("sakshamkanojia2020@gmail.com");

            // Gender
            driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

            // Mobile
            driver.findElement(By.id("mobile")).sendKeys("9310244655");

            // Date of Birth
            WebElement dob = driver.findElement(By.id("dob"));
            dob.clear();
            dob.sendKeys("19 Sep 2002");
            dob.sendKeys(Keys.ENTER);

            // Subjects
            WebElement subjectInput = driver.findElement(By.id("subjects"));
            subjectInput.sendKeys("PCMB");
            subjectInput.sendKeys(Keys.ENTER);

            // Hobbies - Sports
            driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();

            // Picture upload
            driver.findElement(By.id("picture"))
                    .sendKeys("C:\\Users\\ASUS\\Downloads\\Passport-size-saksham-kanojia-photo.jpg");

            // Current Address
            driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"))
                    .sendKeys("16/5 ms extension");

            // State
            WebElement stateDropdown = driver.findElement(By.id("state"));
            stateDropdown.click();
            driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();

            // City
            WebElement cityDropdown = driver.findElement(By.id("city"));
            cityDropdown.click();
            driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();

            // Submit
            driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();

            System.out.println("Registration form submitted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Optional: driver.quit();
        }
    }
}
