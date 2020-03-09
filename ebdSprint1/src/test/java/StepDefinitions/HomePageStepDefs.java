package StepDefinitions;

import Pages.AddEmployeeWithDisc.homePage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefs {
    homePage homePage = new homePage();
   WebDriver driver = Driver.getDriver();

    @Given("the user navigates to the EBP wep page")
    public void the_user_navigates_to_the_EBP_wep_page() {
        driver.get(ConfigReader.getProperty("url"));

    }
    @Given("the user logs in with valid username and password")
    public void the_user_logs_in_with_valid_username_and_password() {
        homePage.usernameField.sendKeys(ConfigReader.getProperty("username"));
        homePage.passwordField.sendKeys(ConfigReader.getProperty("password"));
        homePage.loginButton.click();
    }

    @Given("the user validates the header {string}")
    public void the_user_validates_the_header(String header) {
        Assert.assertTrue(homePage.header.getText().equals(header));
        System.out.println(homePage.header.getText());
   }
}
