package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static ExtentReports.ExtentTestManager.getTest;


public class OrdersCheckoutPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(OrdersCheckoutPage.class);

    private static final By BTN_ORDERCHECKOUTPAGE_UYEOLMADANDEVAMET_BUTTON =By.xpath("(//a[@class='auth__form__proceed js-proceed-to-checkout-btn'])");

    private static final By TXT_ORDERCHECKOUTPAGE_EMAIL_INPUT =By.xpath("//label[normalize-space()='E-mail']");

    private static final By INPUT_ORDERCHECKOUTPAGE_EMAIL =By.xpath("(//input[@name='user_email'])");

    private static final By BTN_ORDERCHECKOUTPAGE_DEVAMET =By.xpath("(//button[@class='button block green'])");



    public void click_To_UYE_OLMADAN_DEVAMET_Button() throws InterruptedException {

        LOGGER.info("User click uye olmadan devam et button in order page");
        getTest().info("User click uye olmadan devam et button in order page");

        clickElement(BTN_ORDERCHECKOUTPAGE_UYEOLMADANDEVAMET_BUTTON);

       // Thread.sleep(3000);
        waitVisibleByLocator(TXT_ORDERCHECKOUTPAGE_EMAIL_INPUT);

        LOGGER.info("User can see email page");
        getTest().info("User verify can see email page");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(getTextElement(TXT_ORDERCHECKOUTPAGE_EMAIL_INPUT).contains("E-mail"));
        softAssert.assertAll("Email sayfasinda oldugunu dogrulanir.");
    }

    public void send_Email(){
        LOGGER.info("User can send email");
        getTest().info("User can send email in email page");

        setTextElement(INPUT_ORDERCHECKOUTPAGE_EMAIL,"test@gmail.com");

        clickElement(BTN_ORDERCHECKOUTPAGE_DEVAMET);

    }


}
