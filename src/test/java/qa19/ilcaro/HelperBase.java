package qa19.ilcaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
   WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
     public boolean isElementPresent(By locator, String text) {
        return wd.findElement(locator).getText().equals(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementDisplayed(By locator) {
        return wd.findElement(locator).isDisplayed();
    }
}
