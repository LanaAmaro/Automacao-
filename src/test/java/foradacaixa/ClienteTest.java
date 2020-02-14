package foradacaixa;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cliente.feature", glue = { "" }, monochrome = true, dryRun = false)

public class ClienteTest {

}
