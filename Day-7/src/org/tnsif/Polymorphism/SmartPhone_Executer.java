package org.tnsif.Polymorphism;

import java.util.Scanner;

public class SmartPhone_Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Resolution and slotype");
		int resolution=sc.nextInt();
		sc.nextLine();
		String slottype=sc.nextLine();
		SmartPhone sm=new SmartPhone();
		sm.setResolution(resolution);
		sm.setSlotype(slottype);
		sm.display(resolution);
		sm.display(resolution, slottype);
		
		Multiplication m=new Multiplication();
		System.out.println(m.mul(11, 5));
		System.out.println(m.mul(5.2f, 3));
	}

}
