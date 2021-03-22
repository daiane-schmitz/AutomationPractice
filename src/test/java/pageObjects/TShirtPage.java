package pageObjects;

import elementMapper.TShirtPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class TShirtPage extends TShirtPageElementMapper {

    public TShirtPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickProductAddToCart(){
        BasePage.mouseOver(product);
        buttonAddToCart.click();
    }

    public void clickFirstProceedToCheckOut(){
        buttonProceedToCheckOut.click();
    }
}
