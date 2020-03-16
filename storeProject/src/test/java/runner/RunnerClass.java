package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src\\test\\resources\\Authentication",
            glue = "StepDefs",
            dryRun =false,
            tags = "@regression",
            monochrome = true
    )
    public class RunnerClass {
}
