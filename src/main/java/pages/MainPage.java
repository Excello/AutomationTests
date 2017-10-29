package pages;
import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import waiters.Waiters;
/**
 * Created by Englich on 28.07.2017.
 *
 */
public class MainPage {
    private static By SIGN_IN = Locators.get("SignInButton");
    private static By USERNAME = Locators.get("Username");
    private static By USERNAME_LIST = Locators.get("UsernamePreview");

    public static void goToLoginPage(WebDriver driver) {
        driver.findElement(SIGN_IN).click();
    }
    public static boolean checkUsername(WebDriver driver, String username) {
        Waiters.WaiterForPage();
        driver.findElement(USERNAME_LIST).click();
        return driver.findElement(USERNAME).getAttribute("testtesttest123").contains(username);
    }
}
