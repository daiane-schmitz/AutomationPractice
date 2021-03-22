package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageElementMapper {

    @FindBy(id = "email_create")
    public WebElement boxEmail;

    @FindBy(id = "SubmitCreate")
    public WebElement buttonCreateAnAccount;

}
