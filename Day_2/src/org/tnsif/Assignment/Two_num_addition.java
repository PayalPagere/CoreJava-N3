package org.tnsif.Assignment;

import java.util.Scanner;

public class Two_num_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci Series
		int n1=0,n2=1;
		int n3;
		//int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last value");
		int n=sc.nextInt();
		System.out.print(n1+","+n2+",");
		for(int i=2;i<n;i++) {
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		System.out.print(n3+",");  
		sc.close();
		}
		
	}

}
