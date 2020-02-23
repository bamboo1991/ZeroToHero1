package Tests.com.openMrs.loginTests;

import Pages.Mrs_Login_Page;
import Tests.TestBase;
import Utils.cofiReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenMRSLoginTest extends TestBase {
    @Test
    public void testLogin(){
        driver.get("https://demo.openmrs.org/openmrs/referenceapplication/login.page");
        Mrs_Login_Page page = new Mrs_Login_Page();
        String userName = cofiReader.getProperty("userName");
        String password = cofiReader.getProperty("password");
        page.Login(userName,password);
        String expectedTitle="Home";
        String actual= driver.getTitle();
        Assert.assertEquals(actual,expectedTitle);

    }
}
