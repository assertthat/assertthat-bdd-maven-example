package com.assertthat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {

    @Given("I add some meaningful step definishions instead of this dummy one")
    public void i_add_some_meaningful_step_definishions_instead_of_this_dummy_one() {
        boolean stepDefsCreated = true;
        assertTrue(stepDefsCreated);
    }

    @When("I run the framework with mvn integration-test goal")
    public void i_run_the_framework_with_mvn_integration_test_goal() {
        boolean testsRun = true;
        assertTrue(testsRun);
    }

    @Then("I see cucumber test report on AssertThat reporting dashboard")
    public void i_see_cucumber_test_report_on_AssertThat_reporting_dashboard() {
        boolean reportSubmitted = true;
        assertTrue(reportSubmitted);
    }

}