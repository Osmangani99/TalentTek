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

    //================= Login page locator -----Login page WebElement ================
    //email edit box
    @FindBy (how = How.NAME, using = "email")
    public WebElement emailOrId;

    // password edit box
    @FindBy (how = How.NAME, using = "password")
    public WebElement password;

    // login button
    @FindBy (how = How.XPATH, using = "//input[@value='Log In']")
    public WebElement loginButton;


    // Login with parameters
    @FindBy(how = How.NAME,using ="email")
    public WebElement emailOrIdParameters;


    // Password parameters
    @FindBy(how = How.NAME,using = "password")
    public WebElement passwordWithParameter;


    // ===========Login page functions ============

    // Login with global ID from testData table
    public void enterEmail( ){
        emailOrId.sendKeys(refID.global_studentID);
    }

    // Login with new student ID
    public void EnterNewIDOrEmail(String newStudentID ){
        emailOrId.sendKeys(newStudentID);
    }
    // Login password
    public void enterPassword(String studentPassword){
        password.sendKeys(studentPassword);
    }
    // Click login button
    public void clickOnLogin(){
        loginButton.click();
    }
    // using Parameter ID or email
    public void enterParameter_emailOrId(String emailOrId){ emailOrIdParameters.sendKeys(emailOrId); }
    // using Parameter Password
    public void enter_passwordParameter(String password){ passwordWithParameter.sendKeys(password); }























}
