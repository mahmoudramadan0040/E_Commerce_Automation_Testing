package StepDefinition;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserFactory {
    static WebDriver driver =null;
    public static WebDriver openBrowser(){
        // set property in the system to find web driver
        String ChromePath = System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        // create new object from the web driver
        driver = new ChromeDriver();
        // open this website https://demo.nopcommerce.com/
        driver.manage().window().maximize();
        return driver;
    }
    public WebDriver loginToWebsite() {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.openBrowser();
        LoginPage login =new LoginPage(driver);
        final String URL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(URL);
        login.InputFields("mahmoudramadan00@gmail.com","moon2016");
        login.SubmitInput();
        return  driver;
    }
    public static void terminateBrowser(){
        driver.close();
        driver.quit();

    }
}
