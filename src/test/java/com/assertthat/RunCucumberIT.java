package com.assertthat;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/report/surefire-reports/cucumber/cucumber.json"})
public class RunCucumberIT {
}