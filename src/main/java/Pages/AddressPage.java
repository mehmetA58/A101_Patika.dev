package Pages;

import Base.BaseStepMethod;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.time.Duration;

import static ExtentReports.ExtentTestManager.getTest;

public class AddressPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(AddressPage.class);

    private static final By BTN_ADDRESSPAGE_ADRES_OLUSTUR =By.xpath("(//a[@class='new-address js-new-address'])[1]");

    private static final By INPUT_ADDRESSPAGE_ADRES_BASLIGI =By.xpath("//input[@name='title']");
    private static final By INPUT_ADDRESSPAGE_AD =By.xpath("//input[@name='first_name']");
    private static final By INPUT_ADDRESSPAGE_SOYAD =By.xpath("//input[@name='last_name']");
    private static final By INPUT_ADDRESSPAGE_CEP_TEL =By.xpath("//input[@name='phone_number']");
    private static final By SELECT_ADDRESSPAGE_IL =By.xpath("//select[@name='city']");
    private static final By SELECT_ADDRESSPAGE_ILCE =By.xpath("//select[@name='township']");
    private static final By SELECT_ADDRESSPAGE_MAH =By.xpath("//select[@name='district']");
    private static final By INPUT_ADDRESSPAGE_ADRES =By.xpath("//textarea[@class='js-address-textarea']");
    private static final By INPUT_ADDRESSPAGE_POSTA_CODE =By.xpath("//input[@name='postcode']");
    private static final By BTN_ADRESSPAGE_KAYDET_BUTTON =By.xpath("//button[@class='button green js-set-country js-prevent-emoji']");

    private static final By BTN_ADRESSPAGE_KAYDET_DEVAMET =By.xpath("//button[@class='button block green js-proceed-button']");

    private static final By RADIOBTN_ORDERCHECKOUTPAGE_KARGO =By.xpath("(//div[@class='cargo-list']//ul//li//label)[1]");

    public void click_To_adres_olustur(){
        LOGGER.info("User click yeni adres olustur butonuna");
        getTest().info("User click yeni adres olustur butonuna in Addres Page");

        clickElement(BTN_ADDRESSPAGE_ADRES_OLUSTUR);
    }
    public void set_To_Text_adress() throws InterruptedException {
        LOGGER.info("User  yeni adres olustur inputlarinin doldurur");
        getTest().info("User yeni adres olustur inputlarinin doldurur in Addres Page");

        Faker faker=new Faker();


        setTextElement(INPUT_ADDRESSPAGE_ADRES_BASLIGI,"Evim");
        setTextElement(INPUT_ADDRESSPAGE_AD,faker.name().firstName().toLowerCase());
        setTextElement(INPUT_ADDRESSPAGE_SOYAD,faker.name().lastName().toLowerCase());
        setTextElement(INPUT_ADDRESSPAGE_CEP_TEL,faker.phoneNumber().cellPhone());
        selectElementVisibleText(SELECT_ADDRESSPAGE_IL,"İSTANBUL");
        selectElementVisibleText(SELECT_ADDRESSPAGE_ILCE,"ÇATALCA");
        waitFor(2);
        selectElementVisibleText(SELECT_ADDRESSPAGE_MAH,"KALEİÇİ MAH");


        setTextElement(INPUT_ADDRESSPAGE_ADRES,faker.address().fullAddress());
        setTextElement(INPUT_ADDRESSPAGE_POSTA_CODE,faker.address().zipCode());

        clickElement(BTN_ADRESSPAGE_KAYDET_BUTTON);
        SoftAssert sf =new SoftAssert();
        sf.assertTrue(isDisplayElement(BTN_ADRESSPAGE_KAYDET_DEVAMET));
        sf.assertAll("Adres basarili olarak olusturulamadi");

        waitFor(2);
        clickElement(RADIOBTN_ORDERCHECKOUTPAGE_KARGO);
    }
    public void click_Kaydet_Devamet_button(){
        clickElement(BTN_ADRESSPAGE_KAYDET_DEVAMET);
    }
}
