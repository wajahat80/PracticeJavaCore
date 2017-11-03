package com.core;

/*
 * This program demonstrate how can be a method define with variable number of arguments
 * This is called Varargs and the value is passed as an array of objects
 */
public class MethodWithIndefiniteArguments {

	public static void main(String... args) {

		MethodWithIndefiniteArguments.myIndefiniteArgsExample(232, 23224, 232, 2323, 1, 3, 4);
		MethodWithIndefiniteArguments.myIndefiniteArgsExample(1, 3, 4);

	}

	public static void myIndefiniteArgsExample(int... arg) {
		for (int i = 0; i < arg.length; i++) {
			System.out.println(arg[i]);
		}
		;
	}

}
