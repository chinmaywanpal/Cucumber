package com.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.test.app.Calculator;

/**
 * Unit test for simple App.
 */

public class AppTest {

	Calculator calTst;

	@org.junit.Test
	public void testAdd() {
		calTst = new Calculator(3, 2);
		assertThat("Numbers do not match", calTst.add(), equalTo(new Float(5)));
	}

	@org.junit.Test
	public void testsub() {
		calTst = new Calculator(3, 2);
		assertThat("Numbers do not match", calTst.subtract(),
				equalTo(new Float(1)));
	}

	@org.junit.Test
	public void testmul() {
		calTst = new Calculator(3, 2);
		assertThat("Numbers do not match", calTst.multiply(),
				equalTo(new Float(6)));
	}

	@org.junit.Test
	public void testdiv() {
		calTst = new Calculator(3, 2);
		assertThat("Numbers do not match", calTst.devide(), equalTo(new Float(
				1.5)));
	}

}
