package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase1 {
    public TestCase1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInBtn;
    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailFiled;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement createAnAccount;
    @FindBy(id = "uniform-id_gender1")
    public WebElement Mr;
    @FindBy(id = "uniform-id_gender2")
    public WebElement Mrs;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='passwd']")
    public WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement selectDays;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement selectMonth;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement selectYears;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;
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
    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerBtn;

    @FindBy(xpath = "//span[.='Ariet Johnson']")
    public WebElement HeaderName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement signInWithEmail;
    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement existingPassword;
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement signInBtn2;
    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signOutBtn;


}
