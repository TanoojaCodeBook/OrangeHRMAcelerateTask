package com.infy.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LoginPage;

import java.time.Duration;

public class TestBase {

    WebDriver driver;
    WebDriverWait wait;
    LoginPage lp;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        lp=new LoginPage(driver);
        lp.login("Admin","admin123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='Dashboard']")));
        System.out.println("tanu");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
