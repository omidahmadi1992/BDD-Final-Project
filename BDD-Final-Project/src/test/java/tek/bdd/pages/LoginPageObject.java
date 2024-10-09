package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class LoginPageObject extends SeleniumUtilities {
    public static final By LOGIN_BUTTON = By.linkText("Login");
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[text()='Sign In']");
    public static final By VALIDATE_CUSTOMER_SERVICES_PORTAL = By.xpath("//h2[text()='Customer Service Portal']");
    public static final By VALIDATE_ERROR_MESSAGE = By.xpath("//div[text()='ERROR']");
}
