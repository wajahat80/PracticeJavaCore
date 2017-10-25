package com.core.multithreading;


class A extends Thread {
	public void run(){
		System.out.println("Class A in Thread Class");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminating run() in Class A");
	}
}

public class MultiThreadingByInherittingThread {

	public static void main(String[] args) {
		System.out.println("...Starting the main Program...");
		A obj1 = new A();
		obj1.start();
		System.out.println("...After The start calling in main()");
	}

}


