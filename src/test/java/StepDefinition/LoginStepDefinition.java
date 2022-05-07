package StepDefinition;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {
    WebDriver driver ;
    LoginPage login ;
    BrowserFactory browser = new BrowserFactory();
    @Given("user open the Browser for login")
    public void openBrowser(){
        driver= browser.openBrowser();
    }
    @And("user navigate the login page")
    public void NavigateURL(){
        login = new LoginPage(driver);

        final String URL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(URL);
    }

    @When("user enter the valid Email and  valid Password")
    public void user_input_email_password(){
        login.InputFields("mahmoudramadan00@gmail.com","moon2016");

    }
    @And("user press submit")
    public void user_press_submit(){
        login.SubmitInput();
    }
    @Then("user should login successfully")
    public void Success_login(){
        String expectResult = "My account";
        String actualResult= login.MyAcount();

        Assert.assertTrue(actualResult.contains(expectResult));


    }
    @And("user redirect to Home Page")
    public void user_home_page(){
        String expectHomeUrl = "https://demo.nopcommerce.com/";
        String actualHomeUrl =driver.getCurrentUrl();

        Assert.assertTrue(actualHomeUrl.contains(expectHomeUrl));
    }


    @After
    public void closeBrwoser() throws InterruptedException {
        Thread.sleep(2000);
        browser.terminateBrowser();
    }


}
