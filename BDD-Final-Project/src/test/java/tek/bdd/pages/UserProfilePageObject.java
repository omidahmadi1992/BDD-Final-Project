package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class UserProfilePageObject extends SeleniumUtilities {
    public static final By ACCOUNT_PROFILE = By.xpath("//button[@type='button']");
    public static final By PROFILE_INFORMATION = By.xpath("//div[@class='chakra-stack css-6phkm9']");
    public static final By LOGOUT_BUTTON = By.xpath("(//button[@type='button'])[3]");
}
