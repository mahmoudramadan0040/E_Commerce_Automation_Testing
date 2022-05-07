package StepDefinition;
import Pages.TagPage;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TagStepDefinition {
    WebDriver driver ;
    TagPage tag;
    @Given("user logged in the website for select tag product")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        tag =new TagPage(driver);
        Thread.sleep(2000);
    }
    @Given("user select any category")
    public void user_select_category() throws InterruptedException {
        Thread.sleep(1000);
        tag.selectCategory();
        Thread.sleep(1000);
    }
    @When("user scroll down to show popular tag")
    public void user_scroll_down_browser() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
    }
    @And("user show all tag")
    public void user_show_all_tags() throws InterruptedException {
        tag.showTags();
        Thread.sleep(1000);
    }
    @And("user selected Game tag")
    public void user_select_Game_tag() throws InterruptedException {
        Thread.sleep(1000);
        tag.SelectGameTag();
    }
    @Then("user show product for Game tag")
    public void user_show_product_game(){
        boolean ActualResult = tag.GameProductShow();
        Assert.assertTrue(ActualResult);
    }

    @When("user selected Computer tag")
    public void user_select_computer_tag() throws InterruptedException {
        Thread.sleep(1000);
        tag.SelectComputerTag();
    }
    @Then("user show product for computer tag")
    public void user_show_product_computer() throws InterruptedException {
        Thread.sleep(1000);
        boolean ActualResult = tag.ComputerProductShow();
        Assert.assertTrue(ActualResult);
    }
}
