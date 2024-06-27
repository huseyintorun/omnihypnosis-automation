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

    @FindBy(css = "a[href='https://www.omnihypnosis.com/pages/omni-finder']")
    public WebElement omni_Finder;

    @FindBy(css = "a[href='/pages/about-omni']")
    public WebElement about_Omni;
    @FindBy(css = "label[for='language-toggle']")
    public WebElement language_Toggle;

    @FindBy(xpath = "//a[normalize-space()='BEGINNE NOCH HEUTE']")
    public WebElement modul1;

    @FindBy(xpath = "//a[normalize-space()='Jetzt Platz in der Schweiz sichern!']")
    public WebElement modul2;







}
