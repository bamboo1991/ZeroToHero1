package Pages;

import Utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mrs_Login_Page {
    public Mrs_Login_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(id = "Pharmacy")
    public WebElement pharmacy;
    @FindBy(id = "loginButton")
    public WebElement login;
    public void Login(String userName, String password){
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        pharmacy.click();
        login.click();
    }

}
