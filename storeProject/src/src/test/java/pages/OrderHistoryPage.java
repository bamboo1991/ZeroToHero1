package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class OrderHistoryPage {

    public OrderHistoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement signIn;

    @FindBy(xpath = "(//p[@class='product-desc']//following-sibling::div/span[@class='price product-price'])[2]")
    public WebElement price;

    //    public double biggestPrice() {
//        String price1=pricesList.get(0).getText().substring(1);
//        double priceD1=Double.parseDouble(price1);
//        double largest=priceD1;
//        for (int i = 1; i <pricesList.size(); i++){
//            String price=pricesList.get(i).getText().substring(1);
//            double priceD=Double.parseDouble(price);
//            if (largest<priceD){
//                largest=priceD;
//            }
//        }return largest;
//    }
    @FindBy(xpath = "(//span[.='Add to cart'])[2]")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public WebElement checkOutBtn;

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement proceedToCheckOut;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    public WebElement proceedToCheckOut2;

    @FindBy(id = "cgv")
    public WebElement termsCheckbox;

    @FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement proceedToCheckOut3;

    @FindBy(id = "total_product")
    public WebElement totPrice;
}