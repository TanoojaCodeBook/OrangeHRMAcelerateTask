package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement input_userName_ele;

    @FindBy(name = "password")
    WebElement input_password_ele;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btn_login_ele;

    public void enterUserName(String userName){
        input_userName_ele.sendKeys(userName);
    }

    public void enterPassword(String password){
        input_password_ele.sendKeys(password);
    }

    public void clickBtnLogin(){
        btn_login_ele.click();
    }

    public void login(String userName, String password){
        enterUserName(userName);
        enterPassword(password);
        clickBtnLogin();
    }

}
