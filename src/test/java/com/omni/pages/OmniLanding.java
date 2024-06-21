package com.omni.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OmniLanding extends BasePage{

    @FindBy(xpath = "(//a[@href='/ueber-uns/systemhaus/'])[2]")
    public WebElement systemHaus ;
}
