package org.tnsif.Conditions;

import java.util.Scanner;

public class Demo_SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1/2/3/4");
		int a= sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("Kesariya");
			break;
		case 2:
			System.out.println("Calm Down");
			break;
		case 3:
			System.out.println("Bhediyaa");
			break;
		case 4:
			System.out.println("Jab we Met");
			break;
		default:
			System.out.println("Not Selected");
			
		}
		sc.close();

	}

}
