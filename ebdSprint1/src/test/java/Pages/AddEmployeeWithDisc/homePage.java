package Pages.AddEmployeeWithDisc;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    public homePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='form-username']")
    public WebElement usernameField;
    @FindBy(name = "form-password")
    public WebElement passwordField;
    @FindBy(id = "btnLogin")
    public WebElement loginButton;
    @FindBy(xpath = "//h1")
    public WebElement header;
}
