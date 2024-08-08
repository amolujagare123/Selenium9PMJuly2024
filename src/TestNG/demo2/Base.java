package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

    public static WebDriver driver;
    //annotation
    @BeforeClass // this method will execute before first Test method in this class
    public  void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass// this method will execute after last Test method in this class
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        //  driver.close();
    }
}
