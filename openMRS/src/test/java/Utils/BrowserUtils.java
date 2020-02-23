package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void switchWindow(String targetTitle){
      WebDriver driver = Driver.getDriver();
       Set<String> allWindows=driver.getWindowHandles();
        if(!driver.getTitle().equals(targetTitle)){
            for(String window : allWindows){
                driver.switchTo().window(window);
                if(driver.getTitle().equals(targetTitle)){
                    break;
                }
            }
        }
    }
    public static void verifyBrokenLink( List<WebElement> links){
        for(WebElement link : links ){
            String hrefValue=link.getAttribute("href");
            try {
                URL url = new URL(hrefValue);
                HttpURLConnection connect = (HttpURLConnection) url.openConnection();
                connect.setConnectTimeout(3000);
                connect.connect();
                if (connect.getResponseCode()>=400 || connect.getResponseCode()>=500) {
                    System.out.println(hrefValue);
                    System.out.println("The link is broken " + connect.getResponseMessage() + " " +
                            connect.getResponseCode());
                }
            }catch (IOException e){
                e.getStackTrace();
            }
        }
    }
    public static void hoverOver(WebElement element){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(element).build().perform();
    }
    public static void dragAndDrop( WebElement from, WebElement to){
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(from,to).build().perform();
    }
    // homework create reusable method to wait visibility of element
    // to wait clickable of element
    public static void waitForVisibility(WebElement element, int timeUnit){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeUnit);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForsec(int time){
        time=time*10;
        try {
            Thread.sleep(time);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public static void takeScreenShot() throws IOException {
        File src=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File desFile=new File("ScreenShotFile/"+System.currentTimeMillis()+".png");
        FileUtils.copyFile(src, desFile);
    }
}
