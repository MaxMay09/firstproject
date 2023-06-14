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

        //wd.findElement(By.xpath("//a[.=' Log in ']")).click();
        click(By.xpath("//a[.=' Log in ']"));

//        wd.findElement(By.id("email")).click();
//        wd.findElement(By.id("email")).clear();
//        wd.findElement(By.id("email")).sendKeys("maxmayzel@gmail.com");
        type(By.id("email"), "maxmayzel@gmail.com");

//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("Rfrnec7_*");
        type(By.id("password"), "Rfrnec7_*");

//        wd.findElement(By.xpath("//button[@type='submit']")).click();
        click(By.xpath("//button[@type='submit']"));

        pause(3000);
        Assert.assertTrue(isElementDisplayed(By.xpath("//h2[normalize-space()='Logged in success']")));

    }

    @Test
    public void negativeLogineTest() {
        click(By.xpath("//a[.=' Log in ']"));
        type(By.id("email"), "maxmayzel@gmail");
        type(By.id("password"), "Rfrnec7_*");
        click(By.xpath("//button[@type='submit']"));
        pause(3000);
        Assert.assertTrue(!isElementPresent(By.xpath("//div[@class='dialog-container']//h2"), "Login or Password incorrect"));

    }


}
