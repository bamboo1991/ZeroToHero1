package Tests.com.openMrs.HomeTest;
import Pages.Mrs_Login_Page;
import Pages.openMRShomePage;
import Tests.TestBase;
import Utils.cofiReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenMRSHomePageTest extends TestBase {
    openMRShomePage page = new openMRShomePage();
    @BeforeClass
    public void loginMRS(){
        Mrs_Login_Page login_page = new Mrs_Login_Page();
        driver.get("https://demo.openmrs.org/openmrs/referenceapplication/home.page");
        login_page.Login(cofiReader.getProperty("userName"),cofiReader.getProperty("password"));
    }
    @Test
    public void validateMessage(){

        String expectedMsg="Logged in as Super User (admin) at Pharmacy.";
        String actualMessage=page.textMessage.getText();
        Assert.assertEquals(actualMessage,expectedMsg);
    }
    @Test
    public void validateURL(){
        String expectedURL = "https://demo.openmrs.org/openmrs/referenceapplication/home.page";
        String actual= driver.getCurrentUrl();
        Assert.assertEquals(actual,expectedURL);
    }

    @Test
    public void validateHomeApps(){
       for (WebElement element:page.homePageApps){
           Assert.assertTrue(element.isDisplayed());
       }
    }
}
