package org.tnsif.Operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Addtion"+(x+y));
		System.out.println("Subtracion"+(x-y));
		System.out.println("Multiplication"+(x*y));
		System.out.println("Division"+(x/y));
		System.out.println("Modulus"+(x%y));
		//------------Realtional 
		boolean res=x>y;
		
		//-------Assignment Operator
		x*=y;
		//--------Logical
		boolean res1=(5==5)&&(5>3);
		boolean res2=(5==5)||(5>3);
		boolean res3=!(5==4);
		//------Bitwise
		int a=12 & 5;
	 	int b=12 | 5;
	 	int c=2^5;
	 	//---------Ternary Operator
	 	String res6=(12%2==0)?"Even":"Odd";
	 	//---------Increment and Decrement
	 	int p=x++;
	 	int q=--x;
	 	
	} 

}
