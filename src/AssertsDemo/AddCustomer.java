package AssertsDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCustomer {

    WebDriver driver;
    @BeforeClass
    public void doLogin() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }


    @Test (enabled = false)
    public void addCustomerTest1()
    {
        driver.findElement(By.linkText("Add Customer")).click();

        /*driver.findElement(By.name("name")).sendKeys("Divya");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("343434");
        driver.findElement(By.name("contact2")).sendKeys("432323");*/

        driver.findElement(By.name("Submit")).click();

        String expected = "Please enter a Customer Name";
        expected = expected.toUpperCase();
       // String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@class='error']")).getText();
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

    @Test
    public void addCustomerTest2()
    {
        driver.findElement(By.linkText("Add Customer")).click();

        /*driver.findElement(By.name("name")).sendKeys("Divya");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("343434");
        driver.findElement(By.name("contact2")).sendKeys("432323");*/
        driver.findElement(By.name("contact1")).sendKeys("34");
        driver.findElement(By.name("contact2")).sendKeys("34");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.name("Submit")).click();


        ArrayList<String> expected = new ArrayList<>();
        expected.add("Please enter a Customer Name".toUpperCase());
        expected.add("Please enter at least 3 characters.".toUpperCase());
        expected.add("Please enter at least 3 characters.".toUpperCase());

        ArrayList<String> actual = new ArrayList<>();

        try{
                List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));
                actual.add(wbList.get(0).getText());
                actual.add(wbList.get(1).getText());
                actual.add(wbList.get(2).getText());

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

    @Test(enabled = false)
    public void addCustomerTest3()
    {
        driver.findElement(By.linkText("Add Customer")).click();

        /*driver.findElement(By.name("name")).sendKeys("Divya");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("343434");
        driver.findElement(By.name("contact2")).sendKeys("432323");*/
        driver.findElement(By.name("contact1")).sendKeys("34");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.name("Submit")).click();


        ArrayList<String> expected = new ArrayList<>();
        expected.add("Please enter a Customer Name".toUpperCase());
        expected.add("Please enter at least 3 characters.".toUpperCase());

        ArrayList<String> actual = new ArrayList<>();

        try{
            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));
            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());

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
