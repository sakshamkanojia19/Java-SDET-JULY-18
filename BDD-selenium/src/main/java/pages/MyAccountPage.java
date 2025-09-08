package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MyAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By pageHeader = By.cssSelector("h1.entry-title");
    private By regUsernameField = By.id("reg_username");
    private By regEmailField = By.id("reg_email");
    private By regPasswordField = By.id("reg_password");
    private By registerButton = By.name("register");
    private By cloudflareIframe = By.cssSelector("iframe[id^=\'cf-chl-widget\'], iframe[src*=\'challenges.cloudflare.com\']");

    // Constructor
    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public String getPageHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageHeader)).getText();
    }

    public void enterRegistrationDetails(String username, String email, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(regUsernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(regEmailField)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(regPasswordField)).sendKeys(password);
    }

    public void clickRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
    }

    public boolean isCaptchaPresent() {
        return !driver.findElements(cloudflareIframe).isEmpty();
    }

    public void waitForCaptchaToSolve() {
        WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(50));
        longWait.until(driver1 -> driver1.findElements(cloudflareIframe).isEmpty());
    }
}


