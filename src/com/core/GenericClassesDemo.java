package com.core;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesDemo {

	public static void main(String... args) {

		/*
		 * We have three class A, B and C as A is the superclass of B and C
		 */
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		B b1 = new B();
		B b2 = new B();
		C c1 = new C();
		
		// adding objects to List<A>
		List<A> lstA = new ArrayList<A>();
		lstA.add(a1);
		lstA.add(a2);
		lstA.add(a3);
		lstA.add(b1);
		lstA.add(b2);
		lstA.add(c1);
		

		// adding objects to List<B>
		List<B> lstB = new ArrayList<B>();
		//lstB.add(a1); // Error: only allowed B objects
		lstB.add(b1);
		lstB.add(b2);

		//// adding objects to List<C>
		List<C> lstC = new ArrayList<C>();
		// lstC.add(a1); // Error: only allowed C objects
		// lstC.add(b1); // Error: only allowed C objects
		lstC.add(c1);

		/*
		 * Above code clears that list of class A can accept the instance of class B and
		 * C though
		 */

		// Example: When processElements() accepts List<A>
		GenericClassesDemo.processElements(lstA);
		// GenericDemo.processElements(lstB); // Error: Only accepted List<A>
		// GenericDemo.processElements(lstC); // Error: Only accepted List<A>

		// Example: When processElements() accepts List<?>
		GenericClassesDemo.processElementsAnyType(lstA); // No error: Any type of list is accepted
		GenericClassesDemo.processElementsAnyType(lstB); // No error: Any type of list is accepted
		GenericClassesDemo.processElementsAnyType(lstC); // No error: Any type of list is accepted

		// Example: When processElements() accepts List<? extends A>
		// List of A or subclass of A is accepted
		GenericClassesDemo.processElementsExtends(lstA); // Accepted/ No error: List of A or subclass of A is accepted
		GenericClassesDemo.processElementsExtends(lstB); // Accepted/ No error: List of A or subclass of A is accepted
		GenericClassesDemo.processElementsExtends(lstC); // Accepted/ No error: List of A or subclass of A is accepted

		/*
		 * Example: When processElements() accepts List<? super A>. Only List of A or
		 * superclass of A is accepted
		 */
		GenericClassesDemo.processElementsSuper(lstA);
		// GenericDemo.processElementsSuper(lstB); // Error: only A or super type
		// GenericDemo.processElementsSuper(lstC); // Error: only A or super type

	}

	/*
	 * Generic is used when creating reusable code for a specific type The method is
	 * getting object of subclasses as well and hence Generic is getting failed so
	 * in this scenario we use Generic wildcard to avoid discrepencies at compile
	 * time
	 */
	// This method only excepts List<A>
	public static void processElements(List<A> elements) {
		for (A o : elements) {
			System.out.println(o.getValue());
		}
	}

	// There are three ways to define a collection (variable) using generic
	// wildcards.

	/*
	 * List<?> means a list typed to an unknown type. This could be a List<A>, a
	 * List<B>, a List<String> etc.
	 */
	public static void processElementsAnyType(List<?> elements) {
		for (Object o : elements) {
			System.out.println(((A) o).getValue());
		}
	}

	/*
	 * List<? extends A> means a List of objects that are instances of the class A,
	 * or subclasses of A (e.g. B and C).
	 */
	public static void processElementsExtends(List<? extends A> elements) {
		for (A a : elements) {
			System.out.println(a.getValue());
		}
	}

	/*
	 * List<? super A> means that the list is typed to either the A class, or a
	 * superclass of A.
	 */
	public static void processElementsSuper(List<? super A> elements) {
		for (Object o : elements) {
			System.out.println(((A) o).getValue());
		}
	}

}

/*
 * Suppose we have three classes as follows
 * 
 */
class A {

	String getValue() {
		return "getValue() of A";
	}
}

class B extends A {
	String getValue() {
		return "getValue() of B";
	}
}

class C extends A {
	String getValue() {
		return "getValue() of C";
	}
}