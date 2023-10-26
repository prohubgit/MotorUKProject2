package co.uk.motors.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/co/uk/motors/features"},
        glue = {"co/uk/motors/hooks", "co/uk/motors/stepDefinitions"},
        plugin = {"pretty","json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}



)
public class TestRunner {
}
