package Tests;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
  public static   SoftAssert  softAssert;
    @BeforeTest
    public void setDriver(){
        driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        softAssert=new SoftAssert();

    }
    @AfterTest
    public void tearDown(){
        if (driver!=null){
          //  driver.quit();
        }
    }
}
