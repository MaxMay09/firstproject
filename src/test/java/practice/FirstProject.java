package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstProject {

      WebDriver wd;
      String browser = "Chrome";

      @Test
      public void webDriverSearch() throws InterruptedException {
          if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
              wd = new FirefoxDriver();
          }
          if(browser.equals("Chrome")){
              wd = new ChromeDriver();
          }
          if(browser.equals("Edge")){
              WebDriverManager.edgedriver().setup();
              wd = new EdgeDriver();
          }

          wd.navigate().to("https://www.google.com/");
          wd.findElement(By.name("q")).sendKeys("Webdriver"+ Keys.ENTER);
          System.out.println(wd.getCurrentUrl());
          wd.navigate().back();
          wd.navigate().refresh();
          wd.findElement(By.xpath("//*[@class='gb_h']")).click();
          wd.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
          wd.navigate().back();
          wd.navigate().to("https://www.saucedemo.com/");
          wd.findElement(By.name("user-name")).sendKeys("standard_user");
          wd.findElement(By.name("password")).sendKeys("secret_sauce");
          wd.findElement(By.name("login-button")).click();
          System.out.println(wd.findElements(By.xpath("//div[@class='inventory_item_img']")).size());
          wd.navigate().to("https://www.google.com/");
          wd.findElement(By.name("q")).sendKeys("Webdriver"+ Keys.ENTER);
          Actions action = new Actions(wd);
          action.moveToElement(wd.findElement(By.xpath("//*[@id=\"bres\"]/div[2]/div/div/div/div[1]/div/div/span")));
          action.perform();
          Thread.sleep(3000);


      }

}
