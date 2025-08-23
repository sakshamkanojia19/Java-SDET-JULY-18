package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

public class RegisterPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By maleRadio = By.xpath("(//input[@type='radio'])[1]");
    private By femaleRadio = By.xpath("(//input[@type='radio'])[2]");
    private By otherRadio = By.xpath("(//input[@type='radio'])[3]");
    private By mobileField = By.xpath("//input[@id='mobile']");
    private By dobField = By.xpath("//input[@id='dob']");
    private By subjectsField = By.id("subjects");
    private By sportsCheckbox = By.xpath("//input[@value='Sports']");
    private By readingCheckbox = By.xpath("//input[@value='Reading']");
    private By musicCheckbox = By.xpath("//input[@value='Music']");
    private By pictureField = By.id("picture");
    private By addressField = By.id("currentAddress");
    private By stateDropdown = By.id("state");
    private By cityDropdown = By.id("city");
    private By submitButton = By.xpath("//input[@value='Login']");
    private By successModal = By.xpath("//div[@class='modal-content']");
    private By errorMessage = By.xpath("//div[contains(@class,'alert') or contains(@class,'error')]");

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public void enterName(String name) throws InterruptedException {
        try {
            WebElement nameElement = wait.until(ExpectedConditions.elementToBeClickable(nameField));
            nameElement.clear();
            nameElement.sendKeys(name);
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter name: " + e.getMessage());
        }
    }

    public void enterEmail(String email) throws InterruptedException {
        try {
            WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(emailField));
            emailElement.clear();
            emailElement.sendKeys(email);
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter email: " + e.getMessage());
        }
    }

    public void selectGender(String gender) throws InterruptedException {
        try {
            WebElement genderElement;
            switch (gender.toLowerCase()) {
                case "male":
                    genderElement = wait.until(ExpectedConditions.elementToBeClickable(maleRadio));
                    break;
                case "female":
                    genderElement = wait.until(ExpectedConditions.elementToBeClickable(femaleRadio));
                    break;
                case "other":
                    genderElement = wait.until(ExpectedConditions.elementToBeClickable(otherRadio));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid gender: " + gender);
            }
            if (!genderElement.isSelected()) {
                genderElement.click();
            }
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to select gender: " + e.getMessage());
        }
    }

    public void enterMobile(String mobile) throws InterruptedException {
        try {
            WebElement mobileElement = wait.until(ExpectedConditions.elementToBeClickable(mobileField));
            mobileElement.clear();
            mobileElement.sendKeys(mobile);
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter mobile: " + e.getMessage());
        }
    }

    public void enterDOB(String dob) throws InterruptedException {
        try {
            WebElement dobElement = wait.until(ExpectedConditions.elementToBeClickable(dobField));
            dobElement.clear();
            dobElement.sendKeys(dob);
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter DOB: " + e.getMessage());
        }
    }

    public void enterSubjects(String subjects) throws InterruptedException {
        try {
            WebElement subjectsElement = wait.until(ExpectedConditions.elementToBeClickable(subjectsField));
            subjectsElement.clear();
            subjectsElement.sendKeys(subjects);
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter subjects: " + e.getMessage());
        }
    }

    public void selectHobbies(List<String> hobbies) throws InterruptedException {
        try {
            for (String hobby : hobbies) {
                WebElement hobbyElement;
                switch (hobby.toLowerCase().trim()) {
                    case "sports":
                        hobbyElement = wait.until(ExpectedConditions.elementToBeClickable(sportsCheckbox));
                        break;
                    case "reading":
                        hobbyElement = wait.until(ExpectedConditions.elementToBeClickable(readingCheckbox));
                        break;
                    case "music":
                        hobbyElement = wait.until(ExpectedConditions.elementToBeClickable(musicCheckbox));
                        break;
                    default:
                        System.out.println("Unknown hobby: " + hobby);
                        continue;
                }
                if (!hobbyElement.isSelected()) {
                    hobbyElement.click();
                }
                Thread.sleep(300);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to select hobbies: " + e.getMessage());
        }
    }

    public void uploadPicture(String filePath) throws InterruptedException {
        try {
            WebElement pictureElement = wait.until(ExpectedConditions.presenceOfElementLocated(pictureField));
            pictureElement.sendKeys(filePath);
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException("Failed to upload picture: " + e.getMessage());
        }
    }

    public void enterAddress(String address) throws InterruptedException {
        try {
            WebElement addressElement = wait.until(ExpectedConditions.elementToBeClickable(addressField));
            addressElement.clear();
            addressElement.sendKeys(address);
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter address: " + e.getMessage());
        }
    }

    public void selectState(String state) throws InterruptedException {
        try {
            WebElement stateElement = wait.until(ExpectedConditions.elementToBeClickable(stateDropdown));
            Select stateSelect = new Select(stateElement);
            stateSelect.selectByVisibleText(state);
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException("Failed to select state: " + e.getMessage());
        }
    }

    public void selectCity(String city) throws InterruptedException {
        try {
            WebElement cityElement = wait.until(ExpectedConditions.elementToBeClickable(cityDropdown));
            Select citySelect = new Select(cityElement);
            citySelect.selectByVisibleText(city);
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException("Failed to select city: " + e.getMessage());
        }
    }

    public void clickSubmit() throws InterruptedException {
        try {
            WebElement submitElement = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
            submitElement.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException("Failed to click submit: " + e.getMessage());
        }
    }

    public boolean isRegistrationSuccessful() {
        try {
            WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(successModal));
            return modal.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getErrorMessage() {
        try {
            WebElement error = driver.findElement(errorMessage);
            return error.getText();
        } catch (Exception e) {
            return "No error message found";
        }
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void navigateToRegistrationPage() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
    }
}

