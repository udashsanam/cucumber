package com.learn.cucumbertest.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features",
    glue = "com.learn.cucumbertest.stepdefinitions",
    plugin = {"pretty"}
)
public class TestRunner {
}