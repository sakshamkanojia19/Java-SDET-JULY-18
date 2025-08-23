package TestNG_Selenium_Frame_19_08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWrite {

	

	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@Test
	public void login() throws IOException {
		File src = new File ("E:\\EclipseWorkspace\\Selenium-tst\\TestData\\Login.xlsx");
		FileInputStream fis = new FileInputStream(src);
		// load the work book
		workbook = new XSSFWorkbook(fis) ;
		sheet = workbook.getSheetAt(0);
		// create a for loop to iterate in the sheet of rows and columns
		for (int i = 1; i<= sheet.getLastRowNum(); i++) {
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			// launch the url
 
			driver.get("https://www.facebook.com/login");
			driver.manage().window().maximize();
			

			
			//get the title of the page write to the excel
			String title = driver.getTitle();
			
			System.out.println(title);
			
			FileOutputStream fos = new FileOutputStream("E:\\EclipseWorkspace\\Selenium-tst\\TestData\\Login.xlsx");
			
			
			sheet.getRow(i).createCell(2).setCellValue(title);
			
			//perfrom the write operation and close the connections
			
			workbook.write(fos);
			
			fos.close();
			
			
			
		}
	}
}



	

