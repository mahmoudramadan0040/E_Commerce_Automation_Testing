package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductShopingCartPage {
    private WebDriver driver ;
    public ProductShopingCartPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // notfication msg
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement notificationMsg_Element;
    // close notification btn
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
    WebElement CloseBtn_Element;
    // shopping cart url
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a")
    WebElement CartUrl_Element;
    // table of shopping cart product
    @FindBy(xpath = "//*[@id=\"shopping-cart-form\"]/div[1]/table")
    WebElement CartList_Element;
    // Digital category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[4]/a")
    WebElement DigitalCategory_Element;
    // Electronic category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    WebElement ElectronicCategory_Element;
    // Phone  sub category
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a")
    WebElement Phone_Element;
    // add to cart list button
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement AddCartBtn_Element;

    public void SelectElectronicCategory(){
        ElectronicCategory_Element.click();
    }
    public void selectDigitalCategory(){
        DigitalCategory_Element.click();
    }
    public void selectPhoneSubCategory(){
        Phone_Element.click();
    }
    public void closeNotification(){
        CloseBtn_Element.click();
    }
    public void AddProductToCart(){
        AddCartBtn_Element.click();
    }
    public boolean is_Product_in_Cartlist_Displayed(){
        return CartList_Element.isDisplayed();
    }
    public void ShowCartList(){
        CartUrl_Element.click();
    }
    public String NotificationMsg(){
        return notificationMsg_Element.getText();
    }
}
