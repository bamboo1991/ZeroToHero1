package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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


}
