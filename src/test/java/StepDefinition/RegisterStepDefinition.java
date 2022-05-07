package StepDefinition;


import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {
    public WebDriver driver;
    RegisterPage register ;
    BrowserFactory browser = new BrowserFactory();
    @Given("user open the browser for registeration")
    public void openBrowser(){
        driver= browser.openBrowser();
    }
    @And("user navigate the register page")
    public void Navigate_Register_Page(){
        register = new RegisterPage(driver);
        final String URL = "https://demo.nopcommerce.com/register?returnUrl=%2F";
        driver.navigate().to(URL);
    }
    @When("user enter the data for account")
    public void user_register_valid_data(){
        register.InputFields("1","January","2000",
                "mahmoud","ramadan",
                "mahmoudramadan00@gmail.com","moon2016",
                "helwan");
    }
    @And("user press register button")
    public void user_press_register_btn(){
        register.Rregister();
    }
    @Then("user should register successfully")
    public void successfully_register(){
        String actualResult =register.SuccessRegister();
        System.out.println(actualResult);
        String expectedResult = "Your registration completed";
        Assert.assertTrue(expectedResult.contains(actualResult));
        Assert.assertEquals(actualResult,expectedResult);
    }





}
