package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

import static ExtentReports.ExtentTestManager.getTest;

public class PaymentPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(PaymentPage.class);

    private static final By AREA_PAYMENTPAGE_ODEME_EKRANI_ =By.xpath("(//div[@class='row']//div[@class='col-sm-9'])[2]");

    private static final By BTN_PAYMENTPAGE_SIPARISI_TAMAMLA =By.xpath("//button[@class='button block green continue-button']//span[@class='order-complete']");

    private static final By TXT_PAYMENTPAGE_SIPARISI_TAMAMLA__ERROR = By.xpath("(//span[@class='error'])[2]");

    private static final By BTN_PAYMENTPAGE_GARANTI_PAY =By.xpath("//div[@class='payment-tab payment-tab-gpay js-payment-tab ']");

    private static final By INPUT_PAYMENTPAGE_GARANTI_PAY_SozAgreemnt =By.xpath("//div[@class='content js-gpay-content']//label[@class='checkout__contract']//div//input[@type='checkbox']");

    private static final By BTN_PAYMENTPAGE_GARANTI_PAY_ODEMEYAPBUTTON =By.xpath("//a[@class='button green js-gpay-payment']");

    private static final By TXT_PAYMENTPAGE_GARANTI_TITLE =By.xpath("//div[@id='logo_gpay']");

    public void verify_odeme_ekrani(){
        LOGGER.info("User  ödeme ekranını gördüğünü doğrular");
        getTest().info("User  ödeme ekranını gördüğünü doğrular Payment Page de");
        waitVisibleByLocator(AREA_PAYMENTPAGE_ODEME_EKRANI_);
        Assert.assertTrue(isDisplayElement(AREA_PAYMENTPAGE_ODEME_EKRANI_));

    }
    public void click_To_Siparisi_Tamamla_Button(){
        LOGGER.info("User siparişi tamamla butonuna tiklar");
        getTest().info("User siparişi tamamla butonuna tiklar Payment Page de");
        clickElement(BTN_PAYMENTPAGE_SIPARISI_TAMAMLA);
    }
    public void verify_Navigate_To_Odeme_Page(){
        LOGGER.info("User siparişi tamamla butonuna tikladiginda kart bilgileri doldurulmadan ilerleyemedigini dogrular");
        getTest().info("User siparişi tamamla butonuna tikladiginda kart bilgileri doldurulmadan ilerleyemedigini dogrular Payment Page de");
        Assert.assertTrue(isDisplayElement(TXT_PAYMENTPAGE_SIPARISI_TAMAMLA__ERROR));
    }
    public void click_To_GARANTIPAY_Button(){
        LOGGER.info("User odeme yapmak icin GARANTİ PAY i secer");
        getTest().info("User odeme yapmak icin GARANTİ PAY i secer Payment Page de");
        clickElement(BTN_PAYMENTPAGE_GARANTI_PAY);
    }

    public void navigate_To_GARANTIPAY_Odeme_Ekrani(){
        LOGGER.info("User GARANTİ PAY sozlesmeyi kabul et radio buttona tiklar");
        getTest().info("User GARANTİ PAY sozlesmeyi kabul et radio buttona tiklar payment page de");

        clickElement(INPUT_PAYMENTPAGE_GARANTI_PAY_SozAgreemnt);

        LOGGER.info("User GARANTİ PAY odeme yap buttona tiklar");
        getTest().info("User GARANTİ PAY odeme yap buttona tiklar payment page de");
        clickElement(BTN_PAYMENTPAGE_GARANTI_PAY_ODEMEYAPBUTTON);

    }

    public void verify_To_GARANTIPAY_Odeme_Ekrani(){
        LOGGER.info("User GARANTİ PAY odeme ekraninin göruldugunu dogrular");
        getTest().info("User GARANTİ PAY odeme ekraninin goruldugunu dogrular Payment Page de");
        waitForPageToLoad(Duration.ofSeconds(5));
        Assert.assertTrue(isDisplayElement(TXT_PAYMENTPAGE_GARANTI_TITLE));

    }
}
