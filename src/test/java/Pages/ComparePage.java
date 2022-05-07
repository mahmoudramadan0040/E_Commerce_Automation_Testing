package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
    private WebDriver driver ;
    public ComparePage(WebDriver Driver){
        this.driver = Driver;
        PageFactory.initElements(driver,this);
    }
    // Electronic category
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    WebElement ElectronicCategory_Element;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")
    WebElement CameraAndPhotoSubCategory_Element;
    // first compare btn
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[2]")
    WebElement CompareBtnOne_Element;
    // second compare btn
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]")
    WebElement CompareBtnSecond_Element;
    // notification msg
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement NotificationMsg_Element;

    // close notification msg
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
    WebElement CloseBtn_Element;

    // product comparison link
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    WebElement ComparisonLink_Element;

    // table of compare list product
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table")
    WebElement CompareTable_Element;

    public void selectCategroy(){
        ElectronicCategory_Element.click();
    }
    public void selectSubCategory(){
        CameraAndPhotoSubCategory_Element.click();
    }
    public void PressCompareBtnOne(){
        CompareBtnOne_Element.click();
    }
    public void PressCompareBtnTwo(){
        CompareBtnSecond_Element.click();
    }
    public String NotificationMsg(){
        return NotificationMsg_Element.getText();
    }
    public void ShowCompareList(){
        ComparisonLink_Element.click();
    }
    public boolean IsCompareProductIsDisplayed(){
        return  CompareTable_Element.isDisplayed();
    }

}
