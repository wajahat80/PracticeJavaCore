package com.core;

public class NestedNonStaticOrInnerClass {

	int outerNonStaticVariable = 1; // An non-static variable of outer class
	static int outerStaticVariable = 4; // A static variable in outer class

	public void method_Public() {
		System.out.println("A public method - Super Class");
	}

	private void method_Private() {
		System.out.println("A private method - Super Class");
	}

	private void method_Protected() {
		System.out.println("A protected method - Super Class");
	}

	void method_NoAccessModifier() {
		System.out.println("A method with no access modifier - Super Class");
	}

	void accessingStaticNestedClass() {
		NestedNonStaticOrInnerClass.StaticInnerClass innerClassObject = new NestedNonStaticOrInnerClass.StaticInnerClass();

		innerClassObject.method_Public();
		innerClassObject.method_Protected();
		innerClassObject.method_Private();
		innerClassObject.method_NoAccessModifier();

		NestedNonStaticOrInnerClass.StaticInnerClass.method_Static_Public();
		// or StaticInnerClass.method_Static_Public();

		StaticInnerClass.method_Static_Private();
		StaticInnerClass.method_Static_Protected();
		StaticInnerClass.method_Static_NoAccessModifier();

		// innerStaticVariable = 4; // Error: inner class static variable can
		// not be used directly/without class reference
		StaticInnerClass.innerStaticVariable = 4;

		innerClassObject.innerNonStaticVariable = 5;
		// StaticInnerClass.innerNonStaticVariable = 4; // Error: inner class
		// non static variable can only be access through instance of the inner
		// class

	}

	static private class StaticInnerClass {

		// An non-static variable of inner class
		int innerNonStaticVariable = 0;

		// A static variable in inner class
		static int innerStaticVariable = 2;

		NestedNonStaticOrInnerClass outerClassObject = new NestedNonStaticOrInnerClass();

		public void method_Public() {
			System.out.println("A public method - Inner Class");
		}

		private void method_Private() {
			System.out.println("A private method - Inner Class");
		}

		private void method_Protected() {
			System.out.println("A protected method - Inner Class");
		}

		void method_NoAccessModifier() {
			System.out.println("A method with no access modifier - Inner Class");
		}

		public static void method_Static_Public() {
			System.out.println("A static public method - Inner Class");
		}

		private static void method_Static_Private() {
			System.out.println("A static private method - Inner Class");
		}

		private static void method_Static_Protected() {
			System.out.println("A static protected method - Inner Class");
		}

		static void method_Static_NoAccessModifier() {
			System.out.println("A static method with no access modifier - Inner Class");
		}

		public void accessingSuperClass() {

			// Cannot make a static reference to the non-static field
			// outerNonStaticVariable = 2;

			// Since i is static variable therefore it is allowed here
			outerStaticVariable = 5;

			outerClassObject.outerNonStaticVariable = 8;

			outerClassObject.method_Public();
			outerClassObject.method_Protected();
			outerClassObject.method_Private();
			outerClassObject.method_NoAccessModifier();

		}

	}

	public static void main(String[] a) {

		// Create an object of outer class
		NestedNonStaticOrInnerClass outerClassObject = new NestedNonStaticOrInnerClass();
		outerClassObject.accessingStaticNestedClass();

		NestedNonStaticOrInnerClass.StaticInnerClass innerClassObject = new NestedNonStaticOrInnerClass.StaticInnerClass();
		innerClassObject.accessingSuperClass();

	}

}
