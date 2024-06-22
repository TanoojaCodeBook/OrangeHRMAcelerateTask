package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidePanelPage {
    WebDriver driver;

    public SidePanelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement link_PIM_ele;

    public void clickPIMLink(){
        link_PIM_ele.click();
    }
}
