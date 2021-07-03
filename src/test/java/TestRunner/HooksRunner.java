package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Features"
,glue= {"src/test/java/HooksTest"}
,plugin = { "pretty", "html:target/index-reports.html","json:target/cucumber.json" },
monochrome = false
)
public class HooksRunner {

}

