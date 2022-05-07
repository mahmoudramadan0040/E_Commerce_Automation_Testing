package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class RegisterPage {
    WebDriver driver = null ;

    public RegisterPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // gender male
    @FindBy(xpath = "//*[@id=\"gender-male\"]")
    WebElement genderMale_Element;
    // gender female
    @FindBy(xpath = "//*[@id=\"gender-female\"]")
    WebElement genderFemale_Element;
    // First Name
    @FindBy(xpath ="//*[@id=\"FirstName\"]" )
    WebElement firstName_Element;
    // Last Name
    @FindBy(xpath ="//*[@id=\"LastName\"]" )
    WebElement lastName_Element;
    // Day Date
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]" )
    WebElement day_Element;
    // month Date
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]" )
    WebElement month_Element;
    // year Date
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]" )
    WebElement year_Element;
    // Email
    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email_Element;
    // company name
    @FindBy(xpath = "//*[@id=\"Company\"]")
    WebElement company_Element;
    // password
    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement password_Element;
    // confirm password
    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    WebElement confirm_password_Element;
    @FindBy(xpath = "//*[@id=\"register-button\"]")
    WebElement register_Element;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    WebElement successMsg_Element;




    public void InputFields(String day ,String month ,String year,String firstName ,String lastName,
                            String Email ,String password ,String company_name ){
        // select the gender
        genderMale_Element.click();
        // enter first name
        firstName_Element.clear();
        firstName_Element.sendKeys(firstName);
        // enter last name
        lastName_Element.clear();
        lastName_Element.sendKeys(lastName);
        // select the date(day - month - year)
        Select Day = new Select(day_Element);
        Day.selectByVisibleText(day);
        Select Month= new Select(month_Element);
        Month.selectByVisibleText(month);
        Select Year = new Select(year_Element);
        Year.selectByVisibleText(year);

        // enter email
        email_Element.clear();
        email_Element.sendKeys(Email);
        // enter password
        password_Element.clear();
        password_Element.sendKeys(password);
        // enter confirm password
        confirm_password_Element.clear();
        confirm_password_Element.sendKeys(password);
        // enter company name
        company_Element.clear();
        company_Element.sendKeys(company_name);

    }

    public void Rregister(){
        register_Element.click();
    }
    public String SuccessRegister(){
        return successMsg_Element.getText();
    }
    public void exit(){
        driver.quit();
    }


}
