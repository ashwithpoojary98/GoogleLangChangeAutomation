package com.google.script;

import com.google.pages.HomePage;
import com.google.utils.BaseTest;
import com.google.utils.LANGUAGES;
import org.testng.annotations.Test;

public class GoogleLangTest extends BaseTest {

    @Test(description = "Verify the language change",groups = {"validSearch"})
    public void changeLanTest(){
        HomePage homePage=new HomePage(getDriver());
        homePage.selectLanguage(LANGUAGES.KANNADA);
        homePage.googleSearch("Hai");
    }
    @Test(description = "Verify the language change",groups = {"invalidSearch"})
    public void changeLanInvalidTest(){
        HomePage homePage=new HomePage(getDriver());
        homePage.selectLanguage(LANGUAGES.INVALID);
        homePage.googleSearch("Hai");
    }
}
