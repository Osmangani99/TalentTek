package pageObject;

import Base.TestData;
import Base.config;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class signup_page extends config {

    Faker faker = new Faker();

    public signup_page(WebDriver driver)
    { PageFactory.initElements(driver,this); }


    @FindBy(how = How.XPATH,using = "//*[@id=\"wrap\"]/div/div/div/a")
    public WebElement createAc;

    public signup_page() {

    }


    public void clickAc (){
        createAc.click();
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"signup-form\"]/div[3]/div[1]/input")
    public WebElement firstName;


    public void enter_firstName (){
        firstName.sendKeys(faker.name().firstName());
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"signup-form\"]/div[3]/div[2]/input")
    public WebElement lastName;

    public void enter_lastName (){
        lastName.sendKeys(faker.name().lastName());

    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"signup-form\"]/input[1]")
    public WebElement emailAddress;

    public void enter_email (){
        emailAddress.sendKeys(faker.internet().emailAddress());

    }


    @FindBy(how = How.XPATH,using = "//*[@id=\"signup-form\"]/input[2]")
    public WebElement password;

    public void enter_password (){
        password.sendKeys("test1234");

    }

    @FindBy(how = How.NAME,using = "confirmPassword")
    public WebElement Conpassword;

    public void enter_Conpassword ( ){

        Conpassword.sendKeys("test1234");

    }


    @FindBy(how =How.NAME,using = "month")
    public WebElement locatorMonth;

    public void select_month(){

        Select enterMonth = new Select(locatorMonth);
        enterMonth.selectByValue("05");
    }

    @FindBy(how = How.NAME,using = "day")
    public WebElement locatorDay;

    public void select_day(){

        Select enterDay = new Select(locatorDay);
        enterDay.selectByValue("06");
    }

    @FindBy (how= How.NAME,using = "year")
    public WebElement locatorYear;

   public void select_year(){

       Select enterYear = new Select(locatorYear);
       enterYear.selectByVisibleText("1994");

   }

   @FindBy (how =How.ID,using ="male")
    public WebElement gender;

   @FindBy(how=How.ID,using = "defaultCheck1")
    public WebElement click_agree;

   @FindBy(how=How.XPATH,using = "//button[@type='submit']")
    public WebElement createMyAccount;

   @FindBy(how = How.XPATH,using ="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    public WebElement loginNewAccount;
   public void login_New_AccountPage(){

       loginNewAccount.click();
   }

   @FindBy(how = How.XPATH, using = "//*[@id=\"success_message\"]/div")
    public WebElement newStudentID;
    public void Enter_studentID(){
        TestData.dynamic_ID = newStudentID.getText().substring(38);
        System.out.println(dynamic_ID);
    }

    @FindBy (how = How.XPATH,using ="//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[1]/td[1]")
    public WebElement newly_login_firstName;

    public void collect_newlyLogin_firstName(){

       String Actual_newly_login_firstname =  newly_login_firstName.getText();
        Assert.assertEquals(Actual_newly_login_firstname,TestData.dynamic_firstName);

    }



}
