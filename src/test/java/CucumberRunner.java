import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue = {"steps", "hooks"},
    plugin = {"pretty", "html:build/result.html"},
    features = "src/test/resources/features",
    stepNotifications = true,
    tags = "@Scenario001",
    publish = true
)
public class CucumberRunner {

}
