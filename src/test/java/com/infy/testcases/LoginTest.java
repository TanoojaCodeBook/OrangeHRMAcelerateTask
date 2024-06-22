package com.infy.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    LoginPage lp;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp=new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void testLoginFunctionality(){
        lp.enterUserName("Admin");
        lp.enterPassword("admin123");
        lp.clickBtnLogin();
        WebElement text_dashboard_ele=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='Dashboard']")));
        Assert.assertEquals(text_dashboard_ele.getText(),"Dashboard","Login Failed");
    }
}
