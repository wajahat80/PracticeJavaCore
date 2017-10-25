package com.core.test;

public class TestCore {

	public TestCore() {
		System.out.println("Constructor: TestCore()");
	}

	public static void main(String[] args) {
		TestCore obj1 = new TestCore();
		
		Employee emp = new Employee("Raja", 1);
		emp.printEmployee();
		Employee emp2=null;
		try {
			emp2 = (Employee)emp.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		emp2.printEmployee();
		
		emp.id=5;
		emp.name="Wajahat";
		emp.printEmployee();
		emp2.printEmployee();
		
		
		
		// Arithmatic operator ++ and --
		obj1.arithmaticOperators();
		
			
		// fibonacci without recursion
		obj1.fibonacci();
	
		// fibonacci with recursion
		obj1.fibonacciWithRecursion(22);
		
	}
	
	// Arithmatic operator ++ and --
	public void arithmaticOperators(){
		int i=9; int j=10;
		System.out.println(j+--i); 
		System.out.println(j+i--);
		System.out.println(i--); 
		
		
		byte b = (byte)8;
		System.out.println(b>>2);
	}
	
	// fibonacci without recursion
	public void fibonacci(){
		int a = 0;
		int b= 1;
		int r = 0;
		while(r<25){
			if(r==0){
				System.out.print(a+" ");
				System.out.print(b+" ");
				
			}
			else{
				System.out.print(r+" ");
			}
			r=a+b;
			a = b;
			b=r;
		}
	}
	
	// fibonacci with recursion
	public void fibonacciWithRecursion(int num){
		if(num == 0){
			
		}
		else{
			fibonacciWithRecursion(num-1);
		}
	}

}
