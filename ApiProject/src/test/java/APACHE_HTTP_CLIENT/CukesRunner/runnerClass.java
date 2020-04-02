package APACHE_HTTP_CLIENT.CukesRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src\\test\\resources\\PetPractice"},
            glue = "StepDefs",
            dryRun = false,
            monochrome = true,
            tags = "@API"
    )
    public class runnerClass {
    }

