package StepDefs;

import Pages.TestCase1;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginWithValidCredentials {
    WebDriver driver = Driver.getDriver();
    TestCase1 page = new TestCase1();

    @Given("the user must verify the account by sign in with {string} and {string}")
    public void the_user_must_verify_the_account_by_sign_in_with_and(String accountEmail, String accountPassword) {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        page.signOutBtn.click();
        page.signInBtn.click();
        page.signInWithEmail.sendKeys(accountEmail);
        page.existingPassword.sendKeys(accountPassword);
        page.signInBtn2.click();
    }
    @Given("the user must refresh the page")
    public void the_user_must_refresh_the_page() {
        page.signInBtn.click();

    }
    @Given("the user must login {string} and {string}")
    public void the_user_must_login_and(String email, String password) {
page.signInWithEmail.sendKeys(email);
page.existingPassword.sendKeys(password);
page.signInBtn2.click();
    }

}
