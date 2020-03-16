package StepDefs;

import Pages.TestCase1;
import Utils.BrowseUtils;
import Utils.ConfigReader;
import Utils.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AccountCreatingSteps {
    Faker javaFaker = new Faker();
    String email1 = javaFaker.name().username() + "@gmail.com";
    WebDriver driver = Driver.getDriver();
    TestCase1 page = new TestCase1();
    Select select;




    @Given("the user navigated to the website")
    public void the_user_navigated_to_the_website() {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().fullscreen();
    }

    @When("the user must sing up with email address")
    public void the_user_must_sing_up_with_email_address() {
        page.signInBtn.click();
        page.emailFiled.sendKeys(email1);
        page.createAnAccount.click();
    }

    @Then("the user will enter his or her information to sing up")
    public void the_user_will_enter_his_or_her_information_to_sing_up(Map<String, String> singInInfo) {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        page.Mr.click();
        page.firstName.sendKeys(singInInfo.get("FirstName"));
        page.lastName.sendKeys(singInInfo.get("LastName"));
        page.password.sendKeys(BrowseUtils.generatePassword());
//brian.mraz@gmail.com
// bl%xds
    }

    @Then("the user must provide address information")
    public void the_user_must_provide_address_information(Map<String, String> fullInfo) {
        select = new Select(page.selectDays);
        select.selectByValue("11");
        select = new Select(page.selectMonth);
        select.selectByValue("3");
        select = new Select(page.selectYears);
        select.selectByValue("1992");
        page.company.sendKeys(fullInfo.get("Company"));
        page.address.sendKeys(fullInfo.get("Address"));
        page.City.sendKeys(fullInfo.get("City"));
        select = new Select(page.state);
        select.selectByVisibleText("Illinois");
        page.zipCode.sendKeys(fullInfo.get("Zip"));
        select = new Select(page.countrySelection);
        select.selectByVisibleText("United States");
        page.phoneNumber.sendKeys(fullInfo.get("PhoneNumber"));
        page.registerBtn.click();
    }
    @Then("once account was created exits by singing out")
    public void once_account_was_created_exits_by_singing_out() {
page.signOutBtn.click();
    }
    @Then("the user must verify the account by sign in with email and password")
    public void the_user_must_verify_the_account_by_sign_in_with_email_and_password() {
        page.signInWithEmail.sendKeys(email1);
        page.existingPassword.sendKeys("bl%xds");
        page.signInBtn2.click();
    }

    @Then("the user must verify her or his name on header part {string}")
    public void the_user_must_verify_her_or_his_name_on_header_part(String expectedHeader) {
        String actualHeader= page.HeaderName.getText();
        Assert.assertEquals(expectedHeader,actualHeader);

    }

}