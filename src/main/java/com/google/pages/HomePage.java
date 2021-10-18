package com.google.pages;

import com.google.utils.LANGUAGES;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import static org.testng.Assert.fail;
public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='SIvCob']/a")
    private List<WebElement> allLanguages;

    @FindBy(name = "q")
    private WebElement searchBar;

    public void selectLanguage(LANGUAGES language){
        boolean found=false;
        try {
        for (WebElement element:allLanguages){
            if(element.getText().equals(language.getValue())){
                element.click();
                Thread.sleep(2);
                return;
            }
        }
        fail("No such lan found to change");
        }catch (Exception ignore){

        }
    }
    protected String getValue(String lan){
        switch (LANGUAGES.valueOf(lan)){
            case KANNADA:
                return LANGUAGES.KANNADA.getValue();
            case BENGAL:
                return LANGUAGES.BENGAL.getValue();
            case MARATI:
                return LANGUAGES.MARATI.getValue();
            case HINDI:
                return LANGUAGES.HINDI.getValue();
            case TELUGU:
                return LANGUAGES.TELUGU.getValue();
            default:
                return LANGUAGES.ENGLISH.getValue();
        }
    }
public void googleSearch(String search){
        searchBar.clear();
        searchBar.sendKeys(search, Keys.ENTER);
}
}
