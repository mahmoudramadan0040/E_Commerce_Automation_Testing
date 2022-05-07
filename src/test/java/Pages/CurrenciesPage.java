package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CurrenciesPage {
    private WebDriver driver ;
    public CurrenciesPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // product item
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span")
    WebElement ItemCurrency_Element;
    // dropdown list of the currency
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/select")
    WebElement Currency_Element;

    public void SwitchCurrency(String currency ){
        Currency_Element.sendKeys(Keys.ENTER);
        Select CustomerCurrency = new Select(Currency_Element);
        CustomerCurrency.selectByVisibleText(currency);
    }
    public String ActualPrice(){
        return ItemCurrency_Element.getText();
    }


}
