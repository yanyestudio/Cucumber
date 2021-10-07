package test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="scr/java/test/features/"
        ,glue={"test.seleniumgluecode"}
        ,format = {"pretty","json:json_output/cucumber.json","junit:junit/cucumber.xml"}
        ,monochrome = true
        ,strict = true
        ,dryRun=false
        )
public class Testrunner{
}


