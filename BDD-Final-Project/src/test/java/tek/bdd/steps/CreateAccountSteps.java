package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateAccountPageObject;
import tek.bdd.utility.RandomData;
import tek.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {

    @When("fill up create account form")
    public void fillUpCreateAccountForm(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String firstName = data.get("lastName");
        String lastName = data.get("firstName");
        String email = data.get("email").equals("random") ? RandomData.emailAddress(firstName, lastName) :
                data.get("email");
        //Store email address to recorder map
        recorder.put("email", email);
        recorder.put("fullName", firstName + " " + lastName);
        sendText(CreateAccountPageObject.EMAIL_INPUT, email);
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, firstName);
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, lastName);
        sendText(CreateAccountPageObject.EMPLOYMENT_INPUT, data.get("employmentStatus"));
        sendText(CreateAccountPageObject.DOB_INPUT, data.get("dob"));
        selectFromDropDown(CreateAccountPageObject.PREFIX_SELECT, data.get("prefix"));
        selectFromDropDown(CreateAccountPageObject.GENDER_SELECT, data.get("gender"));
        selectFromDropDown(CreateAccountPageObject.MARITAL_STATUS_SELECT, data.get("maritalStatus"));
    }


    @Then("validate created fullName and email")
    public void validateCreatedFullNameAndEmail() {
        String expectedEmail = recorder.get("email");
        String actualEmail = getElementText(CreateAccountPageObject.EMAIL_TITLE);
        Assert.assertEquals("Validate created account", expectedEmail, actualEmail);
        String expectedFullName = recorder.get("fullName");
        String actualFullName = getElementText(CreateAccountPageObject.FULL_NAME_TITLE);
        Assert.assertEquals("Validating created account", expectedFullName, actualFullName);
    }
}
