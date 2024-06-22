package com.infy.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PIMPage;
import pageObjects.SidePanelPage;

public class AddEmployeeTest extends TestBase {
    SidePanelPage sidePanelPage;
    PIMPage pimPage;


    @Test(priority = 1)
    public void testAddEmployeeFunctionality(){
        pimPage= new PIMPage(driver);
        sidePanelPage=new SidePanelPage(driver);

        sidePanelPage.clickPIMLink();
        wait.until(ExpectedConditions.visibilityOf(pimPage.btn_add_ele));
        pimPage.clikBtnAdd();
        wait.until(ExpectedConditions.visibilityOf(pimPage.intput_firstName_ele));
        pimPage.enterFirstName("Sai");
        pimPage.enterLastName("Mani");
        pimPage.clickBtnSave();
        wait.until(ExpectedConditions.visibilityOf(pimPage.text_personalDetails_ele));
        Assert.assertTrue(pimPage.isTextPersonalDetailsEleIsDisplayed(),"Adding Employee failed");

    }
}
