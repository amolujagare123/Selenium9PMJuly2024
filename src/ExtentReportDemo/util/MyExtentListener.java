package ExtentReportDemo.util;

import TestNG.demo2.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportDemo.util.ReportUtil.initExtentObject;
import static ExtentReportDemo.util.ReportUtil.screenshot;

public class MyExtentListener extends Base implements ITestListener
{
    ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {

        System.out.println("======= onTestStart =========");

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("======= onTestSuccess =========");
        test.pass("This test is passes");
    }

    public void onTestFailure(ITestResult result)  {
        System.out.println("======= onTestFailure =========");
        test.fail("This test is failed");
        test.info(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("======= onTestSkipped =========");
    }


    public void onStart(ITestContext context) {
        System.out.println("======= onStart =========");

        if (extent==null)
         extent = initExtentObject();
    }

    public void onFinish(ITestContext context) {
        System.out.println("======= onFinish =========");
        extent.flush();
    }
}
