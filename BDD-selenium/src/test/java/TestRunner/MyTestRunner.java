//package TestRunner;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
// 
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = {"src/test/resource/Features/login.feature"}
//		,glue = {"StepDefinations"}
//		)
// 
//public class MyTestRunner {
//
//}


//package TestRunner;
//
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
////@CucumberOptions(
////        features = {"src/test/resource/Features/login.feature"},
////        glue = {"StepDefinations"},
////        plugin = {"pretty", "html:target/cucumber-report.html"},
////        monochrome = true
////)
////public class MyTestRunner {
////
////}
//
//@CucumberOptions(
//	    features = "src/test/resources/Features/login.feature",
//	    glue = {"StepDefinations", "Hooks"},
//	    plugin = {
//	        "pretty",
//	        "html:target/cucumber-reports/cucumber.html",   // ✅ HTML with screenshots
//	        "json:target/cucumber-reports/cucumber.json"
//	    },
//	    monochrome = true
//	)
//	public class MyTestRunner {
//	}




// 3 TetsRunner for better Screenshot :  
/*
package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/login.feature",
    glue = {"StepDefinations", "Hooks"},
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber.html",   // ✅ HTML with screenshots
        "json:target/cucumber-reports/cucumber.json"
    },
    monochrome = true
)
public class MyTestRunner {}

*/



//FOR Page Object Model in BDD Cucumber

//package TestRunner;
//
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//    features = "src/test/resources/Features/loginpage.feature",
//    glue = {"StepDefinations_pg", "Hooks"},
//    plugin = {
//        "pretty",
//        "html:target/cucumber-reports/cucumber.html",   // ✅ HTML with screenshots
//        "json:target/cucumber-reports/cucumber.json"
//    },
//    monochrome = true
//)
//public class MyTestRunner {}
//
//



package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resource/features/login.feature",
    glue = {"StepDefinitions", "Hooks"},
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"
    },
    monochrome = true
//    tags = "@positive or @regression"
)
public class MyTestRunner extends AbstractTestNGCucumberTests {
}

