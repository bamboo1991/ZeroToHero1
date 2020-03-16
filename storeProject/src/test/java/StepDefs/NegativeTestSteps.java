package StepDefs;

import Pages.TestCase1;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class NegativeTestSteps {
    WebDriver driver = Driver.getDriver();
    TestCase1 page = new TestCase1();
    @Given("the user must validate her or his account by providing wrong credentials {string} and {string}")
    public void the_user_must_validate_her_or_his_account_by_providing_wrong_credentials_and(String email, String password) {
        page.signOutBtn.click();
        page.signInBtn.click();
        page.signInWithEmail.sendKeys(email);
        page.existingPassword.sendKeys(password);
        page.signInBtn2.click();
    }
}
