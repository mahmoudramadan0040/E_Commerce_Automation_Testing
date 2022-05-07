package StepDefinition;
import Pages.CategoryPage;
import Pages.CurrenciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CategoryStepDifinition {
    WebDriver driver ;
    CategoryPage category;
    @Given("user logged in the website for select category")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        category =new CategoryPage(driver);
        Thread.sleep(2000);
    }
    @When("user press any category")
    public void user_press_any_category() {
        category.selectCategory();
    }
    @Then("user show product items for this category")
    public void user_show_multiple_products(){
        boolean Actualresult= category.productItemsDisplay();
        Assert.assertTrue(Actualresult);
    }
    @When("user press the category")
    public void user_press_specific_category(){
        category.selectMainCategory();
    }
    @And("user press sub category")
    public void user_press_on_sub_category(){
        category.selectSubCategory();
    }
    @Then("user show the product items for this  subcategory")
    public void user_show_multiple_items(){
        boolean ActualResult = category.productItemsDisplay();
        Assert.assertTrue(ActualResult);
    }

}
