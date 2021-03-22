package pageObjects;

import elementMapper.SignInPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SignInPage extends SignInPageElementMapper {

    public SignInPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillBoxEmail(){
        boxEmail.sendKeys("emailteste9@gmail.com");
    }

    public void clickButtonCreateAnAccount(){
        buttonCreateAnAccount.click();
    }
}
