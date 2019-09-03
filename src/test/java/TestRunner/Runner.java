package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\dns\\IdeaProjects\\FirstTestSWDJAVA\\src\\test\\java\\resources_features\\testGoogle.feature",
        glue = {"step_definitions"},
               tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
)

public class Runner {
}


