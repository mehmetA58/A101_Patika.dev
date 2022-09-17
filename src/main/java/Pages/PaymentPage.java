package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PaymentPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(PaymentPage.class);

    private static final By AREA_PAYMENTPAGE_ODEME_EKRANI_ =By.xpath("(//div[@class='row']//div[@class='col-sm-9'])[2]");

    private static final By BTN_PAYMENTPAGE_SIPARISI_TAMAMLA =By.xpath("//button[@class='button block green continue-button']//span[@class='order-complete']");

    private static final By TXT_PAYMENTPAGE_SIPARISI_TAMAMLA__ERROR = By.xpath("(//span[@class='error'])[2]");

    public void verify_odeme_ekrani(){
        waitVisibleByLocator(AREA_PAYMENTPAGE_ODEME_EKRANI_);
        Assert.assertTrue(isDisplayElement(AREA_PAYMENTPAGE_ODEME_EKRANI_));

    }
    public void click_To_Siparisi_Tamamla_Button(){
        clickElement(BTN_PAYMENTPAGE_SIPARISI_TAMAMLA);
    }
    public void verify_Navigate_To_Odeme_Page(){
        Assert.assertTrue(isDisplayElement(TXT_PAYMENTPAGE_SIPARISI_TAMAMLA__ERROR));
    }
}
