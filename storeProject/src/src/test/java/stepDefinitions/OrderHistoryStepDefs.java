package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.OrderHistoryPage;
import pages.PriceCalculationPage;
import utils.BrowserUtils;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class OrderHistoryStepDefs {

    PriceCalculationPage pricePage=new PriceCalculationPage();
    OrderHistoryPage orderPage=new OrderHistoryPage();
    WebDriver driver= Driver.getDriver();
    JavascriptExecutor js=(JavascriptExecutor)driver;

    @Given("the user logged in with valid credentials")
    public void the_user_logged_in_with_valid_credentials() {
        orderPage.loginBtn.click();
        orderPage.username.sendKeys("marge.wehner@gmail.com");
        orderPage.password.sendKeys("bl%xds");
        orderPage.signIn.click();
    }

    @Given("the user inputs to the search box {string}")
    public void the_user_inputs_to_the_search_box(String productName) {
        pricePage.searchBox.sendKeys(productName);
        pricePage.searchBtn.click();
    }

    @Then("the user clicks on the product with the highest price")
    public void the_user_clicks_on_the_product_with_the_highest_price() {
        js.executeScript("window.scrollBy(0, 500)");
        BrowserUtils.hoverOver(driver,pricePage.productsList.get(1));
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        orderPage.addToCartBtn.click();
    }

    @Then("the user clicks on check out button and proceeds to check out")
    public void the_user_clicks_on_check_out_button_and_proceeds_to_check_out() {
        orderPage.checkOutBtn.click();
        orderPage.proceedToCheckOut.click();
        orderPage.proceedToCheckOut2.click();
        orderPage.termsCheckbox.click();
        orderPage.proceedToCheckOut3.click();
    }


    @Then("the user validates the total price of the dress")
    public void the_user_validates_the_total_price_of_the_dress() {
        js.executeScript("window.scrollBy(0, 400)");
        String expectedPrice="$30.50";
        String actualPrice=orderPage.totPrice.getText();
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
