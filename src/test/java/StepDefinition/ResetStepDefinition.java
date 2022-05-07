package StepDefinition;

import Pages.PasswordRecovery;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class ResetStepDefinition {

    public  WebDriver driver ;
    BrowserFactory browser = new BrowserFactory();
    PasswordRecovery reset ;
//    WebDriver driver =null;
    @Given("user open the browser for reset")
    public void openBrowser(){
        driver= browser.openBrowser();
    }

    @And("user navigate the reset page")
    public void NavigateURL(){
        reset = new PasswordRecovery(driver);

        final String URL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(URL);
    }
    @When("user enter forget password")
    public void forgetPassword(){
        reset.forgetPasswordUrl();
    }
    @And("user enter the valid email")
    public void EnterEmail(){
        reset.resetPassword("mahmoudramadan00@gmail.com");
    }
    @And("user press recover button")
    public void Recover(){
        reset.pressRecover();
    }
    @Then("user should Reset successfully")
    public void ResetSucess(){
        String AccualResult = reset.resetSuccess();
        String ExpectedResult ="Email with instructions has been sent to you.";
        Assert.assertTrue(AccualResult.contains(ExpectedResult));
    }


}
