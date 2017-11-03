package com.core;

public class FibonacciByRecursion {

	/*int r = 0, n1 = 0, n2 = 1;
	int limit = 60;
	int idx = 2;
	public void fibonacci(int n) {
		while(r<=limit){
			if(r==0){
				System.out.println(n1);
				System.out.println(n2);
				r=n1+n2;
				n1=n2;
				n2=r;
			}
			else{
				System.out.print(idx+++" -  ");
				System.out.println(r);
				r=n1+n2;
				n1=n2;
				n2=r;
				fibonacci(r);
			}
			

		}
	
	}*/
	
	/*
	 * This program will return the value at any index of fibonacci series. e.g. index 0 then value of n=5
	 */
	int fib(int n){
		if(n<=0)
			return 0;
		else if(n == 1)
			return 1;
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		FibonacciByRecursion obj = new FibonacciByRecursion();

		// To find value at any index
		System.out.println("AT 7 ...."+obj.fib(7));
		
		
		// To print serial till the value is less than input limit.
		int limit = 60;
		int counter=0;
		int result=0;
		while((result=obj.fib(counter)) <= limit){
			System.out.println(result);
			counter++;
		}
	
		// To find sum of values of first n number
		int indexNo = 5;
		
		int idx = 0;
		int sumValue=0; 
		
		while(idx < indexNo){
			sumValue = sumValue+ obj.fib(idx);
			idx++;
		}
	
		System.out.println("The Sum of First "+indexNo+" is "+sumValue);
	
	
	
	
	}
	
	
	
}

/*
 * 
 * 0 1 1 2 3 5 8 13 21 34 55
 * 
 * r = n1 + n2;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */