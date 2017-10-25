package com.core.test;

public class TestAssertion {

	public TestAssertion() {
		System.out.println("Constructor: TestCore()");
	}

	public static void main(String[] args) {
		TestAssertion obj1 = new TestAssertion();
		int a = 10;
		assert a<=0:"not valid";
		
		System.out.println("...");
	}

}
