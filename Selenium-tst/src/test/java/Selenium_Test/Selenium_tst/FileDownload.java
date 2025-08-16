package Selenium_Test.Selenium_tst;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open the download page
        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().window().maximize();

        // Click the file link to download
        WebElement filedownload = driver.findElement(By.xpath("//a[@href='download/test-file.txt']"));
        filedownload.click();

        // Wait for download to complete (better to use loop check instead of fixed sleep)
        Thread.sleep(3000);

        // Check if file is downloaded
        File f = new File("C:\\Users\\ASUS\\Downloads\\test-file.txt");

        if (f.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }

        driver.quit();
    }
}
