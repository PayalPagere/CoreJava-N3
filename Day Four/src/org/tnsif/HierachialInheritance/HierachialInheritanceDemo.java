package org.tnsif.HierachialInheritance;

import java.util.Scanner;

public class HierachialInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type and Version:");
		String type=sc.nextLine();
		int version=sc.nextInt();
		int version1=sc.nextInt();
		SnowCone s1=new SnowCone(type,version);
		s1.setType(type);
		s1.setVersion(version);
		
		Tiramisu t=new Tiramisu(type,version1);
		t.setType(type);
		t.setVersion(version1);
		
		System.out.println(s1);
		System.out.println(t);
	}

}
