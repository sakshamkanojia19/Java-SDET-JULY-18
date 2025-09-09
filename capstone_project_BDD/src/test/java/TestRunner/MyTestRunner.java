package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features/Capstone_HomePage.feature",
	    glue = {"StepDefinations","Hooks"},
	    plugin = {
	        "pretty",
	        "html:target/cucumber-html-report",
	        "json:target/cucumber.json",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  
	    }
	)

public class MyTestRunner  extends AbstractTestNGCucumberTests {

}

