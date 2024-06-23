package com.omni.stepdefinitions;

import com.omni.pages.OmniLanding;
import com.omni.utilities.ConfigurationReader;
import com.omni.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class OmnistartStepDefs {

    OmniLanding omniLanding = new OmniLanding();
    @Given("the user on main page")
    public void the_user_on_main_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
       Thread.sleep(5000);




    }
    @When("the user click on OMNIfinder accepted")
    public void theUserClickOnOMNIfinderAccepted() throws InterruptedException {
        omniLanding.omni_Finder.click();
        Thread.sleep(5000);
    }

    @And("the user click on AboutOMNI button")
    public void theUserClickOnAboutOMNIButton() throws InterruptedException {
        omniLanding.about_Omni.click();
        Thread.sleep(5000);
    }

    @When("the user clicks on euRecht accepted")
    public void theUserClicksOnEuRechtAccepted() throws InterruptedException {
   // Alert alert = Driver.get().switchTo().alert();
    //alert.accept();
      omniLanding.modul1.click();
      Thread.sleep(5000);
    }

    @And("the user click on OMNI Language toggle to choose german")
    public void theUserClickOnOMNILanguageToggleToChooseGerman() throws InterruptedException {
        omniLanding.language_Toggle.click();
        Thread.sleep(5000);
    }

    @When("the user click on Ausbildung")
    public void the_user_click_on_Ausbildung() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user on Ausbildung")
    public void the_user_on_Ausbildung() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on Weiterbildung")
    public void the_user_click_on_Weiterbildung() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user on Weiterbildung")
    public void the_user_on_Weiterbildung() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on OMNIfinder")
    public void the_user_click_on_OMNIfinder() throws InterruptedException {

        omniLanding.omniFinder.click();
        // 20 saniye (20000 milisaniye) uyku
        Thread.sleep(10000);

    }


    @Then("The user on OMNIfinder")
    public void the_user_on_OMNIfinder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on Uber OMNI")
    public void the_user_click_on_Uber_OMNI() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user on Uber OMNI")
    public void the_user_on_Uber_OMNI() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on Sign In")
    public void the_user_click_on_Sign_In() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user on Sign In")
    public void the_user_on_Sign_In() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user click on OMNI Hypnotisor_Modul1")
    public void the_user_click_on_OMNI_Hypnotisor_Modul1() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on jetzt Onlineausbildung starten")
    public void the_user_click_on_jetzt_Onlineausbildung_starten() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user fills the form")
    public void user_fills_the_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on Debit- oder Kreditkarte")
    public void user_clicks_on_Debit_oder_Kreditkarte() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user checks the paypal")
    public void user_checks_the_paypal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
