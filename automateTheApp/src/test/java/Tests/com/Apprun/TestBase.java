package Tests.com.Apprun;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import utils.Driver;

import java.util.concurrent.TimeUnit;

public class TestBase {
   public static WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();

    }
}
