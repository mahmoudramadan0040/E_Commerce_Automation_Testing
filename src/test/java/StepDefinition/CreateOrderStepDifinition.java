package StepDefinition;
import Pages.OrderPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class CreateOrderStepDifinition {
    WebDriver driver ;
    OrderPage order;
    @Given("user logged in the website for add product to make successful order")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        order =new OrderPage(driver);
        Thread.sleep(2000);
    }
    @Given("user select any product to show")
    public void user_select_product(){
        order.selectProductItem();
    }
    @And("user add this product to cart shpping list")
    public void user_add_product_item_toCart() throws InterruptedException {
        order.addToCart();
        Thread.sleep(1000);
    }
    @And("user close from notification message")
    public void user_closeNotificationMsg() throws InterruptedException{
        Thread.sleep(1000);
        order.closeNotificationMsg();
    }
    @When("user press on shopping cart link")
    public void user_show_shopping_cart() throws InterruptedException{
        Thread.sleep(1000);
        order.showCartShopping();
    }
    @And("user agree the term of order")
    public void user_agree_term_of_order(){
        order.CheckBoxTermService();
    }
    @And("user press CheckOut button for order")
    public void user_press_checkout_for_order() throws InterruptedException {
        order.checkoutButton();
        Thread.sleep(500);
    }
    @And("user enter billing address if not exists")
    public void user_enter_billing_address() throws InterruptedException {
        try{
            if(order.isSelectAddressDisplay()){
                order.oldAdressSelected("mahmoud ramadan, moon streets, cairo 45369, Egypt");
                Thread.sleep(400);
                order.ClickContinueOne();
                Thread.sleep(600);
            }else{
                order.inputForm("Egypt","cairo","moon streets","45369","01356489879");
                Thread.sleep(400);
                order.ClickContinueOne();
                Thread.sleep(600);
            }
        }catch (Exception e){
            order.inputForm("Egypt","cairo","moon streets","45369","01356489879");
            Thread.sleep(400);
            order.ClickContinueOne();
            Thread.sleep(600);
        }
//        if(order.isSelectAddressDisplay()){
//            order.oldAdressSelected("mahmoud ramadan, moon streets, cairo 45369, Egypt");
//            Thread.sleep(400);
//            order.ClickContinueOne();
//            Thread.sleep(600);
//        }
//        else{
//            order.inputForm("Egypt","cairo","moon streets","45369","01356489879");
//            Thread.sleep(400);
//            order.ClickContinueOne();
//            Thread.sleep(600);
//        }
    }
    @And("user shipping address")
    public void user_shipping_address() throws InterruptedException {
        Thread.sleep(600);
        order.ClickContinueTwo();

    }
    @And("user select shipping method type")
    public void user_select_shipping_type() throws InterruptedException {
        Thread.sleep(600);
        order.ClickContinueThree();

    }
    @And("user select payment method type")
    public void user_select_payment_type() throws InterruptedException {
        Thread.sleep(600);
        order.ClickContinueFour();
    }

    @And("user confirm the order by pressing confirm btn")
    public void user_confirm_order() throws InterruptedException {
        Thread.sleep(600);
        order.Confirm();
    }
    @Then("user show message \"Your order has been successfully processed!\"")
    public void user_show_msg_success_order() throws InterruptedException {
        Thread.sleep(1200);
        String ActualResult = order.successOrderMsg();
        System.out.println(ActualResult);
        String ExpectedResult ="Your order has been successfully processed!";
        Assert.assertTrue(ExpectedResult.contains(ActualResult));
    }
    @When("user navigate the link order details")
    public void user_Navigate_order_details_url() throws InterruptedException {
        Thread.sleep(600);
        order.OrderDetails();
    }
    @Then("user show order number of order")
    public void user_show_number_of_order(){
        Assert.assertTrue(order.IsOrderNumberDisplayed());
    }
    @And("user show order content of order")
    public void user_show_content_of_order(){
        Assert.assertTrue(order.IsOrderContentDisplayed());
    }
    @And("user show order details of order")
    public void user_show_order_details(){
        Assert.assertTrue(order.IsOrderDetailsDisplayed());
    }
    @And("user show total price for this order")
    public void user_show_total_price_of_order(){
        Assert.assertTrue(order.IsOrderTotalAmountDisplayed());
    }

}
