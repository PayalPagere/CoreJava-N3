package org.tnsif.Assignment;

import java.util.Scanner;

public class Factorial_recursion {
    static int factorial(int num) {
    	if(num!=0)
    		return num*factorial(num-1);
    	return 1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter th number:");
		int n=sc.nextInt();
		System.out.println("factorial of Number:"+factorial(n));
		sc.close();
	}

}
