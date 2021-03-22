package pageObjects;

import elementMapper.AddressPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddressPage extends AddressPageElementMapper {

    public AddressPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getAddressText(){
        return address.getText();
    }

    public boolean isAddressCorrect(){
        return getAddressText().equals("Endereço teste continuação");
    }

    public void clickThirdProceedToCheckOut(){
        buttonProceedToCheckOut.click();
    }
}
