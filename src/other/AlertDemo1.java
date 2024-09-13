package other;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1 {
    @Test
    public void myTest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        Thread.sleep(2000);

       // alert.accept();
        alert.dismiss();


    }
}
