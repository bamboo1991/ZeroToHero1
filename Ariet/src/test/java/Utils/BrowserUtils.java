package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {
    public static void switchWindow(String targetTitle){
        WebDriver driver = Driver.getDriver();
        Set<String> allTabs = driver.getWindowHandles();
        if (!driver.getTitle().equals(targetTitle)){
            for (String window: allTabs){
                driver.switchTo().window(window);
                if (driver.getTitle().equals(targetTitle)){
                    break;
                }
            }
        }
    }
    public static voidMAap
}
