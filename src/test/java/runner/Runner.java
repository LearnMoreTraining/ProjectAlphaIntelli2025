package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

       features = {"src/test/resources/testdesign","src/test/resources/book"},
        glue = {"stepdefinition","hooks"},
        plugin = {"pretty",
                "html:target/reports/report.html",
                "json:target/reports/sample.json" ,
                "junit:target/reports/sample.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        tags = "@amazon02"
)

public class Runner {
}
