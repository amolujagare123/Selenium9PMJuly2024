package AssertsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OrangeHRMRecruitement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Define the URL and credentials
        String url = "https://opensource-demo.orangehrmlive.com/";
        String username = "Admin";
        String password = "admin123";


            // Navigate to the URL
            driver.get(url);

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Find username field and enter the username
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys(username);

            // Find password field and enter the password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys(password);

            // Find the login button and click
            WebElement loginButton = driver.findElement(By.xpath("//button"));
            loginButton.click();

            // Wait for the page to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Find the Recruitment menu item and click
            WebElement recruitmentMenu = driver.findElement(By.xpath("//span[normalize-space()='Recruitment']"));
            recruitmentMenu.click();


             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // click add button
            driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("pqr");
        driver.findElement(By.xpath("//div[contains(@class,'field-bottom-space') and div/label[normalize-space()='Email']]//input")).sendKeys("xyz@gmail.com");

        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

        String expected = "Successfully Saved";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     //   Thread.sleep(10000);

        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//p[contains(@class,'toast-messag')]")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);


        // testng
        Assert.assertEquals(actual,expected,
                "incorrect or no error message");


    }
}
