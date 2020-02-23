package Tests.com.openMrs.Register_Tests;

import Pages.Mrs_Login_Page;
import Pages.OpenMRSRegisterPage;
import Pages.openMRShomePage;
import Tests.TestBase;
import Utils.BrowserUtils;
import Utils.cofiReader;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import java.time.format.SignStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PatientRegisterTest extends TestBase {
    OpenMRSRegisterPage registerPage = new OpenMRSRegisterPage();
    openMRShomePage  openMRShomePage = new openMRShomePage();
@DataProvider(name = "PatientInfo")
public Object[][] getPatientinfo(){
    return new Object[][]{{"Jason","Mason","Male","15","April","2001","2200 Devon ave","3122121","Child","Robert"},
                          {"Maria", "Garcia", "Female","22","October","1998","501 East mall dr", "212312","Sibling","Marai"},
                          {"Jmaes","Anderson","Male","23","December","1988","33 e Wacker dr","44234232","Supervisor","Jenifer"}};
}
    @BeforeClass
    public void loginMRS(){
        Mrs_Login_Page login_page = new Mrs_Login_Page();
        driver.get("https://demo.openmrs.org/openmrs/index.htm");
        login_page.Login(cofiReader.getProperty("userName"),cofiReader.getProperty("password"));
        openMRShomePage.clickApp("Register a patient");
    }
    @Test
    public void validateTitle(){
    extentTest=extentReports.createTest("This is for tittle Validation");
        String expectedTitle="OpenMRS Electronic Medical Record";
        String actualTilte = driver.getTitle();
        extentTest.log(Status.INFO,"This is status validation");
        Assert.assertEquals(actualTilte,expectedTitle);
        extentTest.log(Status.INFO,"Title is validated");
    }
@Test
public void validateHeaders(){
    extentTest=extentReports.createTest("This is for Header Validation");
        String actualText= registerPage.registerText.getText().trim();
        String expectedText="Register a patient";
    extentTest.log(Status.INFO,"Register text is validated");
    softAssert.assertEquals(actualText,expectedText);
    extentTest.log(Status.INFO,"Question text is validated");
    String actualQuestionText = registerPage.patientNameQuestion.getText().trim();
    String expectedQuestionText = "What's the patient's name?";
    softAssert.assertEquals(actualQuestionText,expectedQuestionText);
    softAssert.assertEquals(registerPage.Given_Middle_Family_name.get(0).getText(),"Given (required)");
       softAssert.assertEquals(registerPage.Given_Middle_Family_name.get(1).getText(),"Middle");
       softAssert.assertEquals(registerPage.Given_Middle_Family_name.get(2).getText(),"Family Name (required)");
       extentTest.log(Status.INFO,"Name Headers are validated");
       softAssert.assertAll();
    }
    @Test
    public void validateDemographics() {
        extentTest=extentReports.createTest("Validation of the Demographics");
List<String > expectedHeader = OpenMRSRegisterPage.getData();
    for (int i =0; i<expectedHeader.size();i++){
        String actualHeader = registerPage.demographicsName.get(i).getText();
        softAssert.assertEquals(actualHeader,expectedHeader.get(i));
    }
        extentTest.log(Status.INFO,"Demographic header is validated");
    softAssert.assertAll();
    }
    @Test(dependsOnMethods = "validateDemographics")
    public void validatePatient() {
        extentTest=extentReports.createTest("Single Patient registration");
         registerPage.registerPatient("Adam","Lee","Male","22","May","2002","2444 south delaware dr", "3423434","Child","Sarah");
        List<String> expectedConfirmation = OpenMRSRegisterPage.getConfirmationData();
        for (int i = 0; i < expectedConfirmation.size(); i++) {
            String actualData = registerPage.confirmationPage.get(i).getText();
            softAssert.assertEquals(expectedConfirmation.get(i), actualData);
        }
        extentTest.log(Status.INFO,"Registration is validated ");
        softAssert.assertAll();
        registerPage.submitButton.click();
        extentTest.log(Status.INFO,"Registration confirm button Complete");
    }


        @Test(dataProvider = "PatientInfo",dependsOnMethods = "validatePatient")
        public void validateMultiplePatientRegistration(String name, String familyName, String gender, String day, String month, String year, String
                                                        address, String phoneNumber, String relationShip, String relationshipName){
    extentTest=extentReports.createTest("Multiple patient registration reports ");
    BrowserUtils.waitForsec(3);
        driver.get("https://demo.openmrs.org/openmrs/index.htm");
    openMRShomePage.clickApp("Register a patient");
    extentTest.log(Status.INFO,"Register patient button clicked");
            BrowserUtils.waitForsec(2);

    registerPage.registerPatient(name,familyName,gender,day,month,year,address,phoneNumber,relationShip,relationshipName);
    extentTest.log(Status.INFO,"Patient registration is complete");
    registerPage.submitButton.click();
    extentTest.log(Status.INFO,"Registration confirm button is clicked ");
}



    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {

            extentTest.log(Status.FAIL, "TEST EXECUTION IS FAILED " + result.getName());
            extentTest.log(Status.FAIL, "THE NAME OF THE ERROR IS " + result.getThrowable());
            BrowserUtils.takeScreenShot();
        }
    }}
