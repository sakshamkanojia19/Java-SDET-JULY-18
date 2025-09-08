package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HealthyAgingProgramPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By pageTitle = By.xpath("//h1[@class=\'entry-title\']");
    private By firstNameField = By.id("cog-input-auto-0");
    private By lastNameField = By.id("cog-input-auto-1");
    private By phoneField = By.id("cog-1");
    private By emailField = By.id("cog-2");
    private By taiChiCheckbox = By.xpath("//span[normalize-space()=\'Tai Chi for Arthritis\']");
    private By livingHealthyCheckbox = By.xpath("//span[normalize-space()=\'Living Healthy (Chronic Disease Self-Management)\"]");
    private By escambiaCheckbox = By.xpath("//span[normalize-space()=\'Escambia\']");
    private By radioOption = By.xpath("//label[@class=\'el-radio cog-checkable__item cog-choice-option is-checked\']//span[@class=\'el-radio__inner\']");
    private By occupationField = By.id("cog-6");
    private By commentsField = By.id("cog-7");
    private By submitButton = By.xpath("//span[@class=\'cog-button__text\']");
    private By successMessage = By.xpath("//h1[normalize-space()=\'TAI CHI FOR ARTHRITIS & FALLS PREVENTION\']");

    // Constructor
    public HealthyAgingProgramPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }

    public void fillForm(String firstName, String lastName, String phone, String email, String occupation, String comments) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys(lastName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneField)).sendKeys(phone);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
        
        // Scroll to and click checkboxes
        scrollToElement(taiChiCheckbox);
        wait.until(ExpectedConditions.elementToBeClickable(taiChiCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(livingHealthyCheckbox)).click();
        scrollToElement(escambiaCheckbox);
        wait.until(ExpectedConditions.elementToBeClickable(escambiaCheckbox)).click();
        scrollToElement(radioOption);
        wait.until(ExpectedConditions.elementToBeClickable(radioOption)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(occupationField)).sendKeys(occupation);
        wait.until(ExpectedConditions.visibilityOfElementLocated(commentsField)).sendKeys(comments);
    }

    public void submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
    }

    // Generic method to scroll to an element
    private void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}


