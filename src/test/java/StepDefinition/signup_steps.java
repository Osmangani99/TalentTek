package StepDefinition;

import Base.TestData;
import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signup_page;

public class signup_steps extends config {


    signup_page ref = new signup_page(driver);

    @Given("I am at talentTEK Home Page")
    public void iAmAtTalentTEKHomePage() {


    }

    @And("I click on Create New Account button")
    public void iClickOnCreateNewAccountButton() {

      ref.clickAc();

    }

    @And("I filled out the form with valid information")
    public void iFilledOutTheFormWithValidInformation() {

        ref.enter_firstName();
        ref.enter_lastName();
        ref.enter_email();
        ref.enter_password();
        ref.enter_Conpassword();
        ref.select_month();
        ref.select_day();
        ref.select_year();
        ref.gender.click();


    }

    @And("I clicked on agree checkbox")
    public void iClickedOnAgreeCheckbox() {
        ref.click_agree.click();
    }

    @When("I click Create My Account button")
    public void iClickCreateMyAccountButton() {

        ref.createMyAccount.click();
    }


    @And("I will store the dynamic studentId")
    public void iWillStoreTheDynamicStudentId() {

        ref.Enter_studentID();

    }

    @And("I click on Login Link")
    public void iClickOnLoginLink() {
        ref.login_New_AccountPage();

    }










}
