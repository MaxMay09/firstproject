package qa19.ilcaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void clickLogIn() {
        click(By.xpath("//a[.=' Log in ']"));
    }
    public void fillLoginForm(String email, String password){
        type(By.id("email"), email);
        type(By.id("password"), password);
    }

    public void clickSubmit() {
        click(By.xpath("//button[@type='submit']"));
    }
}
