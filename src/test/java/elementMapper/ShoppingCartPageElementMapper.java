package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPageElementMapper {

    @FindBy(css = "td.cart_description > p")
    public WebElement productTShirt;

    @FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium > span")
    public WebElement buttonProceedToCheckOut;
}
