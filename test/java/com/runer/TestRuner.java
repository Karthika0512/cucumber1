package com.runer;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources"}, glue= {"com.fb.stepdefinition"})
public class TestRuner {
	

}
