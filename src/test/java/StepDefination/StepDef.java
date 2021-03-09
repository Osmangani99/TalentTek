package StepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {


    WebDriver driver;

    @Given("launch chrome browser")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\osman\\eclipse-workspace\\ZServerLink\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();


    }
    @When("user navigate to talenttek")
    public void user_navigate_to_talenttek() {

        driver.get("http://qa.taltektc.com/home/login");
    }
    @Then("user input valid id and password")
    public void user_input_valid_id_and_password() {

    }
    @Then("click login button")
    public void click_login_button() {

    }


}