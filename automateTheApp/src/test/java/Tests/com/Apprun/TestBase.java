package Tests.com.Apprun;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import org.testng.asserts.SoftAssert;
import utils.Driver;

import java.util.concurrent.TimeUnit;
public class TestBase {
    public static SoftAssert softAssert;
   public static WebDriver driver;
   @BeforeTest
    public void setupDriver(){
        driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
