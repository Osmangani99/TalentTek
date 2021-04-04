package StepDefinition;

import Base.config;
import io.cucumber.java.en.Then;
import pageObject.webTable_page;


public class webTable_steps extends config {

    webTable_page webTable = new webTable_page(driver);

    @Then("I collect my new account info")
    public void iCollectMyNewAccountInfo() {

        webTable.newAccount_firstName_info();


    }
}
