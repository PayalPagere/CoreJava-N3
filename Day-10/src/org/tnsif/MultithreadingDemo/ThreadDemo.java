package org.tnsif.MultithreadingDemo;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread: "+t);
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted: ");
			
		}
		System.out.println("Payal");
	}

}
