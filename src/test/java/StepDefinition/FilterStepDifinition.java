package StepDefinition;
import Pages.FilterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class FilterStepDifinition {
    WebDriver driver ;
    FilterPage filter ;
    @Given("user logged in the website for Filter product")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        filter= new FilterPage(driver);
        Thread.sleep(2000);
    }
    @Given("user press specific category that has sub category")
    public void user_press_main_category(){
        filter.PressApprovalCategory();
    }
    @And("press the sub category like shoes")
    public void user_press_sub_category(){
        filter.PressShoesSubCategory();
    }
    @When("user filter product by color red")
    public void user_filter_product_by_color_red(){
        filter.FilterUsingRedColor();
    }
    @Then("user show product items have color red")
    public void user_show_product_with_red_color(){
        boolean ActualResult =filter.RedProductItemResult();
        Assert.assertTrue(ActualResult);
    }
    @When("user filter product by color Grey")
    public void user_filter_product_by_color_grey(){
        filter.FilterUsingGreyColor();
    }
    @Then("user show product items have color Grey")
    public void user_show_product_with_grey_color(){
        boolean ActualResult =filter.GreyProductItemResult();
        Assert.assertTrue(ActualResult);
    }
}
