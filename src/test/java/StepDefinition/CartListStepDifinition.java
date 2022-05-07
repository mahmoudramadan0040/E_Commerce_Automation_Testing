package StepDefinition;


import Pages.ProductShopingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartListStepDifinition {
    WebDriver driver ;
    ProductShopingCartPage cart ;
    @Given("user logged in the website for add product to Cart list")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        cart =new ProductShopingCartPage(driver);
        Thread.sleep(2000);
    }
    @Given("user select Digital category")
    public void user_select_digital_category(){
        cart.selectDigitalCategory();
    }
    @When("user add the product to shopping cart")
    public void user_add_prodcut_to_shopping_cart() throws InterruptedException{
        cart.AddProductToCart();
        Thread.sleep(1500);
    }
    @Then("user show msg \"The product has been added to your shopping cart\"")
    public void user_show_notificationMsg(){
        String ActualResult = cart.NotificationMsg();
        System.out.println(ActualResult);
        String ExpectedResult = "The product has been added to your shopping cart";
        Assert.assertTrue(ExpectedResult.contains(ActualResult));
    }
    @When("user press the Shopping Cart link")
    public void user_press_the_shoping_cart_link(){
        cart.ShowCartList();
    }
    @Then("user show product that add to shopping cart")
    public void user_show_product_in_shoppingCart(){
        Assert.assertTrue(cart.is_Product_in_Cartlist_Displayed());
    }
    @Given("user select Electronics category")
    public void user_select_electorincs_category(){
        cart.SelectElectronicCategory();
    }
    @And("user select sub category Phone")
    public void user_select_sub_category(){
        cart.selectPhoneSubCategory();
    }
    @And("user close notification msg")
    public void closeNotificationMsg(){
        cart.closeNotification();
    }



}
