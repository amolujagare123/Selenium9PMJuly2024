package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://kukufm.com/show/the-investment-in-failures");

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,4500)");*/

     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(6000);

        List<WebElement> wblist = driver.findElements(By.cssSelector("p.font-medium"));


        for (WebElement wb : wblist)
            System.out.println(wb.getText());

    }
}
