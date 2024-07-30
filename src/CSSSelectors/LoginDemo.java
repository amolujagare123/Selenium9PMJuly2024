package CSSSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://stock.scriptinglogic.in/ ");
    //    WebElement name = driver.findElement(By.cssSelector("input#login-username"));
        WebElement name = driver.findElement(By.cssSelector("#login-username"));
        name.sendKeys("admin");
    //    WebElement pwd = driver.findElement(By.cssSelector("input#login-password"));
        WebElement pwd = driver.findElement(By.cssSelector("#login-password"));
        pwd.sendKeys("admin");
       /* WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();*/



    }
}
