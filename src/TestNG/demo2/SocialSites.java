package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends  Base{



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
