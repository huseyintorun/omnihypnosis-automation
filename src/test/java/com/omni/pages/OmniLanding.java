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
    @FindBy(xpath = "//img[@src='https://import.cdn.thinkific.com/875575%2Fcustom_site_themes%2Fid%2FJai90SekR3mzJcZqhJuz_Modul%201-%20OMNI%20Hypnotiseur.jpg'] [1]")
    public WebElement modul1;
    @FindBy(css = "a[href='https://www.omnihypnosis.com/pages/omni-finder']")
    public WebElement omni_Finder;



}
