package ExtentReportDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportUtil {


    public static String screenshot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());

        String fileName = "IMG"+ timeStamp + ".png";


        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+fileName));

        return fileName;

    }

    public static ExtentReports initExtentObject(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Company Name","Scripting Logic");
        extent.setSystemInfo("Client Name","Horizon Infotek");
        extent.setSystemInfo("Developers Name","Karthik");
        extent.setSystemInfo("Testers Name","Vidya");
        extent.setSystemInfo("BA Name","Kaviya");
        extent.setSystemInfo("Department","Finance");
        extent.setSystemInfo("Deadline","Sept 2024");

        return extent;

    }

}
