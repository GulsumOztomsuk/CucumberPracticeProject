package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ="html:target/cucumber-html-reports.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,  //cuke runner da biseyler yazması için buranın false olması lazım
        tags = "@scenarioOutline"
)
public class CukesRunner {


}
