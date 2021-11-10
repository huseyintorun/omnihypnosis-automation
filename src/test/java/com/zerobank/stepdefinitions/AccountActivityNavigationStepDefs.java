package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefs {
    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        //Polymorphism implemented
        BasePage basePage = new LoginPage();
        basePage.signin.click();

        ((LoginPage)basePage).username.sendKeys(ConfigurationReader.get("username"));
        ((LoginPage)basePage).password.sendKeys(ConfigurationReader.get("password"));
        ((LoginPage)basePage).submitBase.click();


    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String accountType) throws InterruptedException {
            AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        switch (accountType) {
            case  "Savings" :
            accountSummaryPage.savings.click();
            break;
            case  "Brokerage" :
            accountSummaryPage.brokerage.click();
            break;
            case "Checking" :
            accountSummaryPage.checking.click();
            break;
            case "Credit Card" :
            accountSummaryPage.creditCard.click();
            break;
            case "Loan" :
            accountSummaryPage.loan.click();
            break;
        }


    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
    String expectedPage = "Zero - Account Activity";
       String actualPage =  Driver.get().getTitle();
        Assert.assertEquals(expectedPage,actualPage);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String accountType) {

        AccountActivityPage accountActivityPage = new AccountActivityPage();
        String actual;
        switch (accountType) {
            case  "Savings" :
                actual = accountActivityPage.accountDropdown.getText();
                Assert.assertEquals("Savings",actual);
                break;
            case  "Brokerage" :
                actual = accountActivityPage.accountDropdown.getText();
                Assert.assertEquals("Brokerage",actual);
                break;
            case "Checking" :
                actual = accountActivityPage.accountDropdown.getText();
                Assert.assertEquals(accountType,actual);
                break;
            case "Credit Card" :
                actual = accountActivityPage.accountDropdown.getText();
                Assert.assertEquals("Checking",actual);
                break;
            case "Loan" :
                actual = accountActivityPage.accountDropdown.getText();
                Assert.assertEquals("Loan",actual);
                break;
        }

    }


}
