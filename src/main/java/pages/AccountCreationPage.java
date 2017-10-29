package pages;
import locators.Locators;
import org.openqa.selenium.By;
/**
 * Created by Englich on 29.10.2017.
 *
 */
public class AccountCreationPage {
    private static By GENDER = Locators.get("Gender");
    private static By FIRST_NAME = Locators.get("FirstName");
    private static By LAST_NAME = Locators.get("LastName");
    private static By PASSWORD = Locators.get("Password");
    private static By DAY_OF_BIRTH = Locators.get("BirthDay");
    private static By MONTH_OF_BIRTH = Locators.get("BirthMonth");
    private static By YEAR_OF_BIRTH = Locators.get("BirthYear");
    private static By COMPANY = Locators.get("Company");
    private static By ADDRESS = Locators.get("Address");
    private static By CITY = Locators.get("City");
    private static By STATE = Locators.get("State");
    private static By ZIP_CODE = Locators.get("ZipCode");
    private static By ADDITIONAL_INFO = Locators.get("AdditionalInfo");
    private static By HOME_PHONE = Locators.get("HomePhone");
    private static By MOBILE_PHONE = Locators.get("MobilePhone");


}
