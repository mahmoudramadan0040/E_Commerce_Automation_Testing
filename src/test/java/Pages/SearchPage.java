package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    WebDriver driver ;

    public SearchPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }

    // search box
    @FindBy(xpath = "//*[@id=\"small-searchterms\"]")
    WebElement searchBox_Element;
    // submit search button
    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
    WebElement searchBtn_Element;
    // product item
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div")
    WebElement productItem_Element;

    public void inputKeyword(String keyword){
        searchBox_Element.sendKeys(keyword);

    }
    public void submit(){
        searchBtn_Element.click();
    }
    public String ResultSearch(){
        return productItem_Element.getAttribute("data-productid");
    }


}
