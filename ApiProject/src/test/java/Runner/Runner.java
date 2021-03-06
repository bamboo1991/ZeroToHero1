package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target\\cucumber-html-report", "json:target\\cucumber.json",
                "junit:target\\cucumber.xml", "rerun:target\\rerun.txt"},
        features = "src\\test\\resources\\BreakingBad\\BreakingBad.feature",
        glue = "StepDefs\\BreakingBad",
        dryRun = false,
        monochrome = true
)
public class Runner {

}
