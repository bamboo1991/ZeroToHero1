package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class PriceCalculationPage {

    public PriceCalculationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "search_query_top")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//a[@class='product_img_link']/img[@class='replace-2x img-responsive']")
    public List<WebElement> productsList;

    @FindBy(xpath = "//span[.='Add to cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
    public WebElement continueShoppingBtn;

    @FindBy(xpath = "//b[.='Cart']")
    public WebElement viewMyCart;

    @FindBy(xpath = "//span[@id='total_price']")
    public WebElement totalPrice;

    @FindBy(xpath = "//span[@id='total_product_price_5_19_0']")
    public WebElement price1;

    @FindBy(xpath = "//span[@id='total_product_price_4_16_0']")
    public WebElement price2;

    @FindBy(xpath = "//span[@id='total_product_price_1_1_0']")
    public WebElement price3;

    @FindBy(xpath = "//a[@id='button_order_cart']")
    public WebElement checkOutBtn;

    @FindBy(id = "total_shipping")
    public WebElement taxPrice;

    public double totalSum(){
        String priceStr=price1.getText().substring(1);
        String priceStr1=price2.getText().substring(1);
        String priceStr2=price3.getText().substring(1);
        String priceTax=taxPrice.getText().substring(1);
        double d1=Double.parseDouble(priceStr);
        double d2=Double.parseDouble(priceStr1);
        double d3=Double.parseDouble(priceStr2);
        double d4=Double.parseDouble(priceTax);
        double sum=d1+d2+d3+d4;
        return sum;
    }

}
