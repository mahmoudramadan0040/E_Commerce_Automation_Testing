package StepDefinition;
import Pages.ComparePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CompareProductListStepDifinition {
    WebDriver driver ;
    ComparePage comparePage;
    @Given("user logged in the website for add product to compare list")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        comparePage =new ComparePage(driver);
        Thread.sleep(2000);
    }
    @Given("user select Electronic category")
    public void user_select_Categroy(){
        comparePage.selectCategroy();
    }
    @And("user select camera and photo sub category")
    public void user_select_sub_category(){
        comparePage.selectSubCategory();
    }
    @When("user add First product to compare list")
    public void user_add_product_to_compareList() throws InterruptedException {
        comparePage.PressCompareBtnOne();
        Thread.sleep(1500);
    }

    @Then("user show msg \"The product has been added to your Comparison list\"")
    public void user_show_notification(){
        String ActualResult =comparePage.NotificationMsg();
        String ExpectedResult = "The product has been added to your product comparison";
        Assert.assertTrue(ExpectedResult.contains(ActualResult));
    }
    @When("user add second product to compare list")
    public void user_add_anther_product_to_compareList() throws InterruptedException {
        comparePage.PressCompareBtnTwo();
        Thread.sleep(1500);
    }
    @When("user press the Comparison link")
    public void user_press_the_link(){
        comparePage.ShowCompareList();
    }
    @Then("user show all products that added in Comparison list")
    public void user_show_all_product_in_compareList(){
        Assert.assertTrue(comparePage.IsCompareProductIsDisplayed());
    }


}
