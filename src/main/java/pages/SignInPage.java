package pages;
import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import waiters.Waiters;
/**
 * Created by Englich on 28.07.2017.
 *
 */
public class SignInPage {
    private static By LOGIN = Locators.get("Login");
    private static By PASSWORD = Locators.get("Password");
    private static By SIGN_IN_BUTTON = Locators.get("SignInButton");
    private static By EMAIL_FIELD = Locators.get("EmailAddressField");
    private static By CREATE_ACCOUNT_BUTTON = Locators.get("CreateAccountButton");

    public static void validEmail (WebDriver driver, String myValidEmail) {
        driver.findElement(EMAIL_FIELD).sendKeys(myValidEmail);
        driver.findElement(CREATE_ACCOUNT_BUTTON).click();
    }
    public static void validLogin(WebDriver driver, String myLogin, String myPassword) {
        Waiters.WaiterForPage();
        driver.findElement(LOGIN).sendKeys(myLogin);
        driver.findElement(PASSWORD).sendKeys(myPassword);
        driver.findElement(SIGN_IN_BUTTON).click();
    }
}
