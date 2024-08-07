package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportDemo.util.ReportUtil.screenshot;

public class LoginDemo {

    ExtentReports extent;

    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
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

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }



    @Test
    public void myTest1() throws IOException {

        ExtentTest test = extent.createTest("valid input");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("This is failed since :"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void myTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid input");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsd");
        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdsd");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("This is failed since :"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void myTest3() throws IOException {

        ExtentTest test = extent.createTest("blank input");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");
        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("This is failed since :"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }
    }

}
