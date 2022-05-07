package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CategoryPage {
    private WebDriver driver ;
    public CategoryPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // category not have sub category like
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[5]/a")
    WebElement CategoryOne_Element;
    // category like computer catgory
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement CategoryTwo_Element;
    // sub category like desktop sub category
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")
    WebElement SubCategory_Element;

    // product item
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div")
    WebElement product_items;

    public void selectMainCategory(){
        CategoryTwo_Element.click();
    }
    public  void selectSubCategory(){
        SubCategory_Element.click();
    }
    public void selectCategory(){
        CategoryOne_Element.click();

    }
    public boolean productItemsDisplay(){
        return product_items.isDisplayed();
    }
}
