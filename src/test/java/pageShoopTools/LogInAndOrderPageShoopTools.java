package pageShoopTools;

import baseShoopTools.BaseTestShoopTools;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class LogInAndOrderPageShoopTools extends BaseTestShoopTools {

    Logger logger = Logger.getLogger(BaseTestShoopTools.class.getName());


    public LogInAndOrderPageShoopTools() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(), \"Dismiss\")]")
    WebElement dismissButton;

    @FindBy(xpath = "//a[contains(text(), \"My Account\")]")
    WebElement myAccountButton;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(name = "login")
    WebElement logInButton;

    @FindBy(xpath = "//a[@class=\"noo-search\"]")
    WebElement searchFieldButton;

    @FindBy(name = "s")
    WebElement searchFieldEnter;

    @FindBy(xpath = "//a[contains(text(), \"white milkmaid hook and eye bodycon midi dress\")]")
    WebElement firstDressInPage;

    @FindBy(id = "pa_color")
    WebElement chooseDressField;

    @FindBy(xpath = "//option[contains(text(), \"White\")]")
    WebElement chooseWhiteDress;

    @FindBy(id = "pa_size")
    WebElement chooseSizeField;

    @FindBy(xpath = "//option[contains(text(), \"Medium\")]")
    WebElement chooseMediumDress;

    @FindBy(xpath = "//button[contains(text(), \"Add to cart\")]")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[contains(text(), \"white bandage cut out bodycon mini dress\")]")
    WebElement secondDressInPage;

    @FindBy(id = "pa_color")
    WebElement chooseSecondDressField;

    @FindBy(xpath = "//option[contains(text(), \"White\")]")
    WebElement chooseSecondWhiteDress;

    @FindBy(id = "pa_size")
    WebElement chooseSecondSizeField;

    @FindBy(xpath = "//option[contains(text(), \"Medium\")]")
    WebElement chooseSecondMediumDress;

    @FindBy(xpath = "//button[contains(text(), \"Add to cart\")]")
    WebElement addToCartSecondButton;

    @FindBy(xpath = "//a[@title=\"View cart\"]")
    WebElement cartIcon;

    @FindBy(xpath = "//a[contains(text(), \"Checkout\")]")
    WebElement checkoutButton;

    @FindBy(xpath = "//label[@class=\"woocommerce-form__label woocommerce-form__label-for-checkbox checkbox\"]")
    WebElement acceptTerms;

    @FindBy(xpath = "//button[contains(text(), \"Place order\")]")
    WebElement placeOrderButton;

    @FindBy(xpath = "//a[contains(text(), \"My Account\")]")
    WebElement secondMyAccountButton;

    @FindBy(xpath = "//a[contains(text(), \"Logout\")]")
    WebElement logoutButton;

    public void clickDismissButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(dismissButton));
        dismissButton.click();
    }

    public void clickMyAccountButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(myAccountButton));
        myAccountButton.click();
    }

    public void sendKeysUsernameField(String name) {
        wdWait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.clear();
        usernameField.sendKeys(name);
    }

    public void sendKeysPasswordField(String password) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogInButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(logInButton));
        logInButton.click();
    }

    public void clickSearchFieldButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(searchFieldButton));
        searchFieldButton.click();
    }

    public void sendKeysSearchFieldEnter(String search) {
        wdWait.until(ExpectedConditions.visibilityOf(searchFieldEnter));
        searchFieldEnter.clear();
        searchFieldEnter.sendKeys(search);
    }

    public void clickSearchFieldEnter() {
        wdWait.until(ExpectedConditions.elementToBeClickable(searchFieldEnter));
        searchFieldEnter.sendKeys(Keys.ENTER);
    }

    public void clickFirstDressInPage() {
        wdWait.until(ExpectedConditions.elementToBeClickable(firstDressInPage));
        firstDressInPage.click();
    }

    public void clickChooseDressField() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseDressField));
        chooseDressField.click();
    }

    public void clickChooseWhiteDress() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseWhiteDress));
        chooseWhiteDress.click();
    }

    public void clickChooseSizeDress() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseSizeField));
       // chooseSizeField.click();
        actions.click(chooseSizeField);
    }

    public void clickChooseMediumDress() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseMediumDress));
        chooseMediumDress.click();
    }

    public void clickAddToCartButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    public void clickBackButton() {
        driver.navigate().back();
        driver.navigate().back();
    }

    public void clickSecondDressInPage() {
        wdWait.until(ExpectedConditions.elementToBeClickable(secondDressInPage));
        secondDressInPage.click();
    }

    public void clickChooseSecondDressField() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseSecondDressField));
        chooseSecondDressField.click();
    }

    public void clickChooseSecondWhiteDress() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseSecondWhiteDress));
        chooseSecondWhiteDress.click();
    }

    public void clickChooseSecondSizeDress() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseSecondSizeField));
        chooseSecondSizeField.click();
    }

    public void clickChooseSecondMediumDress() {
        wdWait.until(ExpectedConditions.elementToBeClickable(chooseSecondMediumDress));
        chooseSecondMediumDress.click();
    }

    public void clickAddToCartSecondButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(addToCartSecondButton));
        addToCartButton.click();
    }

    public void clickCartIcon() {
        wdWait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cartIcon.click();
    }

    public void clickCheckoutButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        checkoutButton.click();
    }

    public void clickAcceptTermsCheckBox() {
        wdWait.until(ExpectedConditions.elementToBeClickable(acceptTerms));
        actions.moveToElement(acceptTerms).click().perform();
    }

    public void clickPlaceOrderButton() {
        logger.info("The driver is waiting to click on place order button");
        wdWait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        placeOrderButton.click();
    }

    public void clickSecondMyAccountButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(secondMyAccountButton));
        secondMyAccountButton.click();
    }

    public void clickLogoutButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }

}
