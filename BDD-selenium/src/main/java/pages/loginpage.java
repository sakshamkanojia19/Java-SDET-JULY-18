package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
 //Locators + page actions + constructors
	
	
		// locators + page actions + constructor 
		private WebDriver driver;
		// locators 
		private By  usernameField = By.name("username");
		private By  passwordField = By.name("password");
		private By loginButton = By.xpath("//button[normalize-space()='Login']");
		// constructor
	 
		
		public loginpage(WebDriver driver) {
			this.driver = driver;
		}

		// page actions 
		 // Actions
	    public void enterCredentials(String username,String password) 
	    		throws InterruptedException {
	    	Thread.sleep(4000);
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).sendKeys(password);
	    }
	 
		
	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }
	 
	    public String getPageTitle() {
	        return driver.getTitle();
	    }
	 
		

	 
	}
	
/*
 * 
 
 Feature: Login functionality
 
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "admin" and password "admin123"
    Then the user should be navigated to the home page
 
 * */



/*
 
 Addition in stepdefination
 
 
 driver level : 
 
 loginpage lp = new loginpage(driver);
 
 
 
 
 
 
 at lower level :
 
 
 @Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		// launch the application on the chrome browser
				Thread.sleep(10000);
 
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
				Thread.sleep(2000);
 
	}
 
	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
 
	lp.enterCredentials(username, password);
	}
 
	@Then("the user should be navigated to the home page")
	public void the_user_should_be_navigated_to_the_home_page() {
		lp.clickLogin();
	}
 
 
 
 * */
 