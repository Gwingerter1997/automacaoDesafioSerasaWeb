package br.com.dasafioSerasa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@SerieA",
        glue = "br.com.dasafioSerasa.steps",
        plugin = {"json:target/reports/CucumberReports.json",  "pretty"},
        snippets = CucumberOptions.SnippetType.UNDERSCORE

)
public class RunnerTest {
}
