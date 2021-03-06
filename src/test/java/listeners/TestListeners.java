package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("******* Test started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("******* Test success: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        System.out.println("Context started: " + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("********* Test completed: " + context.getName());
    }

}
