package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/features",
glue= {"Stepdefinition"},
plugin={"pretty","html:target/report.html"},


monochrome=true,publish=true)
public class runner {

}
