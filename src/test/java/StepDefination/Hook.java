package StepDefination;

import Base.config;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
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
}