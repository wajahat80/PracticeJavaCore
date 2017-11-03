package com.core;

/* 
 * an abstract class is one which implements functionality of an interface or abstract class, 
 * at the time of development. In this demo, we have an interface (Iface) and an abstract class(MyAbstractClass) defined in AnonymousDemo.class and
 * then we implemented the functions in (runtime/development time) i.e. methods involved, useIface, useMyAbstractClass and useMyAbstractClass2
 * 
 * Few other important facts concerning anonymous classes: 
 * *******************************************************
 * An anonymous class cannot have a constructor. Thus, you cannot pass parameters to an anonymous class when you instantiate it. 
 * An anonymous class can access any variables visible to the block within which the anonymous class is declared, including local variables. 
 * An anonymous class can also access methods of the class that contains it.
*/
public class AnonymousAbstractDemo {

	public static void main(String... strings) {
		AnonymousAbstractDemo a = new AnonymousAbstractDemo();
		a.useIface();

		int sum = a.useMyAbstractClass(5, 9);
		System.out.println("Sum..." + sum);

		int sum2 = a.useMyAbstractClass2(3, 4);
		System.out.println("Sum of squares of input..." + sum2);
	}

	String demoVar = "Demo...";

	// an interface with one method
	interface Iface {
		public void print();
	}

	// an abstract class with one abstract method
	abstract class MyAbstractClass {
		public abstract int sum(int i, int j);

		public void hello() {
			System.out.println("Hello!");
		}
	}

	/*
	 * Here we will use the interface to provide runtime implementation and hence an
	 * anonymous class
	 */
	public void useIface() {

		// implementation/functionality here at the time of usage
		Iface i = new Iface() {

			@Override
			public void print() {
				System.out.println(demoVar + "Here you can define your implementation");
				;
			}
		};

		i.print();
	}

	public int useMyAbstractClass(int x, int y) {

		// implementation/functionality here at the time of usage
		MyAbstractClass myAbs = new MyAbstractClass() {

			@Override
			public int sum(int i, int j) {
				// TODO Auto-generated method stub
				return i + j;
			}

			@Override
			public void hello() {
				System.out.println("Hello useMyAbstractClass!");
			}
		};
		myAbs.hello();
		return myAbs.sum(x, y);
	}

	public int useMyAbstractClass2(int x, int y) {

		// implementation/functionality here at the time of usage
		MyAbstractClass myAbs = new MyAbstractClass() {

			@Override
			public int sum(int i, int j) {
				// TODO Auto-generated method stub
				return (i * i) + (j * j);
			}

			@Override
			public void hello() {
				System.out.println("Hello Class2!");
			}
		};
		myAbs.hello();
		return myAbs.sum(x, y);
	}
}
