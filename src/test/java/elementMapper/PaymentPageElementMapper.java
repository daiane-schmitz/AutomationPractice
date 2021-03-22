package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageElementMapper{

    @FindBy(id = "total_price")
    public WebElement totalPrice;

    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
    public WebElement payByCheck;

    @FindBy(css = "#cart_navigation > button > span")
    public WebElement buttonIConfirmMyOrder;

    @FindBy(css = "#center_column > p.alert.alert-success")
    public WebElement alertSuccess;
}
