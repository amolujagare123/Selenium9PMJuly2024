package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        /*WebElement txtUsername = driver.findElement(By.className("round"));
        txtUsername.sendKeys("admin");*/

       List<WebElement> wbList = driver.findElements(By.className("round"));

        System.out.println("Size="+ wbList.size());

        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");
        wbList.get(2).click();


    }
}
