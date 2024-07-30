package CSSSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://stock.scriptinglogic.in/ ");
        WebElement name = driver.findElement(By.xpath("//input[@id='login-username']"));
        name.sendKeys("admin");
        WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
        pwd.sendKeys("admin");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();


        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("");
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

    }
}
