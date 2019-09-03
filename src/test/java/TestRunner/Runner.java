import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\dns\\IdeaProjects\\FirstTestSWDJAVA\\src\\test\\features\\testGoogle.feature",
        glue = "C:\\Users\\dns\\IdeaProjects\\FirstTestSWDJAVA\\src\\test\\java\\MyStepdefs.java",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
        )

public class Runner {
}
