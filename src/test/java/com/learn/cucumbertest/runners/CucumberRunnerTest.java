package com.learn.cucumbertest.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features",
    glue = "com.learn.cucumbertest.stepdefinitions",
        plugin = {"pretty",
            "html:target/cucumber-report/cucumber.html",
            "json:target/cucumber-report/cucumber.json"
// Generates HTML report
    }
)
public class CucumberRunnerTest {

    static {
        System.out.println(">>> CucumberTest is loaded and running!");
    }

}