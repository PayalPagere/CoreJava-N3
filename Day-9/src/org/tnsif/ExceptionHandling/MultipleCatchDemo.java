package org.tnsif.ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,16,56};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try
		{
			int res=x/y;
			System.out.println(res);
			System.out.println();
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
