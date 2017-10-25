package com.core.java8.lamda;

public class ThreadWithLamda {

	
	public static void main(String[] args){
	
		Thread withouLamdaThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Print inside Runnable");
				
			}
		});
	
		withouLamdaThread.run();
		
		
		
		
		Thread lamdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		
		lamdaThread.run();
	}
		
		
	
	
	
}
