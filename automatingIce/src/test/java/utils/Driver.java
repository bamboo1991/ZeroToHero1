package utils;

public class Driver {
    private static WebDriver driver;
    private Driver(){}
    public static WebDriver getDriver(String driverName) {
        if (driver!=null){
            return driver;
        }
        switch (driverName){
            case "chrom":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "ff":
                WebDriverManager.firefoxdriver().setup();
                driver =new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
                break;
        }return driver;
    }
}
