package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

@Feature("Testes site de ecommerce")
public class SetupTest extends BaseTests {

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage() {
        //Verificar se estou na página
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));

    }

    @Test
    @Story("Entrar na categoria T-Shirts, escolher produto e ir para o check out")
    public void testClickTShirtsAndAddToCart() {
        HomePage home = new HomePage();
        TShirtPage tShirt = new TShirtPage();
        ShoppingCartPage shoppingCart = new ShoppingCartPage();

        testOpeningBrowserAndLoadingPage();

        home.clickCategoryTShirts();
        tShirt.clickProductAddToCart();
        tShirt.clickFirstProceedToCheckOut();
        assertTrue(shoppingCart.isProductTShirt());
        shoppingCart.clickSecondProceedToCheckOut();
    }

    @Test
    @Story("Criar conta par finalizar compra")
    public void testCrateAccount() {
        SignInPage signIn = new SignInPage();
        RegisterPage register = new RegisterPage();
        AddressPage address = new AddressPage();

        testClickTShirtsAndAddToCart();

        signIn.fillBoxEmail();
        signIn.clickButtonCreateAnAccount();

        register.selectGenderFemale();
        register.fillFirstName();
        register.fillLastName();
        register.fillPasswd();
        register.selectDayBirth();
        register.selectMonthBirth();
        register.selectYearBirth();
        register.selectSignUpForNewsletter();
        register.selectReceiveSpecialOffers();
        register.fillCompany();
        register.fillAddress();
        register.fillAddressCont();
        register.fillCity();
        register.selectState();
        register.fillPostcode();
        register.selectCountry();
        register.fillAdditionalInformation();
        register.fillPhoneHome();
        register.fillPhoneMobile();
        register.fillAddressAlias();
        register.clickBtnRegister();

        assertTrue(address.isAddressCorrect());
        address.clickThirdProceedToCheckOut();

    }

    @Test
    @Story("Concordar com os termos, fazer pagamento e confirmar compra")
    public void testPayAndConfirmePurchase(){
        ShippingPage shipping = new ShippingPage();
        PaymentPage payment = new PaymentPage();

        testCrateAccount();

        shipping.clickBoxAgreeToTheTerms();
        shipping.clickFourthProceedToCheckOut();

        assertTrue(payment.isTotalPriceCorrect());
        payment.clickPayByCheck();
        payment.clickButtonConfirmOrder();
        assertTrue(payment.isAlertSuccess());
    }

}

