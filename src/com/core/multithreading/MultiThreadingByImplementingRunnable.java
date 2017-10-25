package com.core.multithreading;


class B implements Runnable{
	
	public void run(){
		System.out.println("Starting run() in Class B");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminating run() in Class B");
	}
	
}

public class MultiThreadingByImplementingRunnable {

	public static void main(String[] args) {
		System.out.println("...Starting the main Program...");
		
		Runnable obj1 = new A();
		Thread t = new Thread(obj1);
		t.start();
		
		System.out.println("...After The start calling in main()");
	}

}


