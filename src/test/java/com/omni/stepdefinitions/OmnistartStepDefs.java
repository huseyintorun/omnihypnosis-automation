package com.omni.stepdefinitions;

import com.omni.pages.OmniLanding;
import com.omni.utilities.ConfigurationReader;
import com.omni.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OmnistartStepDefs {

    OmniLanding omniLanding = new OmniLanding();
    @Given("the user on main page")
    public void the_user_on_main_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
       Thread.sleep(3000);

    }

    @When("the user click on OMNIfinder accepted")
    public void theUserClickOnOMNIfinderAccepted() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 7; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }

        // Press Enter key
        actions.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);
    }

    @And("the user click on AboutOMNI button")
    public void theUserClickOnAboutOMNIButton() throws InterruptedException {
        omniLanding.about_Omni.click();
        Thread.sleep(3000);
    }

    @When("the user clicks on euRecht accepted")
    public void theUserClicksOnEuRechtAccepted() throws InterruptedException {
   // Alert alert = Driver.get().switchTo().alert();
    //alert.accept();
      omniLanding.modul1.click();
      Thread.sleep(3000);
    }

    @And("the user click on OMNI Language toggle to choose german")
    public void theUserClickOnOMNILanguageToggleToChooseGerman() throws InterruptedException {
        omniLanding.language_Toggle.click();
        Thread.sleep(2000);
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
        Thread.sleep(5000);

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


    @And("the user clicks on BEGINNE NOCH HEUTE starten")
    public void theUserClicksOnBEGINNENOCHHEUTEStarten() throws InterruptedException {
        omniLanding.modul1.click();
        Thread.sleep(3000);
    }

    @When("the user clicks on Jetzt Platz in der Schweiz sichern")
    public void theUserClicksOnJetztPlatzInDerSchweizSichern() throws InterruptedException {
        // JavascriptExecutor kullanarak sayfayı az miktar aşağı kaydırma işlemi yapın
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0, 250);");  // 100 piksel aşağı kaydırır
        Thread.sleep(1000);
        omniLanding.modul2.click();
        Thread.sleep(3000);
    }

    @And("the user fills the form")
    public void theUserFillsTheForm() throws InterruptedException {
        WebElement firstName = Driver.get().findElement(By.name("firstName"));
        firstName.sendKeys("John");
        Thread.sleep(1000);

        WebElement lastName = Driver.get().findElement(By.name("lastName"));
        lastName.sendKeys("Doe");
        Thread.sleep(1000);

        WebElement email = Driver.get().findElement(By.name("email"));
        email.sendKeys("john.doe@example.com");
        Thread.sleep(1000);

        // Dropdown (select) elemanını bulun ve seçimi yapın
        Select country = new Select(Driver.get().findElement(By.name("country")));
        country.selectByVisibleText("Germany");
        Thread.sleep(1000);

        WebElement termsConditions = Driver.get().findElement(By.name("termsConditions"));
        termsConditions.click();
        Thread.sleep(1000);

        WebElement address1 = Driver.get().findElement(By.name("address1"));
        address1.sendKeys("123 Main St");
        Thread.sleep(1000);

        WebElement postalCode = Driver.get().findElement(By.name("postalCode"));
        postalCode.sendKeys("12345");
        Thread.sleep(1000);

        WebElement city = Driver.get().findElement(By.name("city"));
        city.sendKeys("Berlin");
        Thread.sleep(1000);

        WebElement vatNumber = Driver.get().findElement(By.name("vatNumber"));
        vatNumber.sendKeys("DE123456789");
        Thread.sleep(1000);

        WebElement businessName = Driver.get().findElement(By.name("businessName"));
        businessName.sendKeys("Doe Enterprises");
        Thread.sleep(1000);

        WebElement phoneNumber = Driver.get().findElement(By.name("phoneNumber"));
        phoneNumber.sendKeys("+491234567890");
        Thread.sleep(1000);
    }
}
