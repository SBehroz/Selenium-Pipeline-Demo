package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "C:\\Users\\Suliman Behroz\\IdeaProjects\\GherkinTestDemo\\src\\main\\resources\\features",
        glue = {"StepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}
