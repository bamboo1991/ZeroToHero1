package Tests.com.Apprun;

import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pagesObjects.pageClass;
import utils.ConfiReaderFile;
import utils.Driver;
import utils.ScreenshotMethod;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class AppRunnerTest extends TestBase {
    public static String createEmployeeId(String str, int numbers) {
        StringBuilder sb = new StringBuilder();
        Random randomNumbers = new Random();
        for (int i = 0; i < 17; i++) {
            sb.append(str.charAt(randomNumbers.nextInt(str.length())));
        }
        return sb.toString();
    }
    @DataProvider(name = "EmployeeData")
public Object[][]getEmpData() {
    return new Object[][]{
            {createEmployeeId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",8), "David", "Lee", "Albanian", "01/04/1992", "Male", "Married", "Full Time Internship", "Software Engineer", "Albania", "2020", "Development Team", "any"},
            {createEmployeeId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",8), "Robert", "Smith", "American", "03/08/1999", "Male", "Single", "Full Time Permanent", "Software Engineer", "United States", "2020", "Development Team", "any"},
            {createEmployeeId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",8), "Maria", "Garcia", "Canadian", "05/10/2000", "Female", "Divorced", "Full Time Internship", "Software Engineer", "Canada", "2018", "Development Team", "any"},
            {createEmployeeId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",8), "Jenifer", "Zack", "Cuban", "08/11/2001", "Female", "Married", "Full Time Permanent", "Software Engineer", "Cuba", "2017", "Development Team", "any"},
            {createEmployeeId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",8), "James", "Anderson", "Gambian", "04/03/2004", "Male", "Single", "Full Time Permanent", "Software Engineer", "Gambia", "2016", "Development Team", "any"}};
}
Select select;
    @BeforeTest
    public void login(){
        TestBase.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestBase.driver.navigate().to("http://icehrm-open.gamonoid.com/login.php");
        pageClass page  = new pageClass(Driver.getDriver());
String userName = ConfiReaderFile.getProperty("userName");
String password = ConfiReaderFile.getProperty("password");
page.Login(userName,password);

    }
    @Test(dataProvider = "EmployeeData",priority = 1)

    public void addingInfo(String  EmpIds, String FirstName, String lastName, String nationality,String DOB, String gender, String marriageStatus, String empStatus, String JobTitle,
                           String country, String JobDate, String department, String IndirectSup ) {
        TestBase.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        pageClass page = new pageClass(TestBase.driver);
        page.EmployeeBtn.click();
        page.getEmployeeBtn.click();
        page.addEmp.click();
        TestBase.driver.navigate().refresh();
        page.addEmp.click();
        page.EmpNumber.sendKeys(EmpIds);
        page.FirstName.sendKeys(FirstName);
        page.LastName.sendKeys(lastName);
        Select select = new Select(page.Nationality);
        select.selectByVisibleText(nationality);
        page.BirthDate.sendKeys(DOB);
        select = new Select(page.GenderSelect);
        select.selectByVisibleText(gender);
        select = new Select(page.familyStatus);
        select.selectByVisibleText(marriageStatus);
        select = new Select(page.EmployeeStatus);
        select.selectByVisibleText(empStatus);
        select = new Select(page.JobTilte);
        select.selectByVisibleText(JobTitle);
        select = new Select(page.CountryOfOrigin);
        select.selectByVisibleText(country);
        page.joinedDate.sendKeys(JobDate);
        select = new Select(page.department);
        select.selectByVisibleText(department);
        TestBase.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        select = new Select(page.IndirectSupervisor);
        select.selectByValue("3");
        page.saveButton.click();
        page.noButton.click();
        System.out.println();
        System.out.println("ID is "+ EmpIds+","+" and First name is "+FirstName+", Last name is "+lastName+", employee gender "+gender+", and he/she works at "+department);
    }
    @Test(priority = 2)
            public void validate(){
        TestBase.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        pageClass page = new pageClass(TestBase.driver);
page.filterBtn.click();
page.allJobTitles.click();
page.writeDep.sendKeys("Software Engineer");
page.clickFilterButton.click();

    }
    @AfterMethod
    public static void takeScreenShot(ITestResult result) throws IOException {
       if (result.getStatus()==ITestResult.FAILURE);
        ScreenshotMethod.takeScreenShot();
    }






    }


