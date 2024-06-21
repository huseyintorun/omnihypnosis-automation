package com.omni.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmniLanding extends BasePage{
    WebDriverWait wait ;

    @FindBy(xpath = "//a[@href='https://www.omnihypnosis.com/pages/omni-finder']")
    public WebElement omniFinder ;

    @FindBy(css=("button[data-testid='uc-accept-all-button']"))
    public WebElement acceptall ;

}
