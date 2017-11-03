package com.core;

public class NestedStaticClass {

	public static void main(String[] a) {
		int i1[] = { 1, 3, 4 };
		int i2[] = { 1, 3, 5, 4, 2 };

		NestedStaticClass t = new NestedStaticClass();

		t.test("Hello!");

	}

	public void test(String arg) {
		System.out.println("Input Argument is: " + arg);

	}

	public class B {

		public void test(String arg) {
			System.out.println("Input Argument is: " + arg);

		}

	}
}
