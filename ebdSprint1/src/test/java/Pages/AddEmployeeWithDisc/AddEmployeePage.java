package Pages.AddEmployeeWithDisc;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddEmployeePage {
    public AddEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='btnAddEmployee']")
    public WebElement addEmployeeBtn;
    @FindBy(xpath = "//label[@for='firstname']//following-sibling::div//child::input")
    public WebElement firstName;
    @FindBy(xpath = "//label[@for='lastname']//following-sibling::div//child::input")
    public WebElement lastName;
    @FindBy(xpath = "//label[@for='dependents']//following-sibling::div//child::input")
    public WebElement dependents;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn;
    @FindBy(xpath = "//tr/td")
    public List<WebElement> tableContents;
}
