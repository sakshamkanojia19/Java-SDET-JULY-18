package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TobaccoProgramPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By quitTobaccoReadMoreLink = By.xpath("//a[@href=\"/tobacco/quit-tobacco/\"][normalize-space()=\"Read More\"]");
    private By pageTitle = By.xpath("//h1[@class=\'entry-title\']");

    // Constructor
    public TobaccoProgramPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public void clickQuitTobaccoReadMore() {
        wait.until(ExpectedConditions.elementToBeClickable(quitTobaccoReadMoreLink)).click();
        wait.until(ExpectedConditions.titleContains("Quit Tobacco"));
    }

    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}

