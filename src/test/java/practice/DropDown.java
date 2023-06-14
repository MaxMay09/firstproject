package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

    WebDriver wd;
    Select select;

    @Test
     public void dropDownTest() throws InterruptedException {

         wd=new ChromeDriver();
         wd.manage().window().maximize();
         wd.get("https://the-internet.herokuapp.com/dropdown");
          //wd.findElement(By.id("dropdown"));
         select = new Select(wd.findElement(By.id("dropdown")));
         select.selectByValue("1");
         Thread.sleep(3000);
     }
}
