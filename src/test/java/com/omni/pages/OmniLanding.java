package com.omni.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OmniLanding extends BasePage{
    @FindBy(xpath = "(//a[@class=\"custom-link\"])[5]")
            public WebElement ContinuingEducation;

    @FindBy(xpath = "//a[@class='button button-primary w-100']")
          public WebElement buy_now_button;

 // @FindBy(xpath = "//div[@data-href='/courses/hypnokids-specialist-certification-online']//a[@class='post__img']")
   //       public WebElement Hypnokids_specialist_certification_online;
  @FindBy(xpath = "//a[contains(@href, \"hypnokids-specialist-certification-online\")]\n")
  public WebElement Hypnokids_specialist_certification_online;

    @FindBy(xpath = "//a[@href=\"/courses/hypnokids-specialist-zertifizierung-online\"]")
    public WebElement Hypnokids_Online2;





    @FindBy(xpath = "//a[@href='https://www.omnihypnosis.com/pages/omni-finder']")
    public WebElement omniFinder ;

    @FindBy(css = "a[href='https://www.omnihypnosis.com/pages/omni-finder']")
    public WebElement omni_Finder;

    @FindBy(css = "a[href='/pages/about-omni']")
    public WebElement about_Omni;
    @FindBy(css = "label[for='language-toggle']")
    public WebElement language_Toggle;

    @FindBy(xpath = "//a[normalize-space()='BEGINNE NOCH HEUTE']")
    public WebElement modul1;

    @FindBy(xpath = "//a[normalize-space()='Jetzt Platz in der Schweiz sichern!']")
    public WebElement modul2;

    @FindBy(css = "a[class = 'css-1evxrgn']")
    public WebElement applyCoupon;

    @FindBy(css = "input[name='coupon']")
    public WebElement inputCoupon;

    @FindBy(css = "button[class='css-1gz0dur']")
    public WebElement clickApplyCoupon;

    @FindBy(xpath = "(//span[@class='css-dc3ov7'])[2]")
    public WebElement totalAmounth;

    @FindBy(css = "input[class='terms css-u2k63x']")
    public WebElement clickInput;

    @FindBy(css = "button[class='css-1d94e3n']")
    public WebElement completeOrder;

    @FindBy(xpath = "(//a[@class=\"custom-link\"])[1]")
    public WebElement HypnoseAusbildung;

    ////a[normalize-space()='Hypnosis Training']
    //@FindBy(xpath = "(//a[@class=\"custom-link\"])[3]")
   // public WebElement Hypnose_Training;

    @FindBy(xpath = "//a[text()=\"Live in 8 Tagen\"]")
    public WebElement Deuschland_hover_over;

    @FindBy(xpath = "//a[text()=\"Live in 8 days\"]")
    public WebElement USA2_hover_over;
  @FindBy(xpath = "//a[@href=\"/courses/omni-hypnosetherapeut-zertifizierung-intensiv-live-deutschland-oesterreich\"]")
  public WebElement Deuschland_intensiveausbildung;

  @FindBy(xpath = "//a[@href=\"https://www.omnihypnosis.com/pages/continuing-education-online\"]")
  public WebElement Online_Courses;


  @FindBy(xpath = "//a[@href='/courses/omni-hypnotherapist-certification-intensive-live-usa']")
  public WebElement USA_son;

    @FindBy(xpath = "//a[text()=('Jetzt Platz in Deutschland sichern!')]")
    public WebElement Jetzt_platz_sichern_deutschland;

    @FindBy(xpath = "//a[text()=('Secure your spot in the US')]")
    public WebElement Secure_your_spot_in_the_US;

    @FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
    public WebElement checkbox;

    ////span[normalize-space()='Switzerland']

    @FindBy(xpath = "//span[normalize-space()='Switzerland']")
    public WebElement switzerland;


    ////button[@id='headlessui-listbox-button-:r4:']
    @FindBy (xpath = "//button[@id='headlessui-listbox-button-:r4:']")
    public WebElement country_select_button;

    ////span[normalize-space()='United States']

    @FindBy(xpath = "//span[normalize-space()='United States']")
    public WebElement united_states;

    @FindBy(xpath = "//a[text()=\"Online Courses\"]")
    public WebElement Online_courses_button;


////button[text()="Weiter zur Zahlung ➜"]
 //   @FindBy(xpath = "//button[text()='Weiter zur Zahlung ��']")
   // public WebElement omweiter_zur_zahlung;

  @FindBy(xpath = "(//a[@class=\"custom-link\"])[4]")
  public WebElement HypnoseTraining;













}
