import core.TestData;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.MainPage;
/**
 * Created by Englich on 27.07.2017.
 *
 */
public class RegistrationTest extends TestData {
    @Test
    public void validEmail(){
        MainPage.goToLoginPage(driver);
        SignInPage.validEmail(driver, "xxxvadimon4ikxxx@mail.ru");
        //TODO
        //AccountCreationPage
    }
}
