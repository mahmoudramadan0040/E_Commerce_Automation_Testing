package StepDefinition;


import Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchStepDefinition {

    WebDriver driver ;
    SearchPage search ;
    @Given("user login in the website")
    public void user_login_to_website (){
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
    }
    @Given("user write computer keyword on search input")
    public void user_input_search_keyword(){

        search =new SearchPage(driver);
        search.inputKeyword("computer");

    }
    @When("user enter the search")
    public void user_enter_submit(){
        search.submit();
    }
    @Then("user show result of search")
    public void searchSuccess(){
        String AccualResult = search.ResultSearch();
        System.out.println("this is result of item"+AccualResult+"hereeeeeeeeeeeeeeeeeeeeeeee");
        String ExpectedResult ="1";
        Assert.assertTrue(AccualResult.contains(ExpectedResult));
    }

}
