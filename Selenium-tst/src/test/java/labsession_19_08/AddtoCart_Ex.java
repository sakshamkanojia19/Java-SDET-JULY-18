package labsession_19_08;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListener2.class)
public class AddtoCart_Ex {

    WebDriver driver;
    SoftAssert soft;

    @BeforeMethod
    public void setUp() {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        soft = new SoftAssert();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        soft.assertAll();
    }

    @Parameters("Cart")
    @Test(groups = {"Sanity", "Regression"})
    public void cart(@Optional("Electronics") String Cart) throws InterruptedException {
        try {
            if (Cart.equalsIgnoreCase("Electronics")) {

                driver.get("https://www.demoblaze.com/index.html");

                // ✅ Verify Page Title
                soft.assertEquals(driver.getTitle(), "STORE", "Page title mismatch!");

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // ---- Add iPhone ----
                WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']"));
                phone.click();

                WebElement iphone = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
                iphone.click();

                wait.until(ExpectedConditions.alertIsPresent());
                Alert alt = driver.switchTo().alert();
                alt.accept();
                Thread.sleep(2000);

                // Navigate Home
                WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
                home.click();

                // ---- Add MacBook Air ----
                WebElement laptops = driver.findElement(By.xpath("//a[3]"));
                laptops.click();

                WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='MacBook air']"));
                laptop.click();

                WebElement macbook = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
                macbook.click();

                wait.until(ExpectedConditions.alertIsPresent());
                Alert alt1 = driver.switchTo().alert();
                alt1.accept();
                Thread.sleep(2000);

                // ---- Go to Cart ----
                WebElement adc = driver.findElement(By.xpath("//a[@id='cartur']"));
                adc.click();

                soft.assertTrue(driver.getCurrentUrl().contains("cart"), "Cart page not opened!");

                // ---- Place Order ----
                WebElement order = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
                order.click();

                driver.findElement(By.id("name")).sendKeys("Saksham");
                driver.findElement(By.id("country")).sendKeys("India");
                driver.findElement(By.id("city")).sendKeys("Delhi");
                Thread.sleep(2000);
                driver.findElement(By.id("card")).sendKeys("4581 4455 9999");
                Thread.sleep(2000);
                driver.findElement(By.id("month")).sendKeys("August");
                Thread.sleep(2000);
                driver.findElement(By.id("year")).sendKeys("2025");
                Thread.sleep(2000);

                driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();

                // ✅ Verify Purchase Confirmation
                WebElement okBtn = wait.until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));
                soft.assertTrue(okBtn.isDisplayed(), "Confirmation dialog not displayed!");
                okBtn.click();
                Thread.sleep(2000);

            } else {
                Assert.fail("Invalid Cart parameter provided!");
            }
        } catch (Exception e) {
            // ✅ Print full stacktrace for debugging
            e.printStackTrace();
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
    }
}
