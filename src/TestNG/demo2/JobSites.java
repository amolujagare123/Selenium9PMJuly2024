package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {

    WebDriver driver;
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
        driver.close();
    }

    @Test
    public void naukri() {
        driver.get("http://naukri.com");
    }

    @Test
    public void monsterIndia() {
        driver.get("http://monsterindia.com");
    }

    @Test
    public void shine() {
        driver.get("http://shine.com");
    }

    @Test
    public void timesJobs() {
        driver.get("http://timesjobs.com");
    }

    @Test
    public void freshersworld() {
        driver.get("http://freshersworld.com");
    }
}
