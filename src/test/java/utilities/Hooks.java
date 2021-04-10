package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before(order = 0)
	public void beforeMethod() {
		System.out.println("======Before Hooks===========");
	}

	@After(order = 0)
	public void afterMethod() {
		System.out.println("======After Hooks===========");
	}

	@Before(order = 1)
	public void setUp() {
		System.out.println("======Before Scenario Starts===========");
	}

	@After(order = 0)
	public void tearDown() {
		System.out.println("======After Every Scenario===========");
	}
}
