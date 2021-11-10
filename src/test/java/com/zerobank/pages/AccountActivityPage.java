package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivityPage extends BasePage{


    // dropdown locator
    @FindBy(id = "#aa_accountId")
    public WebElement accountDropdown ;

    // 6 Main tabs
    @FindBy(linkText = "Account Summary")
    public WebElement accountSummary ;

    @FindBy(linkText = "Account Activity")
    public WebElement accountActivity ;

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds ;

    @FindBy(linkText = "Pay Bills")
    public WebElement payBills ;

    @FindBy(linkText = "My Money Map")
    public WebElement myMoneyMap ;

    @FindBy(linkText = "Online Statements")
    public WebElement onlineStatements ;

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactions ;




}
