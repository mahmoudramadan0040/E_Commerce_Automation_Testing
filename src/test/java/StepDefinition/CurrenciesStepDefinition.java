package StepDefinition;

import Pages.CurrenciesPage;
import io.cucumber.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CurrenciesStepDefinition {
    WebDriver driver ;
    CurrenciesPage currency ;
    @Given("user logged in the website")
    public void user_login_to_website () throws InterruptedException {
        BrowserFactory browser = new BrowserFactory();
        driver = browser.loginToWebsite();
        currency= new CurrenciesPage(driver);
        Thread.sleep(2000);
    }
    @When("user select the us dollar currencies")
    public void user_select_dollar_currency() throws InterruptedException {
        currency.SwitchCurrency("US Dollar");
        Thread.sleep(2000);
    }
    @Then("user show product in the dollar currencies")
    public void user_show_price_in_dollar(){
        String ActualResult = currency.ActualPrice();
        String ExpectedResult ="$";
        System.out.println(ActualResult);
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
    @When("user select the Euro currencies")
    public void user_select_Euro_currency(){
        currency.SwitchCurrency("Euro");
    }
    @Then("user show product in the Euro currencies")
    public void user_show_price_in_Euro(){
        String ActualResult = currency.ActualPrice();
        String ExpectedResult ="€";
        System.out.println(ActualResult);
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
}
