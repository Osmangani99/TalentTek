package StepDefinition;

import Base.Util;
import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.login_page;

public class login_steps extends config {

    login_page login = new login_page(driver);

    @Given("I am in talenTEK site")
    public void iAmInTalenTEKSite() {

        Assert.assertEquals(driver.getTitle(),"Sign In");

    }

    @And("I enterd valid ID")
    public void iEnterdValidID() {
        login.enterEmail();
        Util.screenShots(driver,"enterEmailID");

        
    }

    @And("I entred valid password")
    public void iEntredValidPassword() {
        login.enterPassword("osman123");

        Util.screenShots(driver,"afterPassword");
        
    }
    @When("I click on login button")
    public void iClickOnLoginButton() {
        login.clickOnLogin();

    }



}
