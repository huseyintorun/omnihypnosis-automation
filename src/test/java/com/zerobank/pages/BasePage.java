package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public WebDriverWait wait ;

    public BasePage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBanking ;

    @FindBy(xpath = "//strong[text()='Home']")
    public WebElement home ;

    @FindBy(xpath = "//strong[text()='Feedback']")
    public WebElement Feedback ;

    @FindBy(css = "button#signin_button")
    public WebElement signin ;
}
