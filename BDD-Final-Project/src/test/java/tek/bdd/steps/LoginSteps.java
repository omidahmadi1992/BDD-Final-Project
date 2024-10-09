package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPageObject;
import tek.bdd.utility.SeleniumUtilities;

public class LoginSteps extends SeleniumUtilities {
    @When("Click on login button")
    public void clickOnLoginButton() {
        clickOnElement(LoginPageObject.LOGIN_BUTTON);

    }
    @Then("Enter username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password) {
        sendText(LoginPageObject.USERNAME_INPUT, username);
        sendText(LoginPageObject.PASSWORD_INPUT, password);

    }
    @Then("Click on sign in button")
    public void clickOnSignInButton() {
        clickOnElement(LoginPageObject.SIGN_IN_BUTTON);

    }
    @Then("Validate user navigate to Customer Service Portal")
    public void validateUserCustomerServicePortal() {
        String actualCustomerServicePortal = getElementText(LoginPageObject.VALIDATE_CUSTOMER_SERVICES_PORTAL);
        Assert.assertEquals("Customer Service Portal", actualCustomerServicePortal);

    }
    @Then("Validate error message {string}")
    public void validateErrorMessageAsExpected(String expectedMessage) {
        String actualErrorMessage = getElementText(LoginPageObject.VALIDATE_ERROR_MESSAGE);
        Assert.assertEquals("ERROR", actualErrorMessage, expectedMessage);

    }

}
