package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By searchToggleButton = By.cssSelector("div.fusion-search-button.search-button, div.fusion-search-toggle");
    private By searchBox = By.name("s");
    private By searchSubmitButton = By.cssSelector("input.fusion-search-submit.searchsubmit, input[type='submit'][aria-label='Search']");
    private By programsMenu = By.xpath("//a[@aria-haspopup='true']//span[@class='menu-text'][normalize-space()='PROGRAMS']");
    private By servicesMenu = By.xpath("//a[@aria-haspopup='true']//span[@class='menu-text'][normalize-space()='SERVICES']");
    private By myAccountLink = By.xpath("//a[.//span[normalize-space()='My Account'] or normalize-space(.)='My Account']");
    private By quitTobaccoLink = By.xpath("//li[@id='menu-item-344']//span[contains(text(),'Tobacco')]");
    private By healthyAgingLink = By.xpath("//li[@id='menu-item-534']//span[contains(text(),'Healthy Aging')]");
    private By ahecScholarsLink = By.xpath("//li[@id='menu-item-280']//span[contains(text(),'AHEC Scholars')]");
    private By coveringFloridaLink = By.xpath("//li[@id='menu-item-1572']//span[contains(text(),'Covering Florida')]");
    private By communityBasedEducationLink = By.xpath("//li[@id='menu-item-440']//span[contains(text(),'Community Based Student Education and Training')]");
    private By continuingEducationLink = By.xpath("//li[@id='menu-item-441']//span[contains(text(),'Continuing Education')]");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public void navigateToHomePage(String url) {
        driver.get(url);
        wait.until(ExpectedConditions.titleContains("West Florida"));
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void performSearch(String searchText) {
        // Toggle search if button exists
        if (!driver.findElements(searchToggleButton).isEmpty()) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(searchToggleButton)).click();
            } catch (Exception ignore) {}
        }
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchInput.clear();
        searchInput.sendKeys(searchText);
        wait.until(ExpectedConditions.elementToBeClickable(searchSubmitButton)).click();
        wait.until(ExpectedConditions.or(
                ExpectedConditions.urlContains("s="),
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("article"))
        ));
    }

    public void navigateBack() {
        driver.navigate().back();
        wait.until(ExpectedConditions.titleContains("West Florida"));
    }

    public void clickMyAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(myAccountLink)).click();
        wait.until(ExpectedConditions.titleContains("My account"));
    }

    public void hoverProgramsMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(programsMenu))).perform();
    }

    public void clickQuitTobacco() {
        wait.until(ExpectedConditions.elementToBeClickable(quitTobaccoLink)).click();
        wait.until(ExpectedConditions.titleContains("Tobacco"));
    }

    public void clickHealthyAging() {
        wait.until(ExpectedConditions.elementToBeClickable(healthyAgingLink)).click();
        wait.until(ExpectedConditions.titleContains("Healthy Aging"));
    }

    public void clickAHECScholars() {
        wait.until(ExpectedConditions.elementToBeClickable(ahecScholarsLink)).click();
        wait.until(ExpectedConditions.titleContains("AHEC Scholars"));
    }

    public void clickCoveringFlorida() {
        wait.until(ExpectedConditions.elementToBeClickable(coveringFloridaLink)).click();
        wait.until(ExpectedConditions.titleContains("Covering Florida"));
    }

    public void hoverServicesMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(servicesMenu))).perform();
    }

    public void clickCommunityBasedEducation() {
        wait.until(ExpectedConditions.elementToBeClickable(communityBasedEducationLink)).click();
        wait.until(ExpectedConditions.titleContains("Community Based Student Education and Training"));
    }

    public void clickContinuingEducation() {
        wait.until(ExpectedConditions.elementToBeClickable(continuingEducationLink)).click();
        wait.until(ExpectedConditions.titleContains("Continuing Education"));
    }

    // Generic method to click an element by its text (useful for dynamic elements)
    public void clickElementByText(String text) {
        By locator = By.xpath(String.format("//*[normalize-space()='%s']", text));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Generic method to scroll to an element
    public void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}


