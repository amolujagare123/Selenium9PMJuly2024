package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

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
    public void facebook() {
        driver.get("http://facebook.com");
    }

    @Test
    public void twitter() {
        driver.get("http://twitter.com");
    }

    @Test
    public void linkedin() {
        driver.get("http://linkedin.com");
    }

    @Test
    public void instagram() {
        driver.get("http://instagram.com");
    }

    @Test
    public void reddit() {
        driver.get("http://reddit.com");
    }
}
