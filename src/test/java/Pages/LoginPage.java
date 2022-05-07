package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver = null ;
    public LoginPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }

    //email
    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email_Element;
    // password
    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement password_Element;
    // btn submit
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement submit_Element;
    // account <li> in the header
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement myAccount_tElement;


    public void InputFields(String email ,String password){
        email_Element.clear();
        password_Element.clear();
        email_Element.sendKeys(email);
        password_Element.sendKeys(password);

    }
    public void SubmitInput(){
        submit_Element.click();
    }
    public String MyAcount(){
        return myAccount_tElement.getText();
    }
    public void exit(){
        driver.quit();
    }


}
