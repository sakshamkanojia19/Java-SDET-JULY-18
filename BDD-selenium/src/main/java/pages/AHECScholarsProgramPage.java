package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AHECScholarsProgramPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By applyLink = By.xpath("//span[normalize-space()=\'Apply by September 30, 2024\']");
    private By firstNameField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.First_Name__c\']");
    private By lastNameField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Last_Name__c\']");
    private By birthdateField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Birthdate__c\']");
    private By genderDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Gender__c\']/option[2]");
    private By ethnicityDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Ethnicity__c\']/option[3]");
    private By raceDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Race__c\']/option[3]");
    private By residentialBackgroundDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Residential_Background__c\']/option[2]");
    private By languagesSpokenDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Languages_Spoken__c\']/option[2]");
    private By militaryStatusDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Military_Status__c\']/option[2]");
    private By nhscRecipientDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.National_Health_Service_Corps_Recipient__c\']/option[2]");
    private By mailingStreetField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Mailing_Street__c\']");
    private By mailingCityField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Mailing_City__c\']");
    private By mailingStateDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Mailing_State_Province__c\']/option[15]");
    private By mailingZipField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Mailing_Zip_Postal_Code__c\']");
    private By permanentStreetField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Permanent_Street__c\']");
    private By permanentCityField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Permanent_City__c\']");
    private By permanentStateDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Permanent_State_Province__c\']/option[15]");
    private By permanentZipField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Permanent_Zip_Postal_Code__c\']");
    private By mobilePhoneField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Mobile_Phone__c\']");
    private By personalEmailField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Personal_Email__c\']");
    private By universityDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Attending_University__c\']/option[13]");
    private By professionDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Individual_s_Profession__c\']/option[5]");
    private By primaryDisciplineDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Individual_Primary_Discipline_Specialty__c\']/option[2]");
    private By graduationDateField = By.xpath("//input[@id=\'AHEC_Scholar_Application__c.Anticipated_Graduation_Date__c\']");
    private By academicYearDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Academic_Year_Entering__c\']/option[14]");
    private By enrollmentStatusDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Enrollment_Status__c\']/option[2]");
    private By academicHonorsField = By.xpath("//textarea[@id=\'AHEC_Scholar_Application__c.Academic_Honors_Scholarships__c\']");
    private By howDidYouHearField = By.xpath("//textarea[@id=\'AHEC_Scholar_Application__c.How_Did_You_Hear_About_the_Program__c\']");
    private By essayChoiceDropdown = By.xpath("//*[@id=\'AHEC_Scholar_Application__c.Essay_Choice_Chosen__c\']/option[3]");
    private By essayPromptField = By.xpath("//textarea[@id=\'AHEC_Scholar_Application__c.Essay_Prompt__c\']");
    private By fileUploadButton = By.xpath("//label[@id=\'lblFileUpload124_Select\']");
    private By fileInputField = By.xpath("//input[@type=\'file\']");
    private By submitButton = By.id("btnsubmit");
    private By overlay = By.id("ffOverlay");

    // Constructor
    public AHECScholarsProgramPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public void clickApplyLink() {
        wait.until(ExpectedConditions.elementToBeClickable(applyLink)).click();
        try {
            Thread.sleep(5000); // Wait for new tab to open
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        List<String> handlesList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handlesList.get(1));
        wait.until(ExpectedConditions.urlContains("formstack.io"));
    }

    public void fillApplicationForm(String firstName, String lastName, String birthdate, String mailingStreet, String mailingCity, String mailingZip, String permanentStreet, String permanentCity, String permanentZip, String mobilePhone, String personalEmail, String graduationDate, String academicHonors, String howDidYouHear, String essayPrompt, String filePath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys(lastName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(birthdateField)).sendKeys(birthdate);
        driver.findElement(genderDropdown).click();
        driver.findElement(ethnicityDropdown).click();
        driver.findElement(raceDropdown).click();
        driver.findElement(residentialBackgroundDropdown).click();
        driver.findElement(languagesSpokenDropdown).click();
        driver.findElement(militaryStatusDropdown).click();
        driver.findElement(nhscRecipientDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mailingStreetField)).sendKeys(mailingStreet);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mailingCityField)).sendKeys(mailingCity);
        driver.findElement(mailingStateDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mailingZipField)).sendKeys(mailingZip);
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentStreetField)).sendKeys(permanentStreet);
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentCityField)).sendKeys(permanentCity);
        driver.findElement(permanentStateDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentZipField)).sendKeys(permanentZip);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobilePhoneField)).sendKeys(mobilePhone);
        wait.until(ExpectedConditions.visibilityOfElementLocated(personalEmailField)).sendKeys(personalEmail);
        driver.findElement(universityDropdown).click();
        driver.findElement(professionDropdown).click();
        driver.findElement(primaryDisciplineDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(graduationDateField)).sendKeys(graduationDate);
        driver.findElement(academicYearDropdown).click();
        driver.findElement(enrollmentStatusDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(academicHonorsField)).sendKeys(academicHonors);
        wait.until(ExpectedConditions.visibilityOfElementLocated(howDidYouHearField)).sendKeys(howDidYouHear);
        driver.findElement(essayChoiceDropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(essayPromptField)).sendKeys(essayPrompt);

        // File upload
        wait.until(ExpectedConditions.elementToBeClickable(fileUploadButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(fileInputField)).sendKeys(filePath);
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.invisibilityOfElementLocated(overlay));
    }

    public void submitApplicationForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public void closeFormTabAndSwitchBack() {
        List<String> handlesList = new ArrayList<>(driver.getWindowHandles());
        if (handlesList.size() > 1) {
            driver.close();
            driver.switchTo().window(handlesList.get(0));
        }
    }
}


