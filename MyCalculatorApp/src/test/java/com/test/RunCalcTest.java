package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:calcu.feature" }, format = { "json:target/cucumber.json" })
public class RunCalcTest {

}
