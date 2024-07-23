import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo1 {

    public static void main(String[] args) {

      // WebDriver driver = new ChromeDriver();
     //   WebDriver driver = new EdgeDriver();
        //  WebDriver driver = new FirefoxDriver();
        WebDriver driver = new SafariDriver();
        // driver.manage().window().maximize();
        driver.get("http://facebook.com");
    }
}
