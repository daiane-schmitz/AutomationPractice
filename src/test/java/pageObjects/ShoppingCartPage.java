package pageObjects;

import elementMapper.ShoppingCartPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShoppingCartPage extends ShoppingCartPageElementMapper {

    public ShoppingCartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductTShirtText(){
        return productTShirt.getText();
    }

    public boolean isProductTShirt(){
        return getProductTShirtText().equals("Faded Short Sleeve T-shirts");
    }

    public void clickSecondProceedToCheckOut(){
        buttonProceedToCheckOut.click();
    }
}
