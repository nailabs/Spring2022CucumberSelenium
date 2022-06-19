package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features/activities",
        dryRun = false,
        strict = false,
        tags =  "", // run everything except driver: "not @driver"
        plugin = {
                "html:target/default-report",
                "json:target/cucumber2.json",//in webdev-t, api //json has only properties, no methods

        }
)

public class ActivitiesTestRunner {
}
