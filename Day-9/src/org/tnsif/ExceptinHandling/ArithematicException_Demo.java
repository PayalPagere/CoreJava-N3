package org.tnsif.ExceptinHandling;

import java.util.Scanner;

public class ArithematicException_Demo{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		try {
			int res=x/y;
			System.out.println("REsult is:"+res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handeled");	
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
