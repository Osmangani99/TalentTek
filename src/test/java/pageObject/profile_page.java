package pageObject;

import Base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profile_page extends config {
    public profile_page(WebDriver driver)
    { PageFactory.initElements(driver,this); }


    @FindBy(how = How.XPATH, using = "//*[@id=\"profile_form\"]/h5")
    public WebElement verifyProfilePage;

    public void verifyProfilePage() {
        String expectedProfileText = "Update Profile";
        String actualProfileText = verifyProfilePage.getText();
        Assert.assertEquals(actualProfileText,expectedProfileText);

    }

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Student ID']")
    public WebElement studentID;

    public void global_studentID(){
        String current_studentID = studentID.getText();
        System.out.println(current_studentID);

    }





}


