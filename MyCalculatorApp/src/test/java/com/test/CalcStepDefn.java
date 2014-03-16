package com.test;

import org.junit.Assert;

import com.test.app.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcStepDefn {

	Calculator calc;
	float temp;

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_and(String num1, String num2) throws Throwable {
		calc = new Calculator(Float.valueOf(num1), Float.valueOf(num2));

		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
	}

	@When("^I add them together$")
	public void I_add_them_together() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		temp = calc.add();
	}

	@When("^I subtract numbers$")
	public void I_subtract_numbers() throws Throwable {
		temp = calc.subtract();
	}

	@When("^I multiply numbers$")
	public void I_multiply_numbers() throws Throwable {
		temp = calc.multiply();
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
	}

	@Then("^the result is \"([^\"]*)\"$")
	public void the_result_is(String result) throws Throwable {
		// Express the Regexp above with the code you wish you had
		Assert.assertEquals(new Float(temp), Float.valueOf(result));
	}

}
