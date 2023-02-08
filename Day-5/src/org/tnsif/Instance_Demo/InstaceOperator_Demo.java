package org.tnsif.Instance_Demo;

import java.util.Scanner;

public class InstaceOperator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,address, age");
		String name=sc.nextLine();
		String address=sc.nextLine();
		int age=sc.nextInt();
		
		Child_instace c=new Child_instace();
		Child_instace c1=new Child_instace();
		c1.setName(name);
		c1.setAdress(address);
		c1.setAge(age);
		System.out.println(c1);
		System.out.println(c instanceof Instace_1);
		System.out.println(c1 instanceof Child_instace);
		sc.close();
	}

}
