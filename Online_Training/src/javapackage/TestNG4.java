package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	// @Test - 1st way
	public void a() {
		System.out.println("a test method");
	}

	// 2nd way -widely used in market to skip test case
	@Test(enabled = false)
	public void b() {
		System.out.println("b test method");
	}

	@Test(enabled = true)
	public void c() {
		System.out.println("c test method");
	}

	// InvocationCount - 2 times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("d test method");
	}

	// InvocationCount - 0 times - skip the execution
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("e test method");
	}

	// condtional skiping
	public void f() {
		System.out.println("f test method");
		throw new SkipException("Skiping f test method");
	}
}
