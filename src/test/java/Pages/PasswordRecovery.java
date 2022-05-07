package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecovery {
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a")
    WebElement forgetUrl_Element;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement msgNotification_Element;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email_Element;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
    WebElement recoverBtn_Element;


    WebDriver driver = null ;
    public PasswordRecovery(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    public void resetPassword(String email){
        email_Element.clear();
        email_Element.sendKeys(email);
    }
    public void pressRecover(){
        recoverBtn_Element.click();
    }
    public void forgetPasswordUrl(){
        forgetUrl_Element.click();
    }
    public String resetSuccess(){
        return msgNotification_Element.getText();
    }

    public void exit(){
        driver.quit();
    }
}
