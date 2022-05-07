package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagPage {
    private WebDriver driver ;
    public TagPage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // computer category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement computerCategory_Element;

    // game tag is the popular tag
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/ul/li[10]/a")
    WebElement GameTag_Element;

    // computer tag is the popular tag
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/ul/li[7]/a")
    WebElement ComputerTag_Element;

    // all tags
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div[3]/div[2]/div[2]/a")

    WebElement allTags_Element;

    // Computer item product
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div")
    WebElement ComputerProduct_Element;
    // Game item product
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div")
    WebElement GameProduct_Element;

    public void selectCategory(){
        computerCategory_Element.click();
    }
    public void SelectGameTag(){
        GameTag_Element.click();
    }
    public void SelectComputerTag(){
        ComputerTag_Element.click();
    }
    public boolean ComputerProductShow(){
        return ComputerProduct_Element.isDisplayed();
    }
    public boolean GameProductShow(){
        return GameProduct_Element.isDisplayed();
    }
    public void showTags(){
        allTags_Element.click();
    }
}
