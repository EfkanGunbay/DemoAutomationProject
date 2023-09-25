package com.Demo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        glue = "com/Demo/step_definitions",
        features = "src/test/resources/features",
        publish = true,
        tags = "@Home",
        dryRun =false



)
public class CukesRunner {

}