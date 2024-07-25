package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");


        // 1. Find the web element
        WebElement multiSelectCity = driver.findElement(By.id("source_118"));

        // 2. Create an object of Select class
        Select citySelection = new Select(multiSelectCity);

        Thread.sleep(4000);

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 3. select the option using Select class object
        citySelection.selectByVisibleText("Bangalore");
        citySelection.selectByVisibleText("Chennai");
        citySelection.selectByVisibleText("Mumbai");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


      //  2nd list box

       WebElement citySelected = driver.findElement(By.id("fld_118"));
       Select selCitySelected = new Select(citySelected);
        selCitySelected.selectByIndex(0);
        selCitySelected.selectByIndex(1);

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();

    }
}
