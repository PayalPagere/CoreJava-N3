package org.tnsif.Conditions;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	int b=sc.nextInt();
	if(a>b) {
		System.out.println("a is Greater");
	    }
	System.out.println("b is Greater");
	sc.close();
	}

}
