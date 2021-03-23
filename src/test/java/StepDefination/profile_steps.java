package StepDefination;

import Base.config;
import io.cucumber.java.en.Then;
import pageObject.profile_page;

public class profile_steps extends config {
    profile_page profile = new profile_page(driver);

    @Then("I verify I successfully logged in my account")
    public void iVerifyISuccessfullyLoggedInMyAccount() {
        profile.verifyProfilePage();

    }
}
