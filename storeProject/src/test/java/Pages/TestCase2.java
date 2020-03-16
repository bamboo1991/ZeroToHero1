package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase2 {
    public TestCase2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='My addresses']")
    public WebElement myAddress;
    @FindBy(xpath = "//span[.='Update']")
    public WebElement updateButton;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement City;
    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='postcode']")
    public WebElement zipCode;
    @FindBy(xpath = "//select[@id='id_country']")
    public WebElement countrySelection;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//button[@id='submitAddress']")
    public WebElement saveBtn;
    @FindBy(xpath = "//span[@class='address_address1']")
    public WebElement actualAddress;
    @FindBy(xpath = "//ul[@class='last_item item box']//li[5]//span[3]")
    public WebElement actaulZipcode;

}
