package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPageObject;
import tek.bdd.utility.DateAndTimeUtility;
import tek.bdd.utility.SeleniumUtilities;

import java.util.List;

public class PlansSteps extends SeleniumUtilities {
    @When("Click on plans")
    public void clickOnPlans() {
        clickOnElement(PlansPageObject.PLANS_LOCATOR);

    }

    @Then("Validate {int} row of the data is present")
    public void validate4RowOfTheDataIsPresent(Integer row) {

        String planType = getElementText(PlansPageObject.PLAN_TYPE);
        Assert.assertEquals("PLAN TYPE", planType);

        String actualPlanBasePrice = getElementText(PlansPageObject.PLAN_BASE_PRICE);
        Assert.assertEquals("PLAN BASE PRICE", actualPlanBasePrice);

        String actualDateCreated = getElementText(PlansPageObject.DATE_CREATED);
        Assert.assertEquals("DATE CREATED", actualDateCreated);

        String actualDteExpire = getElementText(PlansPageObject.DATE_EXPIRES);
        Assert.assertEquals("DATE EXPIRE", actualDteExpire);

    }

    @Then("Validate create date is today's date EST Time Zone")
    public void validateCreateDate() {

        List<WebElement> elements = getElements(PlansPageObject.CREATE_DATE_IS_TODAY_DATE_EST_TIME_ZONE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = DateAndTimeUtility.getCurrentDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }
    }
    @Then("Validate expire date is day after EST Time Zone")
    public void validateExpireDate() {

        List<WebElement> elements = getElements(PlansPageObject.EXPIRE_DATE_IS_AFTER_EST_TIME_ZONE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = DateAndTimeUtility.getExpiredDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }

    }

}
