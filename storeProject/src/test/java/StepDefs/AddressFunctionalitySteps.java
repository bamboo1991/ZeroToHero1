package StepDefs;

import Pages.TestCase2;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddressFunctionalitySteps {
    WebDriver driver = Driver.getDriver();
    TestCase2 page = new TestCase2();
    Select select;

    @Given("User home address needs to be updated")
    public void user_home_address_needs_to_be_updated(Map<String, String> addressInfo) {
        page.myAddress.click();
        page.updateButton.click();
        page.address.clear();
        page.address.sendKeys(addressInfo.get("Address"));
        page.City.clear();
        page.City.sendKeys(addressInfo.get("City"));

        select = new Select(page.state);
        select.selectByVisibleText(addressInfo.get("State"));
        page.zipCode.clear();
        page.zipCode.sendKeys(addressInfo.get("Zip"));
        select = new Select(page.countrySelection);
        select.selectByVisibleText(addressInfo.get("Country"));
        page.phoneNumber.clear();
        page.phoneNumber.sendKeys(addressInfo.get("Phone Number"));
        page.saveBtn.click();
    }
    @Given("the user must validate the new address")
    public void the_user_must_validate_the_new_address(Map<String, String> expectedAddress) {
        Assert.assertEquals(expectedAddress.get("New address"),page.actualAddress.getText());
        Assert.assertEquals(expectedAddress.get("New zip"),page.actaulZipcode.getText());
        System.out.println(page.actualAddress.getText());
        System.out.println(page.actaulZipcode.getText());
    }
}
