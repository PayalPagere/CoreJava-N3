package org.tnsif.ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Line");
		
		try {
			int[] arr= {0,9,87,6};
			print(arr);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Handeled");
		}
	}

	private static void print(int[] arr) {
		System.out.println("The value of 5th is:"+arr[3]);
		
	}

}
