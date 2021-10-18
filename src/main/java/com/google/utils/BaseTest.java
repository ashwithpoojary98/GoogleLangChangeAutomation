package com.google.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver(){
        return this.driver;
    }
    @BeforeSuite(alwaysRun = true)
    public void setBrowser(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if(driver!=null){
            driver.close();
        }
    }
    public WebDriverWait explicitWait(){
        return new WebDriverWait(driver,30);
    }
}
