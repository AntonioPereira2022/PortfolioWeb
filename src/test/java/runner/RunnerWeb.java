package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/report/"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"Steps"}
)
public class RunnerWeb extends RunBase{

    @AfterClass
    public static void stop(){
       // driver.quit();
    }

}
