package Tests.com.openMrs.Register_Tests;

import Pages.Mrs_Login_Page;
import Pages.OpenMRSRegisterPage;
import Pages.openMRShomePage;
import Tests.TestBase;
import Utils.BrowserUtils;
import Utils.cofiReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class PatientRegisterTest extends TestBase {
    OpenMRSRegisterPage registerPage = new OpenMRSRegisterPage();
    openMRShomePage  openMRShomePage = new openMRShomePage();

    @BeforeClass
    public void loginMRS(){
        Mrs_Login_Page login_page = new Mrs_Login_Page();
        driver.get("https://demo.openmrs.org/openmrs/referenceapplication/home.page");
        login_page.Login(cofiReader.getProperty("userName"),cofiReader.getProperty("password"));
        openMRShomePage.clickApp("Register a patient");
    }
    @Test
    public void validateTitle(){
        String expectedTitle="OpenMRS Electronic Medical Record";
        String actualTilte = driver.getTitle();
        Assert.assertEquals(actualTilte,expectedTitle);
    }
@Test
public void validateHeaders(){
        String actualText= registerPage.registerText.getText().trim();
        String expectedText="Register a patient";
        softAssert.assertEquals(actualText,expectedText);


        String actualQuestionText = registerPage.patientNameQuestion.getText().trim();
        String expectedQuestionText = "What's the patient's name?";
       softAssert.assertEquals(actualQuestionText,expectedQuestionText);

       softAssert.assertEquals(registerPage.Given_Middle_Family_name.get(0).getText(),"Given (required)");
       softAssert.assertEquals(registerPage.Given_Middle_Family_name.get(1).getText(),"Middle");
       softAssert.assertEquals(registerPage.Given_Middle_Family_name.get(2).getText(),"Family Name (required)");
       softAssert.assertAll();
    }
    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException{
        if (result.getStatus()==ITestResult.FAILURE);
        BrowserUtils.takeScreenShot();
    }
}
