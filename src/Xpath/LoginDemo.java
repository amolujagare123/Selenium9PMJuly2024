package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

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

    //    driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();
        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

      /*  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kavita");
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("443434");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("4343434");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();*/
        driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Kavita");
        driver.findElement(By.xpath("//*[@name='address']")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@name='contact1']")).sendKeys("443434");
        driver.findElement(By.xpath("//*[@name='contact2']")).sendKeys("4343434");
        driver.findElement(By.xpath("//*[@name='Submit']")).click();

    }
}
