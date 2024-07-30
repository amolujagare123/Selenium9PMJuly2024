package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {
// valid
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic1.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

// invalid

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername2 = driver2.findElement(By.id("login-username"));
        txtUsername2.sendKeys("sdsdsd");

        WebElement txtPassword2 = driver2.findElement(By.id("login-password"));
        txtPassword2.sendKeys("dsdsdsd");

        WebElement btnLogin2 = driver2.findElement(By.name("submit"));
        btnLogin2.click();

        // blank

        WebDriver driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername3 = driver3.findElement(By.id("login-username"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver3.findElement(By.id("login-password"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver3.findElement(By.name("submit"));
        btnLogin3.click();


    }
}
