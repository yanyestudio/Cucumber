package test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/features"
        ,glue={"seleniumgluecode"}
        ,format = {"pretty","json:json_output/cucumber.json","junit:junit/cucumber.xml"}
        ,monochrome = true
        ,strict = true
        )
public class Testrunner{
}


