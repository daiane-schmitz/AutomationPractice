package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TShirtPageElementMapper {

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default > span")
    public WebElement buttonAddToCart;

    @FindBy(css = ".product-container")
    public WebElement product;

    @FindBy(css = ".button-container a[title='Proceed to checkout'")
    public WebElement buttonProceedToCheckOut;
}
