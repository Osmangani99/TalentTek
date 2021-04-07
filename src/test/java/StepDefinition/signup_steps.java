package StepDefinition;

import Base.TestData;
import Base.config;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.testng.Assert;
import pageObject.signup_page;

public class signup_steps extends config {


    signup_page signup = new signup_page(driver);

    @Given("I am at talentTEK Home Page")
    public void iAmAtTalentTEKHomePage() {

    }

    @And("I click on Create New Account button")
    public void iClickOnCreateNewAccountButton() {

        signup.clickAc();

    }

    @And("I filled out the form with valid information")
    public void iFilledOutTheFormWithValidInformation() {

        signup.enter_firstName();
        signup.enter_lastName();
        signup.enter_email();
        signup.enter_password();
        signup.enter_Conpassword();
        signup.select_month();
        signup.select_day();
        signup.select_year();
        signup.gender.click();

    }

    @And("I clicked on agree checkbox")
    public void iClickedOnAgreeCheckbox() {
        signup.click_agree.click();
    }

    @When("I click Create My Account button")
    public void iClickCreateMyAccountButton() {

        signup.createMyAccount.click();
    }


    @And("I will store the dynamic studentId")
    public void iWillStoreTheDynamicStudentId() {

        signup.Enter_studentID();

    }

    @And("I click on Login Link")
    public void iClickOnLoginLink() {
        signup.login_New_AccountPage();

    }


    @Then("I verify new user first name and dynamic first name is same")
    public void iVerifyNewUserFirstNameAndDynamicFirstNameIsSame() {

        signup.collect_newlyLogin_firstName();

        //Assert.assertEquals();

    }

    @And("I filled out the form using the following data table")
    public void iFilledOutTheFormUsingTheFollowingDataTable(DataTable table) {

        signup.firstName.sendKeys(table.cell(0,0));
        signup.lastName.sendKeys(table.cell(0,1));
        signup.emailAddress.sendKeys(table.cell(0,2));
        signup.enter_password();
        signup.enter_Conpassword();
        signup.select_month();
        signup.select_day();
        signup.select_year();
        signup.gender.click();
        signup.click_agree.click();
        signup.createMyAccount.click();



    }
}
