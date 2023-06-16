package qa19.ilcaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends TestBase{

    @Test
    public void positiveLoginTest() throws InterruptedException {

        app.getUserHelper().clickLogIn();
        app.getUserHelper().fillLoginForm("maxmayzel@gmail.com","Rfrnec7_*");
        app.getUserHelper().clickSubmit();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isElementDisplayed(By.xpath("//h2[normalize-space()='Logged in success']")));
        //wd.findElement(By.xpath("//a[.=' Log in ']")).click();

//        wd.findElement(By.id("email")).click();
//        wd.findElement(By.id("email")).clear();
//        wd.findElement(By.id("email")).sendKeys("maxmayzel@gmail.com");


//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("Rfrnec7_*");


//        wd.findElement(By.xpath("//button[@type='submit']")).click();


    }

    @Test
    public void negativeLogineTest() {
        app.getUserHelper().clickLogIn();
        app.getUserHelper().fillLoginForm("maxmayzel@gmail.c","Rfrnec7_*");
        app.getUserHelper().clickSubmit();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(!app.getUserHelper().isElementPresent(By.xpath("//div[@class='dialog-container']//h2"), "Login or Password incorrect"));

    }


}
