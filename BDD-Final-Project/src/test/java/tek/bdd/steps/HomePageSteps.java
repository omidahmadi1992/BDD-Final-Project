package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.HomePageObject;
import tek.bdd.utility.CommonUtilities;
import tek.bdd.utility.SeleniumUtilities;

public class HomePageSteps extends SeleniumUtilities {
    @Given("Open browser and navigate to Tek retail app")
    public void openBrowserAndNavigateToTekRetailApp() {
        initializeFramework();

    }

    @When("Validate TEK Insurance UI title is exist")
    public void validateTekInsuranceUITitleIsExist() {
        String uiActualText = getElementText(HomePageObject.HOME_PAGE_TEK_INSURANCE_UI_TITLE_IS_EXIST);
        Assert.assertEquals("TEK Insurance App", uiActualText);
    }

    @Then("Validate Primary Account Button is exist")
    public void validatePrimaryAccountButtonIsExist() {
        String accountText = getElementText(HomePageObject.HOME_PAGE_CREATE_PRIMARY_ACCOUNT);
        Assert.assertEquals("Create Primary Account", accountText);

    }

    @Then("Click on Create Primary Account Button")
    public void clickOnCreatePrimaryAccountButton() {
        clickOnElement(HomePageObject.HOME_PAGE_CREATE_PRIMARY_ACCOUNT);

    }

    @Then("Close browser")
    public void closeBrowser() {

    }
    @Given("landed in home page")
    public void landed_in_home_page() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("click on {string} link")
    public void clickOnLinks(String linkText) {
        clickOnElement(HomePageObject.getLinkLocator(linkText));
    }

    @Then("validate section title to be {string}")
    public void validateSectionTitle(String expectedTitle) {
        String actualTitle = getElementText(HomePageObject.SECTION_TITLE);
        Assert.assertEquals("Section Title" , expectedTitle, actualTitle);
    }
    @Then("validate card title to be {string}")
    public void validateCardTitle(String expectedTitle) {
        String actualTitle = getElementText(HomePageObject.CARD_TITLE);
        Assert.assertEquals("Section Title" , expectedTitle, actualTitle);
    }
    @When("click on {string} button")
    public void clickOnButton(String buttonText) throws InterruptedException {
        clickOnElement(HomePageObject.getButtonLocator(buttonText));
        CommonUtilities.waitTime(1000);
    }

    @When("send text {string} to {string} field")
    public void sendTextToField(String text, String field) throws InterruptedException {
        if (text.equalsIgnoreCase("random")) {
            String email = recorder.get("email");
            text = email.substring(0, email.indexOf("@"));
        }
        sendText(HomePageObject.getInputLocator(field), text);
    }

    @Given("wait {int} second")
    public void waitSecond(int seconds) {
        CommonUtilities.waitTime(seconds * 1000);
    }

    @Then("validate application title {string}")
    public void validateApplicationTitle(String expectedTitle) {
        String actualTitle = getElementText(HomePageObject.APPLICATION_TITLE);
        Assert.assertEquals("Validate application title", expectedTitle, actualTitle);
    }
}
