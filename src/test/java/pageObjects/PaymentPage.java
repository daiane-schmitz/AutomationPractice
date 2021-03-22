package pageObjects;

import elementMapper.PaymentPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPage extends PaymentPageElementMapper {

    public PaymentPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public boolean isTotalPriceCorrect(){
        return getTotalPrice().equals("$18.51");
    }

    public void clickPayByCheck(){
        payByCheck.click();
    }

    public void clickButtonConfirmOrder(){
        buttonIConfirmMyOrder.click();
    }

    public String getAlertSuccess(){
        return alertSuccess.getText();
    }

    public boolean isAlertSuccess(){
        return getAlertSuccess().contains("Your order on My Store is complete");
    }
}
