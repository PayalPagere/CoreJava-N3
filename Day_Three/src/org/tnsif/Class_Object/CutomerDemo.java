package org.tnsif.Class_Object;

import java.util.Scanner;

public class CutomerDemo {

	public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,city,Custname");
		int id;
		String city,custname;
		System.out.println("Enter the id");
		id=sc.nextInt();
		
		System.out.println("Enter the city:");
		 city=sc.nextLine();
		System.out.println("Enter the customername:");
		custname=sc.nextLine();
		
		Customer c1=new Customer();
		c1.setId(id);
		//c1.getId(id);
		//c1.setId(city);
		//c1.setId(custname);
		System.out.println(id+" "+city+" "+custname);
		sc.close();
	}

}
