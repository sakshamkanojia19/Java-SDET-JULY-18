package selenium_grid;

//public class SeleniumGridTestcase {
//
//	package com.wiprojuly.seleniumgrid;
//	 
//	import org.openqa.selenium.By;
//
//	import org.openqa.selenium.WebElement;
//
//	import org.testng.annotations.Test;
//	 
//	public class SeleniumGridTestcase extends HelperClass {
//	 
//		
//
//		@Test
//
//		public void login() throws InterruptedException {
//
//
//			WebElement Username = getDriver().findElement(By.name("username"));
//
//			Username.sendKeys("Admin");
//
//			Thread.sleep(1000);
//
//			// name locator 
//
//			WebElement Password  = getDriver().findElement(By.name("password"));
//
//			Password.sendKeys("admin123");
//
//			Thread.sleep(1000);
//
//			WebElement LoginButton = getDriver().findElement(By.tagName("button"));
//
//			LoginButton.click();
//
//			Thread.sleep(2000);
//
//		}
//	 
//	}
//
//	 
//	
//}




//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import java.time.Duration;
//
//public class SeleniumGridTestcase extends HelperClass {
//
//    @Test
//    public void login() {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//
//        // Wait for username
//        WebElement username = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.name("username"))
//        );
//        username.sendKeys("Admin");
//
//        // Wait for password
//        WebElement password = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
//        );
//        password.sendKeys("admin123");
//
//        // Wait for login button
//        WebElement loginButton = wait.until(
//                ExpectedConditions.elementToBeClickable(By.tagName("button"))
//        );
//        loginButton.click();
//    }
//}





/*For mUltipel browsers*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class SeleniumGridTestcase extends HelperClass {

    @DataProvider(parallel = true)
    public Object[][] browsers() {
        return new Object[][]{
                {"chrome"},
                {"edge"}
        };
    }

    @Test(dataProvider = "browsers")
    public void login(String browser) throws MalformedURLException {
        // Launch browser on Grid
        setDriver(browser);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        // Wait for username field
        WebElement Username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username"))
        );
        Username.sendKeys("Admin");

        // Wait for password field
        WebElement Password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
        );
        Password.sendKeys("admin123");

        // Wait for login button
        WebElement LoginButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.tagName("button"))
        );
        LoginButton.click();

        // Optional: wait for dashboard to load (verify login worked)
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}