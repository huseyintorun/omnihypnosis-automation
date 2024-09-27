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

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Thread.sleep(1000);

    }

    @When("the user clicks on the Cookiebot Alle zulassen button")
    public void theUserClickOnOMNIfinderAccepted() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 11; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }
        Thread.sleep(2000);

        // Press Enter key
        actions.sendKeys(Keys.ENTER).build().perform();


    }

    @And("the user click on About OMNI button")
    public void theUserClickOnAboutOMNIButton() throws InterruptedException {
        Thread.sleep(1000);
        omniLanding.about_Omni.click();
        Thread.sleep(1000);
    }

    @When("the user clicks on euRecht accepted")
    public void theUserClicksOnEuRechtAccepted() throws InterruptedException {
        omniLanding.modul1.click();
        Thread.sleep(1000);
    }

    @And("the user clicks on the OMNI Language toggle to choose German")
    public void theUserClickOnOMNILanguageToggleToChooseGerman() throws InterruptedException {
        omniLanding.language_Toggle.click();
        Thread.sleep(3000);


    }

    @When("the user click on OMNIfinder")
    public void the_user_click_on_OMNIfinder() throws InterruptedException {

        omniLanding.omniFinder.click();
        Thread.sleep(3000);

    }

    @And("the user clicks on BEGINNE NOCH HEUTE button")
    public void theUserClicksOnBEGINNENOCHHEUTEStarten() throws InterruptedException {
        Thread.sleep(3000);
        omniLanding.modul1.click();

    }

    @When("the user clicks on Jetzt Platz in der Schweiz sichern")
    public void theUserClicksOnJetztPlatzInDerSchweizSichern() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        Thread.sleep(3000);
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(100);
        }

        omniLanding.modul2.click();

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
        email.sendKeys("hansschmidtomni+" + faker.numerify("####") + "@gmail.com");
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

    @And("the user clicks on Hast du einen Gutscheincode?")
    public void theUserClickOnApplyCouponButton() throws InterruptedException {
        Thread.sleep(1000);

        omniLanding.applyCoupon.click();
        Thread.sleep(2000);
    }

    @And("the user enters the coupon in the placeholder")
    public void theUserEnterTheCouponInThePlaceHolder() throws InterruptedException {
        Thread.sleep(1000);

        omniLanding.inputCoupon.sendKeys(ConfigurationReader.get("coupon"));
    }

    @And("the user clicks on apply")
    public void theUserClickOnApply() throws InterruptedException {
        Thread.sleep(1000);
        omniLanding.clickApplyCoupon.click();
        Thread.sleep(1000);
    }

    @Then("the user check the total amounth zero")
    public void theUserCheckTheTotalAmounthZero() {
        String expectedResult = "0";
        String actualResult = omniLanding.totalAmounth.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Then("the user click on complete order")
    public void theUserClickOnCompleteOrder() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 11; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }
        Thread.sleep(10000);
        // Press Enter key
        //actions.sendKeys(Keys.ENTER).build().perform();
        omniLanding.checkbox.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(7000);
        //omniLanding.weiter_zur_zahlung.click();
        Assert.assertTrue(Driver.get().getTitle().contains("Thank You"));
        System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("the URL of the website should be correct")
    public void checkTheURLOfWebsiteCorrect() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("https://www.omnihypnosis.com/"));
    }

    @Then("the AboutOMNI page should be confirmed")
    public void userConfirmThatPage() {
        Assert.assertTrue(Driver.get().getTitle().contains("About Omni"));
        System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("the language should change to German")
    public void userCheckThatLanguageChanged() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Driver.get().getTitle().contains("OMNI: Dein Weg zum zertifizierten Hypnosetherapeuten"));
        System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("the Order Process page should open")
    public void theUserChecksThatOrderProcessPageOpens() {
        Assert.assertTrue(Driver.get().getTitle().contains("OMNI Hypnoseausbildung Schweiz: Werde Hypnosetherapeut"));
        System.out.println("Page Title: " + Driver.get().getTitle());
    }

    @Then("the user clicks on complete order and verifies if the order is completed")
    public void theUserClickOnCompleteOrderAndCheckIfOrderCompletedOrNot() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 11; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }
        Thread.sleep(10000);
        // Press Enter key
        //actions.sendKeys(Keys.ENTER).build().perform();
        omniLanding.checkbox.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10000);
        //omniLanding.weiter_zur_zahlung.click();
        Assert.assertTrue(Driver.get().getTitle().contains("Thank You"));
        System.out.println("Page Title: " + Driver.get().getTitle());

    }

    @And("the User choose Deutchland from Hover Over Menu")
    public void theUserChooseDeutchlandFromHoverOverMenu() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(omniLanding.HypnoseAusbildung).perform();
        Thread.sleep(1000);
        omniLanding.Deuschland_hover_over.click();
        Thread.sleep(1000);
    }

    @And("the user clicks on Jetzt Platz in Deutschland sichern")
    public void theUserClicksOnJetztPlatzInDeutschlandSichern() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        Thread.sleep(3000);
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(100);
        }
        // js.executeScript("window.scrollBy(0, 250);");  // 100 piksel aşağı kaydırır
        Thread.sleep(1000);
        omniLanding.Jetzt_platz_sichern_deutschland.click();

    }

    @And("the User choose US from Hover Over Menu")
    public void theUserChooseUSFromHoverOverMenu() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(omniLanding.HypnoseTraining).perform();
        Thread.sleep(1000);
        omniLanding.USA2_hover_over.click();
        Thread.sleep(1000);
    }

    @And("the user clicks on Secure your spot in the US")
    public void theUserClicksOnSecureYourSpotInTheUS() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0, 250);");  // 100 piksel aşağı kaydırır
        Thread.sleep(1000);
        omniLanding.Secure_your_spot_in_the_US.click();
        Thread.sleep(1000);
    }

    @And("the user fills out the form and chooses Switzerland as the country")
    public void theUserFillsTheFormAndChooseSwitzerlandAsCountry() throws InterruptedException {
        Faker faker = new Faker();

        WebElement firstName = Driver.get().findElement(By.name("firstName"));
        firstName.sendKeys(faker.name().firstName());
        Thread.sleep(1000);

        WebElement lastName = Driver.get().findElement(By.name("lastName"));
        lastName.sendKeys(faker.name().lastName());
        Thread.sleep(1000);

        WebElement email = Driver.get().findElement(By.name("email"));
        email.sendKeys("hansschmidtomni+" + faker.numerify("####") + "@gmail.com");
        Thread.sleep(1000);

        Thread.sleep(1000);
        omniLanding.country_select_button.click();

        omniLanding.switzerland.click();

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

    @And("the user fills the form and choose USA as country")
    public void theUserFillsTheFormAndChooseUSAAsCountry() throws InterruptedException {
        Faker faker = new Faker();

        WebElement firstName = Driver.get().findElement(By.name("firstName"));
        firstName.sendKeys(faker.name().firstName());
        Thread.sleep(1000);

        WebElement lastName = Driver.get().findElement(By.name("lastName"));
        lastName.sendKeys(faker.name().lastName());
        Thread.sleep(1000);

        WebElement email = Driver.get().findElement(By.name("email"));
        email.sendKeys("hansschmidtomni+" + faker.numerify("####") + "@gmail.com");
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

    @And("the user chhose live from Hover Over Menu Wieterbildung")
    public void theUserChhoseLiveFromHoverOverMenuWieterbildung() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(omniLanding.ContinuingEducation).perform();
        Thread.sleep(1000);
        omniLanding.Online_courses_button.click();
        Thread.sleep(1000);


    }

    @And("the user choose online coursess from hoverover menu Continuing Education")
    public void theUserChooseOnlineCoursessFromHoveroverMenuContinuingEducation() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(omniLanding.ContinuingEducation).perform();
        Thread.sleep(1000);
        omniLanding.Online_courses_button.click();
        Thread.sleep(1000);
    }

    @And("the user clicks on Hypnokids Certification")
    public void theUserClicksOnHypnokidsCertification() {
        omniLanding.Hypnokids_specialist_certification_online.click();
    }

    @And("the user clicks on the Buynow button")
    public void theUserClicksBuynowButton() throws InterruptedException {
        omniLanding.buy_now_button.click();
        Thread.sleep(2000);
    }

    @And("the user choose Omni Intensive Deutschland")
    public void theUserChooseOmniIntensiveDeutschland() {
        omniLanding.Deuschland_intensiveausbildung.click();
    }


    @And("the user clicks on Hypnokids Specialist Online")
    public void theUserClicksOnHypnokidsSpecialistOnline() {
        omniLanding.Hypnokids_specialist_certification_online.click();

    }

    @And("the user choose Omni Intensive USA training")
    public void theUserChooseOmniIntensiveUSATraining() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        Thread.sleep(3000);
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
            Thread.sleep(100);
        omniLanding.USA_son.click();
    }

    @Then("the user clicks on complete order and verifies if the order is completed in USA")
    public void theUserClicksOnCompleteOrderAndVerifiesIfTheOrderIsCompletedInUSA() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.get());
        // Perform tab key presses
        for (int i = 0; i < 11; i++) {
            actions.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(100);
        }
        Thread.sleep(10000);
        // Press Enter key
        //actions.sendKeys(Keys.ENTER).build().perform();
        omniLanding.checkbox.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10000);
        //omniLanding.weiter_zur_zahlung.click();
     // Assert.assertTrue(Driver.get().getTitle().contains("Thank You"));
     // System.out.println("Page Title: " + Driver.get().getTitle());




    }
}