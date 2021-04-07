package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObject.signup_page;

import java.io.File;

public class Util {


    signup_page refSignUp = new signup_page();

    public static void screenShots(WebDriver driver, String screenShotName) {

        try {
            // To create reference of TakesScreenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            // Call method to capture screenshot
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            // Copy files to specific location
            // result.getName() will return name of test case so that screenshot name will be same as test case name
            FileUtils.copyFile(src, new File("src/test/Screenshots" + screenShotName + ".png"));
            System.out.println("Successfully captured a screenshot");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }

    //============== drop down using select class==========

    public void dropDownByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void dropDownByIndex(WebElement element, int indexNumber){
        Select select = new Select(element);
        select.selectByIndex(indexNumber);
    }
    public void dropDownByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }





}