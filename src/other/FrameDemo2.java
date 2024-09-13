package other;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo2 {


    @Test
    public void myTest1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");

        // id / name / webelement

       driver.switchTo().frame("iframeResult");


        WebElement FirstName = driver.findElement(By.id("fname"));
        FirstName.sendKeys("Amol");

        WebElement lastName = driver.findElement(By.id("lname"));
        lastName.sendKeys("Ujagare");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

    }
}
