package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class openMRShomePage {
    public openMRShomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h4")
    public WebElement textMessage;
    @FindBy(xpath = "//div[@id='apps']//a")
    public List<WebElement>  homePageApps;
    public void clickApp(String name){
        for (WebElement element:homePageApps){
            if (element.getText().trim().equals(name)){
                element.click();
                break;
            }
        }
    }


}
