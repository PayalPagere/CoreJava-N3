package org.tnsif.StringDemo;

import java.util.Scanner;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//using String literal
		System.out.println("Enter the First String:");
		String str1=sc.nextLine();
		System.out.println("Your 1st String is:"+str1);
		System.out.println("Enter the Second String:");
		String str2=new String(sc.nextLine());
		System.out.println("Second String is:"+str2);
		
		//using == Operator
		//using Equals Operator .equals()
		if(str1.equals(str2))
		{
			System.out.println("Same");
		}
		else
			System.out.println("Different");
		
		char c[]={'H','e','l','l','o'};
		String str3=new String(c);
		System.out.println(str3);
	}

}
