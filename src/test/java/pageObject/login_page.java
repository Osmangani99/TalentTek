package pageObject;

import Base.TestData;
import Base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends config {

    TestData refID = new TestData();


    public login_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //email edit box
    @FindBy (how = How.NAME, using = "email")
    public WebElement emailOrId;

    public void enterEmail( ){
        emailOrId.sendKeys(refID.global_studentID);
    }

    public void EnterNewIDOrEmail(String newStudentID ){
        emailOrId.sendKeys(newStudentID);
    }

    // password edit box
    @FindBy (how = How.NAME, using = "password")
    public WebElement password;

    public void enterPassword(String studentPassword){
        password.sendKeys(studentPassword);
    }

    // login button
    @FindBy (how = How.XPATH, using = "//input[@value='Log In']")
    public WebElement loginButton;

    public void clickOnLogin(){
        loginButton.click();
    }





















}
