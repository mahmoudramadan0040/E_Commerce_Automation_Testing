package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FilterPage {
    private WebDriver driver ;
    public FilterPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }

    // Approval category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    WebElement ApprovalCategory_Element;
    // sub category of Approval -> shoes
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")
    WebElement ShoseCategory_Element;

    // filter by color Grey element
    @FindBy(xpath = "//*[@id=\"attribute-option-14\"]")
    WebElement Grey_Element;
    // filter by color Red element
    @FindBy(xpath = "//*[@id=\"attribute-option-15\"]")
    WebElement Red_Element;

    // Red Product item
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div")
    WebElement RedProduct;
    // Grey Product item
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div")
    WebElement GreyProduct;

    public void PressApprovalCategory(){
        ApprovalCategory_Element.click();
    }
    public void PressShoesSubCategory(){
        ShoseCategory_Element.click();
    }
    public void FilterUsingGreyColor(){
        Grey_Element.click();
    }
    public void FilterUsingRedColor(){
        Red_Element.click();
    }
    public boolean RedProductItemResult(){
        return RedProduct.isDisplayed();
    }
    public boolean GreyProductItemResult(){
        return Grey_Element.isDisplayed();
    }


}
