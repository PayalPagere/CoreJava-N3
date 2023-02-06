package org.tnsif.Conditions;

import java.util.Scanner;

public class Demo_Nested_IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mention your Age and Weight");
		int age= sc.nextInt();
		int wht=sc.nextInt();
		if(age>12) {
			if(wht>=40) {
				if(wht<120) {
					System.out.println("You are Eligible");
				}
				else {
					System.out.println("Weight is moer!!Ropes will be Needed!");
				}
			}
			else {
				System.out.println("Opps! Low Weight");
			}
		}
		else {
			System.out.println("Oops! Low Age");
		}
		sc.close();
	}

}
