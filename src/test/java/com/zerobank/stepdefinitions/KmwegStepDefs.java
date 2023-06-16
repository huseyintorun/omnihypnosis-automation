package com.zerobank.stepdefinitions;

import com.zerobank.pages.Kmweg;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KmwegStepDefs {

    Kmweg kmweg = new Kmweg();
    @Given("the user on main page")
    public void the_user_on_main_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user click on Das SystemHaus")
    public void the_user_click_on_Das_SystemHaus() {

       kmweg.systemHaus.click();
    }
    @Then("the user landed on the main page clearly")
    public void the_user_landed_on_the_main_page_clearly() {

    }
    @Given("test and try")
    public void test_and_try() {

    }
    @Then("test day {string}")
    public void test_day(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
