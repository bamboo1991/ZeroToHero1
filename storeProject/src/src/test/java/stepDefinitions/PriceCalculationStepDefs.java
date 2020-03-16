package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.PriceCalculationPage;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PriceCalculationStepDefs {

    WebDriver driver = Driver.getDriver();
    PriceCalculationPage pricePage = new PriceCalculationPage();

    @Given("the user navigated to the automation practice webpage")
    public void the_user_navigated_to_the_automation_practice_webpage() {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
    }


    @Given("the user enters to the search box {string}")
    public void the_user_enters_to_the_search_box(String string) {
        pricePage.searchBox.clear();
        pricePage.searchBox.sendKeys(string);
    }


    @When("the user clicks the search button")
    public void the_user_clicks_the_search_button() {
        pricePage.searchBtn.click();
    }

    @Then("the user clicks on the product")
    public void the_user_clicks_on_the_product() {
        for (int i = 0; i < pricePage.productsList.size(); i++) {
            BrowserUtils.hoverOver(driver, pricePage.productsList.get(i));
            pricePage.addToCartBtn.click();
            break;
        }
    }


    @Then("the user clicks on continue shopping button")
    public void the_user_clicks_on_continue_shopping_button() throws InterruptedException {
        Thread.sleep(3000);
        pricePage.continueShoppingBtn.click();
    }

    @Given("the user clicks on check out button")
    public void the_user_clicks_on_check_out_button() {
        pricePage.viewMyCart.click();

    }

    @Given("the user validates the total price")
    public void the_user_validates_the_total_price() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 700)");
        String totalPrice=pricePage.totalPrice.getText().substring(1);
        double dt=Double.parseDouble(totalPrice);
        System.out.println(dt);
        System.out.println(pricePage.totalSum());
        double actualTotPrice=pricePage.totalSum();
        Assert.assertTrue(dt==actualTotPrice);

    }
}
