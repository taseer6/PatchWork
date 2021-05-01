package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.IOException;

/**
 * The class is the main runner class
 * for all the feature files
 */
@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/resource/features"},
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)

public class MainRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeReport() throws IOException {
    }
}