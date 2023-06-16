package qa19.ilcaro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;
    UserHelper userHelper;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wd.navigate().to("https://ilcarro.web.app/");
        userHelper = new UserHelper(wd);

    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public void stop(){

        wd.quit();
    }
}
