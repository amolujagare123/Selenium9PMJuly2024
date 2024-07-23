import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {

         WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
         driver.get("https://www.gmail.com");


         //String myTitle =  driver.getTitle();

         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         System.out.println(driver.getPageSource());

         driver.switchTo().newWindow(WindowType.WINDOW);
         driver.get("https://facebook.com");

         Thread.sleep(4000);

       //  driver.close(); // closes the current window
         driver.quit(); // closes all the windows opened by the driver
    }
}
