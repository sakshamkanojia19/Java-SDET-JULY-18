//package Selenium_Test.Selenium_tst;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DeSelectExampleCustom {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);
//
//        driver.manage().window().maximize();
//        driver.get("https://grotechminds.com/multiple-select/");
//
//        // Wait a bit for page load
//        Thread.sleep(2000);
//
//        // 1️⃣ Select "Motorcycle" by visible text (click dropdown, then option)
//        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();
//        driver.findElement(By.xpath("//li[text()='Motorcycle']")).click();
//        Thread.sleep(1000);
//
//        // 2️⃣ Select "Sedan" by index (click dropdown again)
//        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();
//        driver.findElements(By.cssSelector("ul.select2-results__options li")).get(1).click(); // index 1 = Sedan
//        Thread.sleep(1000);
//
//        // 3️⃣ Select "SUV" by value-like attribute (simulate selectByValue)
//        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();
//        driver.findElement(By.xpath("//li[contains(text(),'SUV')]")).click();
//        Thread.sleep(1000);
//
//        // ✅ Now deselect elements
//        // Deselect by visible text → click the 'x' next to Motorcycle
//        driver.findElement(By.xpath("//li[@title='Motorcycle']/span")).click();
//        Thread.sleep(1000);
//
//        // Deselect by index → remove the first selected chip in the box
//        driver.findElements(By.cssSelector(".select2-selection__choice__remove")).get(0).click();
//        Thread.sleep(1000);
//
//        // Deselect remaining all → remove any remaining chips
//        for (WebElement removeBtn : driver.findElements(By.cssSelector(".select2-selection__choice__remove"))) {
//            removeBtn.click();
//            Thread.sleep(500);
//        }
//
//        Thread.sleep(2000);
//        driver.quit();
//    }
//}




package Selenium_Test.Selenium_tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeSelectExampleCustom {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://grotechminds.com/multiple-select/");

        // Locate the multi-select dropdown
        WebElement drpdwn = driver.findElement(By.id("automobiles"));
        Select sel = new Select(drpdwn);

        // --- SELECT ---
        // 1. Select by visible text
        Thread.sleep(1000);
        sel.selectByVisibleText("Motorcycle");

        // 2. Select by value
        Thread.sleep(1000);
        sel.selectByValue("sedan");

        // 3. Select by index (0-based index)
        Thread.sleep(1000);
        sel.selectByIndex(3); // SUV

        Thread.sleep(2000);

        // --- DESELECT ---
        // 1. Deselect by visible text
        sel.deselectByVisibleText("Motorcycle");

        Thread.sleep(1000);

        // 2. Deselect by value
        sel.deselectByValue("sedan");

        Thread.sleep(1000);

        // 3. Deselect by index
        sel.deselectByIndex(3); // SUV

        Thread.sleep(1000);

        // Just to be sure, clear all selections
        sel.deselectAll();

        Thread.sleep(2000);
        driver.quit();
    }
}

