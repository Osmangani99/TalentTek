package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/FeatureFile/login.feature",
        glue = "StepDefination"


)

public class myTestRunner extends AbstractTestNGCucumberTests {

    // generate report and run test as group


}
