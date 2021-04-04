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


    @FindBy(how = How.XPATH, using = "//*[@id=\"profile_form\"]/input[2]")
    public WebElement verifyProfilePage;

    public void verify_student_id() {
        String expected_StudentID = "TTCKp5At";
        verifyProfilePage.click();
        String actual_StudentID = verifyProfilePage.getAttribute("value");
        System.out.println("**************"+actual_StudentID);
        Assert.assertEquals(actual_StudentID,expected_StudentID);

    }
    @FindBy (how = How.XPATH,using = "//*[@id=\"sidebar-wrapper\"]/div[2]/a[5]")
    public WebElement webTable;
    public void Click_WebTable(){
        webTable.click();
    }




}


