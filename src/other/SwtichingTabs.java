package other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwtichingTabs {

    @Test
    public void windowsTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://gmail.com");


        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

        Thread.sleep(2000);
        driver.switchTo().window(windows.get(1));

        //driver.switchTo().parentFrame();

        System.out.println(driver.getTitle());
    }
}
