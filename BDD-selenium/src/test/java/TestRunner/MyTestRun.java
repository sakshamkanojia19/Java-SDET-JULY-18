//package TestRunner;
//
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//    features = {"src/test/resources/Features/register.feature"},   // Path to your feature file
//    glue = {"RegisterStepDefinitions", "Hooks"},                              // Step definitions & hooks packages
//    tags = "@Sanity",                                                 // Run scenarios with this tag
//    plugin = {
//        "pretty",                                                     // Console output
//        "html:target/cucumber-reports.html",                          // HTML report
//        "json:target/cucumber.json",                                  // JSON report
//        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent report
//    },
//    monochrome = true                                                 // Clean console output
//)
//
//
////for Junit 
//public class MyTestRun {
//
//}
//
//
////public class MyRunner extends AbstractTestNGCucumberTest {
////
////}
////
////for testng
//
//
//
///*
// * 
// * 
// * 🔑 Key Points:
//
//@Sanity is now added to Test 1 and Test 2 (so they run when you filter with tags = "@Sanity").
//
//@regression remains for the Scenario Outline.
//
//@negative remains for negative test cases.
//
//👉 This way, you can control execution easily:
//
//Run only sanity: tags = "@Sanity"
//
//Run only regression: tags = "@regression"
//
//Run only negative: tags = "@negative"
//
//Run multiple: tags = "@Sanity or @regression"
// * 
// * */
// 