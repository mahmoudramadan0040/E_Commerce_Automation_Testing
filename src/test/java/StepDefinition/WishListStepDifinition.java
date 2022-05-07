package StepDefinition;

import Pages.ProductWishlist;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WishListStepDifinition {
    WebDriver driver = null ;
    ProductWishlist wishlist;
    @Given("user logged in the website for add product to wishlist")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        wishlist =new ProductWishlist(driver);
        Thread.sleep(2000);
    }
    @Given("user select jewelry category")
    public void user_select_Jewlery_Category(){
        wishlist.SelectJewelryCategory();
    }
    @When("user add the product to wishlist")
    public void user_add_product_to_wishlist() throws InterruptedException {
        wishlist.addProductToWishlist();
        Thread.sleep(1500);
    }
    @Then("user show msg \"The product has been added to your wishlist\"")
    public void user_show_notification(){
        String ActualResult = wishlist.NotificationMsg();
        String ExpectedResult =" The product has been added to your wishlist ";
        Assert.assertTrue(ExpectedResult.contains(ActualResult));
        wishlist.closeNotification();
    }
    @When("user press the wishlist link")
    public void user_go_to_wishList(){
        wishlist.showWishlist();

    }
    @Then("user show product that add to wishlist")
    public void user_show_product_in_wishlist(){
        Assert.assertTrue(wishlist.ProductDisplayinWishList());
    }
    @Given("user select Book category")
    public void user_select_book_category(){
        wishlist.SelectBookCategroy();
    }
}
