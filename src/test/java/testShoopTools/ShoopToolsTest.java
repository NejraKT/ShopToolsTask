package testShoopTools;

import baseShoopTools.BaseTestShoopTools;
import org.junit.Before;
import org.junit.Test;
import pageShoopTools.LogInAndOrderPageShoopTools;

public class ShoopToolsTest extends BaseTestShoopTools {

    LogInAndOrderPageShoopTools logInAndOrderPageShoopTools;

    @Before
    public void setUpTestPage() {
        logInAndOrderPageShoopTools = new LogInAndOrderPageShoopTools();
    }

    @Test
    public void successfulLogInAndOrderTest() {

        logInAndOrderPageShoopTools.clickDismissButton();

        logInAndOrderPageShoopTools.clickMyAccountButton();

        logInAndOrderPageShoopTools.sendKeysUsernameField("Ana Marija");

        logInAndOrderPageShoopTools.sendKeysPasswordField("AnaMarijaCengic123!");

        logInAndOrderPageShoopTools.clickLogInButton();

        logInAndOrderPageShoopTools.clickSearchFieldButton();

        logInAndOrderPageShoopTools.sendKeysSearchFieldEnter("dress");

        logInAndOrderPageShoopTools.clickSearchFieldEnter();

        logInAndOrderPageShoopTools.clickFirstDressInPage();

        logInAndOrderPageShoopTools.clickChooseDressField();

        logInAndOrderPageShoopTools.clickChooseWhiteDress();

        logInAndOrderPageShoopTools.clickChooseSizeDress();

        logInAndOrderPageShoopTools.clickChooseMediumDress();

        logInAndOrderPageShoopTools.clickAddToCartButton();

        logInAndOrderPageShoopTools.clickBackButton();

        logInAndOrderPageShoopTools.clickSecondDressInPage();

        logInAndOrderPageShoopTools.clickChooseSecondDressField();

        logInAndOrderPageShoopTools.clickChooseSecondWhiteDress();

        logInAndOrderPageShoopTools.clickChooseSecondSizeDress();

        logInAndOrderPageShoopTools.clickChooseSecondMediumDress();

        logInAndOrderPageShoopTools.clickAddToCartSecondButton();

        logInAndOrderPageShoopTools.clickCartIcon();

        logInAndOrderPageShoopTools.clickCheckoutButton();

        logInAndOrderPageShoopTools.clickAcceptTerms();

        logInAndOrderPageShoopTools.clickPlaceOrderButton();

        logInAndOrderPageShoopTools.clickSecondMyAccountButton();

        logInAndOrderPageShoopTools.clickLogoutButton();
    }
}
