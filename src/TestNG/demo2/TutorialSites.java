package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites {

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
    public void w3schools() {
        driver.get("http://w3schools.com");
    }

    @Test
    public void tutorialspoint() {
        driver.get("http://tutorialspoint.com");
    }

    @Test
    public void geeksForGeeks() {
        driver.get("http://geeksforgeeks.org");
    }

    @Test
    public void javatpoint() {
        driver.get("http://javatpoint.com");
    }

    @Test
    public void coursera() {
        driver.get("http://coursera.org");
    }
}
