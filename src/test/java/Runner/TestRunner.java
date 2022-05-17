package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "StepDefinition",
        plugin = {"json:target/cucumber/cucumber.json"}

)
public class TestRunner {

}
