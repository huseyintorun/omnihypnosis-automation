package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class AccountActivityNavigationStepDefs {
    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BasePage basePage = new LoginPage();
        basePage.signin.click();

        ((LoginPage)basePage).username.sendKeys(ConfigurationReader.get("username"));
        ((LoginPage)basePage).password.sendKeys(ConfigurationReader.get("password"));
        ((LoginPage)basePage).submitBase.click();

    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String string) {

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {

    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

    }
}
