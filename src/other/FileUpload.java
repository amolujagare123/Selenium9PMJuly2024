package other;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void myTest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        WebElement fileButton = driver.findElement(By.xpath("//input[@value='browse here']"));

        Thread.sleep(4000);

        fileButton.sendKeys("D:\\Scriptinglogic docs\\class Activities\\Selenium\\Java\\pdf\\collections.pdf");



    }
    }
