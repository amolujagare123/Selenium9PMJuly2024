import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Find the web element
        WebElement drpText = driver.findElement(By.id("seltext"));

        // 2. Create an object of Select class
        Select selText = new Select(drpText);

        Thread.sleep(4000);

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 3. select the option using Select class object
       // selText.selectByVisibleText("text 2");
        //selText.selectByValue("val1");
        selText.selectByIndex(4);

    }
}
