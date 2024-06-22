package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

    WebDriver driver;

    public PIMPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement btn_add_ele;

    @FindBy(xpath = "//input[@placeholder='First Name']")
   public WebElement intput_firstName_ele;

    @FindBy(name = "lastName")
    WebElement input_lastName_ele;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btn_save_ele;

    @FindBy(xpath = "//h6[normalize-space()='Personal Details']")
    public  WebElement text_personalDetails_ele;

    public void clikBtnAdd(){
        btn_add_ele.click();
    }

    public void enterFirstName(String firstName){
        intput_firstName_ele.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        input_lastName_ele.sendKeys(lastName);
    }
    public void clickBtnSave(){
        btn_save_ele.click();
    }

    public  boolean isTextPersonalDetailsEleIsDisplayed(){
       return text_personalDetails_ele.isDisplayed();
    }
}
