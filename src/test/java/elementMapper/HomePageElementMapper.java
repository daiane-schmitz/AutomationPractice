package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    public WebElement menuTShirts;

}
