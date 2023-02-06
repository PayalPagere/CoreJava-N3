package org.tnsif.Loops;

import java.util.Scanner;

public class Demo_loop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Number of Values you want:");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();
	}
    
}
