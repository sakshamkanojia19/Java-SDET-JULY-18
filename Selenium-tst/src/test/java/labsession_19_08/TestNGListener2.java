package labsession_19_08;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Events happening in the test execution are called listeners
// Listeners track test start, test fail, test skip, test pass
// They produce custom logs

public class TestNGListener2 implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test suite execution started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test suite execution completed: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test passed with issues (within success percentage): " + result.getName());
    }
}
