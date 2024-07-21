package com.omni.stepdefinitions;

import com.github.javafaker.Faker;
import com.omni.pages.OmniLanding;
import com.omni.utilities.ConfigurationReader;
import com.omni.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

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
      omniLanding.modul1.click();
      Thread.sleep(3000);
    }

    @And("the user click on OMNI Language toggle to choose german")
    public void theUserClickOnOMNILanguageToggleToChooseGerman() throws InterruptedException {
        omniLanding.language_Toggle.click();
        Thread.sleep(2000);
    }

    @When("the user click on OMNIfinder")
    public void the_user_click_on_OMNIfinder() throws InterruptedException {

        omniLanding.omniFinder.click();
        Thread.sleep(5000);

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
        Faker faker = new Faker();

        WebElement firstName = Driver.get().findElement(By.name("firstName"));
        firstName.sendKeys(faker.name().firstName());
        Thread.sleep(1000);

        WebElement lastName = Driver.get().findElement(By.name("lastName"));
        lastName.sendKeys(faker.name().lastName());
        Thread.sleep(1000);

        WebElement email = Driver.get().findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());
        Thread.sleep(1000);

        // Dropdown (select) elemanını bulun ve seçimi yapın
        // Select country = new Select(Driver.get().findElement(By.name("country")));
        // country.selectByVisibleText(faker.address().country());
        // Thread.sleep(1000);

      //  WebElement termsConditions = Driver.get().findElement(By.cssSelector("input[class='terms css-u2k63x']"));
      //  termsConditions.click();
        Thread.sleep(1000);

        WebElement address1 = Driver.get().findElement(By.name("address1"));
        address1.sendKeys(faker.address().streetAddress());
        Thread.sleep(1000);

        WebElement postalCode = Driver.get().findElement(By.name("postalCode"));
        postalCode.sendKeys(faker.address().zipCode());
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0, 50);");  // 100 piksel aşağı kaydırır

        WebElement city = Driver.get().findElement(By.name("city"));
        city.sendKeys(faker.address().city());
        Thread.sleep(1000);

        WebElement vatNumber = Driver.get().findElement(By.name("vatNumber"));
        vatNumber.sendKeys(faker.number().digits(9));
        Thread.sleep(1000);

        js.executeScript("window.scrollBy(0, 50);");  // 100 piksel aşağı kaydırır

        WebElement businessName = Driver.get().findElement(By.name("businessName"));
        businessName.sendKeys(faker.company().name());
        Thread.sleep(1000);

        WebElement phoneNumber = Driver.get().findElement(By.name("phoneNumber"));
        phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
        Thread.sleep(1000);
    }

    @And("the user click on apply coupon button")
    public void theUserClickOnApplyCouponButton() throws InterruptedException {

        omniLanding.applyCoupon.click();
        Thread.sleep(4000);
    }

    @And("the user enter the coupon in the place holder")
    public void theUserEnterTheCouponInThePlaceHolder() {

        omniLanding.inputCoupon.sendKeys("omni120free");
    }

    @And("the user click on apply")
    public void theUserClickOnApply() throws InterruptedException {
        omniLanding.clickApplyCoupon.click();
        Thread.sleep(1000);
    }

    @Then("the user check the total amounth zero")
    public void theUserCheckTheTotalAmounthZero() {
        String expectedResult= "0";
        String actualResult = omniLanding.totalAmounth.getText();
        Assert.assertEquals(expectedResult,actualResult);

    }

    @Then("the user click on complete order")
    public void theUserClickOnCompleteOrder() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 13; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }

        // Press Enter key
        actions.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);

    }

    @Then("check the URL of website correct")
    public void checkTheURLOfWebsiteCorrect() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("https://www.omnihypnosis.com/"));
    }

    @Then("User confirm that Page")
    public void userConfirmThatPage() {
        Assert.assertTrue(Driver.get().getTitle().contains("About Omni"));
        System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("user check that Lamguage changed")
    public void userCheckThatLamguageChanged() {
            Assert.assertTrue(Driver.get().getTitle().contains("OMNI: Dein Weg zum zertifizierten Hypnosetherapeuten"));
            System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("the user checks that Order Process page opens")
    public void theUserChecksThatOrderProcessPageOpens() {
        Assert.assertTrue(Driver.get().getTitle().contains("OMNI Hypnoseausbildung Schweiz: Werde Hypnosetherapeut"));
        System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("the user click on complete order and check if order completed or not")
    public void theUserClickOnCompleteOrderAndCheckIfOrderCompletedOrNot() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 13; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }

        // Press Enter key
        actions.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);

        // Get the current window handle
        String originalWindow = Driver.get().getWindowHandle();

        // Wait for the new window or tab
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Get all window handles
        Set<String> windowHandles = Driver.get().getWindowHandles();

        // Check if a new window has opened
        if (windowHandles.size() > 1) {
            System.out.println("New window opened!");

            // Switch to the new window
            for (String windowHandle : windowHandles) {
                if (!windowHandle.equals(originalWindow)) {
                    Driver.get().switchTo().window(windowHandle);
                    break;
                }

            }
        }
    }
    }