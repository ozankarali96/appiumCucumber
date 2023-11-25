import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {
                "pretty",
                "html:Reports/cucumber-pretty.html",
                "json:Reports/CucumberTestReport.json",
                "junit:Reports/CucumberTestReport.xml"
        }

)
public class TestRunner { }