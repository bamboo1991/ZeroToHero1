package Pages;

import Utils.BrowserUtils;
import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;

public class OpenMRSRegisterPage {
public OpenMRSRegisterPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(xpath ="//h2")
    public WebElement  registerText;
@FindBy(xpath = "//fieldset[@id='demographics-name']//h3")
    public WebElement patientNameQuestion;
@FindBy(xpath = "//fieldset[@id='demographics-name']//p//label")
    public List<WebElement>  Given_Middle_Family_name;
@FindBy(xpath = "//ul[@id='formBreadcrumb']//span")
    public List<WebElement> demographicsName;
    @FindBy(name = "givenName")
    public WebElement givenName;
    @FindBy(name = "middleName")
    public WebElement middleName;
    @FindBy(name = "familyName")
    public WebElement familyName;

@FindBy(xpath = "//span[@id='genderLabel']")
public WebElement genderLabel;
@FindBy(xpath = "//select[@id='gender-field']")
public WebElement genderField;
@FindBy(xpath = "//span[@id='birthdateLabel']")
public WebElement birthdateLabel;
@FindBy(id = "birthdateDay-field")
public WebElement birthDate;
@FindBy(id = "birthdateMonth-field")
public WebElement monthField;
@FindBy(id = "birthdateYear-field")
public WebElement YearField;
@FindBy(xpath = "//span[.='Address']")
public WebElement AddressButton;
@FindBy(id = "address1")
public WebElement getAddress;
@FindBy(xpath = "//span[.='Phone Number']")
public WebElement phoneNumberBtn;
@FindBy(name = "phoneNumber")
public WebElement PhoneNumberBox;
@FindBy(xpath = "//span[.='Relatives']")
public WebElement Relatives;
@FindBy(id = "relationship_type")
public WebElement relationshipTYPE;
@FindBy(xpath = "//input[@ng-model='relationship.name']")
public WebElement relationshipName;
@FindBy(id = "confirmation_label")
public WebElement confirmationLabel;
@FindBy(xpath = "//div[@id='dataCanvas']//p")
public List<WebElement> confirmationPage;
@FindBy(id="submit")
public WebElement submitButton;
@FindBy(className = "//ul[@id='breadcrumbs']//a")
public WebElement homeButton;



    public static List<String > getData(){
    List<String> headers = new ArrayList<>();
    headers.add("Demographics");
    headers.add("Name");
    headers.add ("Gender");
    headers.add("Birthdate");
    headers.add("Contact Info");
    headers.add("Address");
    headers.add("Phone Number");
    headers.add("Relationships");
    headers.add("Relatives");
    headers.add("Confirm");
    return headers;
}
public static  List<String> getConfirmationData(){
        List<String> headers=new ArrayList<>();
        headers.add("Name: Adam, Lee");
        headers.add("Gender: Male");
        return headers;
    }
public  void registerPatient(String name, String lastName, String gender, String day, String month, String year, String
        address, String phoneNumber, String relationShip, String relationShipName){
givenName.sendKeys(name);
   familyName.sendKeys(lastName);
    genderLabel.click();
  BrowserUtils.selectByVisible(genderField, gender);
    birthdateLabel.click();
  birthDate.sendKeys(day);
    BrowserUtils.selectByVisible(monthField, month);
  YearField.sendKeys(year);
   AddressButton.click();
   getAddress.sendKeys(address);
  phoneNumberBtn.click();
PhoneNumberBox.sendKeys(phoneNumber);
    Relatives.click();
    BrowserUtils.selectByVisible(relationshipTYPE, relationShip);
    relationshipName.sendKeys(relationShipName);
    confirmationLabel.click();
}

}
