package StepDefinition;

import Base.config;
import io.cucumber.java.en.Then;
import pageObject.profile_page;

public class profile_steps extends config {

    profile_page profile = new profile_page(driver);

    @Then("I verify I successfully logged in my account")
    public void iVerifyISuccessfullyLoggedInMyAccount() {
        profile.verify_student_id();

    }

    @Then("I will verify Thank you message")
    public void iWillVerifyThankYouMessage() {

    }

    @Then("I will verify my profile info")
    public void iWillVerifyMyProfileInfo() {

    }


    @Then("I open Web table")
    public void iOpenWebTable() {
        profile.Click_WebTable();

    }

    @Then("I will verify I successfully logged into my existing account")
    public void iWillVerifyISuccessfullyLoggedIntoMyExistingAccount() {


    }
}
