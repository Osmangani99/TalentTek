package StepDefinition;

import Base.Util;
import Base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends config {


    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    public static String defaultBrowser = "ch";
    public static String defaultEnv = "qa";


    @Before
    public void openBrowser() {

        if (Strings.isNullOrEmpty(browserType)) {
            browserType = defaultBrowser;
        }
        if (Strings.isNullOrEmpty(baseURL)) {
            baseURL = defaultEnv;
        }

        driver = initDriver(browserType);
        switch (baseURL) {
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://taltektc.com";
                break;


        }

        driver.get(url);


    }
    @After
    public void tearDown(Scenario scenario){

//        try{
//            if (scenario.isFailed()) {
//                final byte [] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenShot,"image/png",scenario.getName());
//
//            }
//
//        }catch (Exception e){
//
//            System.out.println(e);
//        }


        Util.screenShots(driver,"studentIDLogin");


    }
}