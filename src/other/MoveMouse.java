package other;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MoveMouse {

    @Test
    public void myTest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(men).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[@data-reactid='31']")).click();

        //actions.dragAndDrop(wb1,wb2).perform();

    }
    }
