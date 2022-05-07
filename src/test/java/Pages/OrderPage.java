package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class OrderPage {
    public  WebDriver driver ;
    public OrderPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // product item
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/h2/a")
    WebElement productItem_Element;
    // Add to cart Button
    @FindBy(xpath = "//*[@id=\"add-to-cart-button-18\"]")
    WebElement AddCartButton_Element;
    // close notification msg
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
    WebElement CloseNotification_Element;
    // shopping cart list
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a")
    WebElement shoppingCartLink_Element;
    // agree check btn for term order
    @FindBy(xpath = "//*[@id=\"termsofservice\"]")
    WebElement TermService_Element;
    // Check out btn
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement CheckoutBtn_Element;

    // first continue btn
    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    WebElement ContinueBtn1_Element;
    // second continue btn
    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement ContinueBtn2_Element;
    // third continue btn
    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    WebElement ContinueBtn3_Element;
    // 4 continue btn
    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    WebElement ContinueBtn4_Element;
    // confirm btn
    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    WebElement ConfirmBtn_Element;
    // link order details
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
    WebElement ShowDetailsOrderLink_Element;
    // slected old address
    @FindBy(xpath = "//*[@id=\"billing-address-select\"]")
    WebElement selectBillingAddress_Element;

    // ---------Billing addressing data---------------//
    // Country
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
    WebElement country_Element;
    // city
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
    WebElement City_Element;
    // adrress 1
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    WebElement address_Element;
    // zip code
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    WebElement zipCode_Element;
    // phone number
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    WebElement PhoneNum_Element;
    // successful msg
    @FindBy( xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    WebElement successfulMsg_Element;


    // order number
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div")
    WebElement orderNumber_Element;
    // order content
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/ul")
    WebElement orderContent_Element;
    //order details
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")
    WebElement orderDetails_Element;
    // order product section
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[3]")
    WebElement orderProduct_Element;
    // total price in order
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[5]")
    WebElement Total_Element;

    public void selectProductItem(){
        productItem_Element.click();
    }
    public void addToCart(){
        AddCartButton_Element.click();
    }
    public void closeNotificationMsg(){
        CloseNotification_Element.click();
    }
    public void showCartShopping(){
        shoppingCartLink_Element.click();
    }
    public void CheckBoxTermService(){
        TermService_Element.click();
    }
    public void checkoutButton(){
        CheckoutBtn_Element.click();
    }
    public void ClickContinueOne(){
        ContinueBtn1_Element.click();
    }
    public void ClickContinueTwo(){
        ContinueBtn2_Element.click();
    }
    public void ClickContinueThree(){
        ContinueBtn3_Element.click();
    }
    public void ClickContinueFour(){
        ContinueBtn4_Element.click();
    }
    public void Confirm(){
        ConfirmBtn_Element.click();
    }
    public void OrderDetails(){
        ShowDetailsOrderLink_Element.click();
    }
    public void inputForm(String Country , String City , String address ,String zipCode, String phone )
    {
        // select country from drop down list
        Select country = new Select(country_Element);
        country.selectByVisibleText(Country);
        // write city
        City_Element.clear();
        City_Element.sendKeys(City);
        // write address text
        address_Element.clear();
        address_Element.sendKeys(address);
        // write zip code
        zipCode_Element.clear();
        zipCode_Element.sendKeys(zipCode);
        // write phone
        PhoneNum_Element.clear();
        PhoneNum_Element.sendKeys(phone);

    }
    public boolean isSelectAddressDisplay(){
        return selectBillingAddress_Element.isDisplayed();
    }
    public void oldAdressSelected(String oldAddress){
        Select address =new Select(selectBillingAddress_Element);
        address.selectByVisibleText(oldAddress);
    }
    public String successOrderMsg(){
        return successfulMsg_Element.getText();
    }
    public Boolean IsOrderNumberDisplayed(){
        return orderNumber_Element.isDisplayed();
    }
    public Boolean IsOrderContentDisplayed(){
        return  orderContent_Element.isDisplayed();
    }
    public Boolean IsOrderDetailsDisplayed(){
        return  orderDetails_Element.isDisplayed();
    }
    public Boolean IsOrderTotalAmountDisplayed(){
        return  Total_Element.isDisplayed();
    }

    //cairo
    //Egypt
    //moon streets
    //45369
    //01356489879

}
