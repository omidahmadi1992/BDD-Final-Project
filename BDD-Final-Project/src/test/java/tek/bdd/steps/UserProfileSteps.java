package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.UserProfilePageObject;
import tek.bdd.utility.SeleniumUtilities;

public class UserProfileSteps extends SeleniumUtilities {
    @Then("Click on profile button")
    public void clickCnProfileButton() {
        clickOnElement(UserProfilePageObject.ACCOUNT_PROFILE);

    }
    @Then("Validate information in Profile Side Drawer is correct")
    public void validateInformationInProfileSideDrawerIsCorrect() {
        String actualProfile = getElementText(UserProfilePageObject.PROFILE_INFORMATION);
        Assert.assertEquals("Profile", actualProfile);

    }
    @Then("click on Logout button")
    public void clickCnLogoutButton() {
        getElementText(UserProfilePageObject.LOGOUT_BUTTON);

    }

}
