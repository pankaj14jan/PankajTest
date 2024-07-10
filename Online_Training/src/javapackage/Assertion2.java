package javapackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testCase2() {

		String ActualText = "ab";
		String ExpText = "ab";

		int a = 10;
		int b = 20;

		// Equal Assertion
		Assert.assertEquals(ActualText, ExpText, "Actual and Expected are not matching"); // Wanted to pass any custom
																							// message in console
		System.out.println("Equal Assertion Passed");

		// False Assertion
		Assert.assertFalse(a > b, "Assertion False is not Satisfying");
		System.out.println("False Assertion Verified");

		// True Assertion
		Assert.assertTrue(a > b, "Assertion true is not Satisfying");
		//Assertion Failed, Execution will stop here
		System.out.println("True Assertion Verified");
	}
	@Test
	public void Testcase3() {
		//Assertion is written in Testcase2 method
		//Scope of Assertion will be limited to Testcase2 method only
		System.out.println("Hello Testcase3() method");
	}
}
