package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CoveringFloridaProgramPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By zipCodeField = By.id("zipCode");
    private By milesAwayDropdown = By.id("milesAway");
    private By languageDropdown = By.id("lang");
    private By inPersonCheckbox = By.id("in_person");
    private By submitButton = By.id("submit_button");
    private By successMessage = By.xpath("//h2[contains(text(),\"Open enrollment dates: November 1st – January 15th\")]");

    // Constructor
    public CoveringFloridaProgramPage(WebDriver driver) {
        this.setDriver(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public void fillAndSubmitForm(String zipCode, int milesAwayIndex, int langIndex) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeField)).sendKeys(zipCode);
        selectByIndex(milesAwayDropdown, milesAwayIndex);
        selectByIndex(languageDropdown, langIndex);
        wait.until(ExpectedConditions.elementToBeClickable(inPersonCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
    }

    private void selectByIndex(By locator, int index) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
        dropdown.findElement(By.xpath(".//option[" + (index + 1) + "]")).click();
    }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}


