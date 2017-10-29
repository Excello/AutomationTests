package locators;

import org.openqa.selenium.By;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Englich on 28.07.2017.
 */
public class Locators {
    private static final Properties locators;

    static {
        locators = new Properties();
        InputStream inputFile = Locators.class.getResourceAsStream("/locators.properties");

        try {
            locators.load(inputFile);
        } catch (Exception e) {
            System.out.println("File not found" + e);
        }
    }

    private enum LocatorType {
        id, name, css, xpath, tag, text, partText, classname
    }

    private static By getLocator(String locator) {
        String[] locatorItems = locator.split("=", 2);
        LocatorType locatorType = LocatorType.valueOf(locatorItems[0]);

        switch (locatorType) {
            case classname: {
                return By.className(locatorItems[1]);
            }
            case id: {
                return By.id(locatorItems[1]);
            }
            case name: {
                return By.name(locatorItems[1]);
            }
            case css: {
                return By.cssSelector(locatorItems[1]);
            }
            case xpath: {
                return By.xpath(locatorItems[1]);
            }
            case tag: {
                return By.tagName(locatorItems[1]);
            }
            case text: {
                return By.linkText(locatorItems[1]);
            }
            case partText: {
                return By.partialLinkText(locatorItems[1]);
            }
            default: {
                throw new IllegalArgumentException("This locator doesn't exist: " + locatorItems[0]);
            }
        }
    }

    public static By get(String locatorName) {
        String propertyValue = locators.getProperty(locatorName);
        return getLocator(propertyValue);
    }
}
