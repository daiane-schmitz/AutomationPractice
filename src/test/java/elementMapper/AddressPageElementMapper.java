package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageElementMapper {

    @FindBy(css = "#address_delivery > li.address_address1.address_address2")
    public WebElement address;

    @FindBy(css = "p > button > span")
    public WebElement buttonProceedToCheckOut;

}
