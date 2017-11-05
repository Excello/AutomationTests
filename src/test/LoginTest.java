import core.TestData;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.MainPage;
/**
 * Created by Englich on 27.07.2017.
 *
 */
public class LoginTest extends TestData {
    @Test
    public void validLogin(){
        MainPage.goToLoginPage(driver);
        SignInPage.validLogin(driver, "testtesttest123", "testtesttest");
        MainPage.checkUsername(driver, "testtesttest123");
    }
}
