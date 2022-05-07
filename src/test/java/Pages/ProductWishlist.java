package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductWishlist {
    private WebDriver driver ;
    public ProductWishlist(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // jewelry category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[6]/a")
    WebElement JewelryCategory_Element;
    // book category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[5]/a")
    WebElement BookCategory_Element;
    // add btn product 1 to wishlist
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    WebElement AddWishlistButton_Element;
    // success wishlist notification msg
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement MsgAdd_Element;
    // product that add to wishlist
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table")
    WebElement WishlistItems_Element;
    // wishlist link
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")
    WebElement wishListURL_Element;
    // close notification btn
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
    WebElement CloseBtn_Element;

    public void SelectJewelryCategory(){
        JewelryCategory_Element.click();
    }
    public void SelectBookCategroy(){
        BookCategory_Element.click();
    }
    public void addProductToWishlist(){
        AddWishlistButton_Element.click();
    }
    public String NotificationMsg(){
        return MsgAdd_Element.getText();
    }
    public void showWishlist(){
        wishListURL_Element.click();
    }
    public boolean ProductDisplayinWishList(){
        return WishlistItems_Element.isDisplayed();
    }
    public void closeNotification(){
        CloseBtn_Element.click();
    }
}
