package org.tnsif.MultithreadingDemo;

public class ThreadExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThreadProgram n=new SimpleThreadProgram();
		n.setName("Java Program");
		n.setPriority(8);
		/* when it calls the method it will come to run 
		  method */
		n.start();
		n.run();
		//n.start();
		System.out.println("Current Thread"+n);
	}

}
