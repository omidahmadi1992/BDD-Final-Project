package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature",
        glue = "tek.bdd.steps",
        tags = "@US_2",
        dryRun = false,
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "html:target/cucumber-report/report.html",
                "json:target/jsonReports/jsonReport.json",
                "pretty"
        })
public class TestRunner {
}
