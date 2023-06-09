import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebinarQA19 {
    WebDriver wd;

    @Test
    public void searchWebdriverTest() {
        //WebDriverManager.edgedriver().setup();
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wd.navigate().to("https://www.google.com");
//        wd.findElement(By.id("APjFqb")).sendKeys("Webdriver"+ Keys.ENTER);
        wd.navigate().to("https://www.saucedemo.com/");
        wd.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        wd.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        wd.findElement(By.name("login-button")).click();
        System.out.println(wd.findElements(By.className("inventory_item")).size());
        List<WebElement>list = wd.findElements(By.cssSelector(".inventory_item_desc"));
        System.out.println(list.get(3).getText());
        for(WebElement el:list){
            el.getText();
        }
    }
}