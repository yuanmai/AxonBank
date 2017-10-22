package todo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty"},
monochrome = true,
features = {"src/test/java/todo/features"})
public class TestRunner {
}
