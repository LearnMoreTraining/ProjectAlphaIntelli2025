package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

       features = {"src/test/resources/testdesign"},
        glue = {"stepdefinition"},
        plugin = {"pretty"},
        tags = "@Sc02"
)

public class Runner {
}
