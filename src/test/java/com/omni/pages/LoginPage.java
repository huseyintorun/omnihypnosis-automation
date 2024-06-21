package com.omni.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "input#user_login")
    public WebElement username ;

    @FindBy(css = "input#user_password")
    public WebElement password ;

    @FindBy(css = ".btn.btn-primary")
    public WebElement submitBase ;
}
