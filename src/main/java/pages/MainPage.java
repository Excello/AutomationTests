package pages;

import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import waiters.Waiters;

/**
 * Created by Englich on 28.07.2017.
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
//    By authButtonLocator = By.className("auth-bar__item auth-bar__item--text");
//    By loginButtonLocator = By.className("auth-box__auth-submit auth__btn auth__btn--green");
//    By usernameLocator = By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[1]");
//    By passwordLocator = By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[2]");
}
