package test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="scr/java/test/features"
        ,glue={"seleniumgluecode"}
        ,monochrome = true
        ,strict = true
        )
public class Testrunner{
}