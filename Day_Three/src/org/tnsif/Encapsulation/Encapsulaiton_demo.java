package org.tnsif.Encapsulation;

import java.util.Scanner;

public class Encapsulaiton_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a pin of Your choice");
		HDFC a= new HDFC();
		a.setPin(sc.nextInt());
		System.out.println(a.getPin());
		System.out.println("Your pin is Successfully Updated");
		a.accept();
	}

}
