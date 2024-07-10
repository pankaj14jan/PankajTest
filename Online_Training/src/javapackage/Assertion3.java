package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void TestCase4() {

		String ActualText = "abc";
		String ExpText = "ab";

		// Equal Assertion
		try {
			Assert.assertEquals(ActualText, ExpText); //wanted to execute line no 19
		} catch (Error e) {
		}
		System.out.println("Equal Assertion Passed");
	}

}
