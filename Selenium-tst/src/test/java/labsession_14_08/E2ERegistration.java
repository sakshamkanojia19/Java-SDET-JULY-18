package labsession_14_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2ERegistration {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // enter name
        WebElement username = driver.findElement(By.xpath("//input[@id='name']"));
        username.sendKeys("Manisha");

        // enter email
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("oria0302002@gmail.com");

        // enter gender
        WebElement genderRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        genderRadio.click();
        Thread.sleep(1000);

        // enter mobile number
        WebElement num = driver.findElement(By.xpath("//input[@id='mobile']"));
        num.sendKeys("9090909090");

        // enter dob
        WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
        dob.sendKeys("03-12-2002");
        Thread.sleep(1000);

        // enter subject
        WebElement sub = driver.findElement(By.xpath("//input[@id='subjects']"));
        sub.sendKeys("Maths");

        // enter hobbies
        WebElement hobbyCheck = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        hobbyCheck.click();
        Thread.sleep(1000);

        // upload pic
        WebElement uploadPicture = driver.findElement(By.id("picture"));
        uploadPicture.sendKeys("C:\\Users\\Manisha\\OneDrive\\Pictures\\Screenshot 2024-11-13 154746.png");
        Thread.sleep(1000);

        // enter address (corrected id)
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Sirsi road");

        // select state (custom dropdown)
        driver.findElement(By.id("state")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Rajasthan')]")).click();

        // select city (custom dropdown)
        driver.findElement(By.id("city")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();

        // click on login (if it exists)
        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
