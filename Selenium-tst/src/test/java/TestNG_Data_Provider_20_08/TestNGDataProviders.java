package TestNG_Data_Provider_20_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProviders {

    @DataProvider(name = "logindata", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"admin", "admin123"},
                {"adm", "admin123"},
                {"admn", "admin123"}
        };
    }

    @Test(dataProvider = "logindata")
    public void loginTest(String username, String password) throws InterruptedException {
        // Setup Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(2000);

            // Locate username field
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys(username);

            // Locate password field
            Thread.sleep(2000);
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys(password);

            // Click on login button
            Thread.sleep(2000);
            WebElement loginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
            loginButton.click();

            Thread.sleep(3000); // observe result before closing
        } finally {
            driver.quit(); // always close browser
        }
    }
}
