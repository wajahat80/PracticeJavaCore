package com.core.constructors;

public class MyMain {

	public static void main(String[] args) {
		System.out.println("-----------Parent p = new Child()-----------");
		Parent p = new Child();
		
		System.out.println("-----------Parent p2 = new Parent()-----------");
		Parent p2 = new Parent();
		
		System.out.println("-----------GrandParent g1 = new Child()-----------");
		GrandParent g1 = new Child();
		
		System.out.println("-----------GrandParent g2 = new Parent()-----------");
		GrandParent g2 = new Parent();
		
		System.out.println("-----------Child c = new Child()-----------");
		Child c = new Child();
		
	}

}
