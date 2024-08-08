package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites extends Base{



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
