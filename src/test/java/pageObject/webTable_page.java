package pageObject;

import Base.TestData;
import Base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class webTable_page extends config {

    public webTable_page(WebDriver driver)
    { PageFactory.initElements(driver,this); }

    public webTable_page() {

    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[1]/td[1]")
    public WebElement newAccountFirstName;
    public void newAccount_firstName_info(){
//        String newAccount_user_firstName =newAccountFirstName.getText();
//        System.out.println("This is  New Account users first name======---------->"+ " "+newAccount_user_firstName);

          TestData.dynamic_firstName =newAccountFirstName.getText();
          System.out.println("This is new users first name=========------->"+" "+dynamic_firstName);

    }




}
