package org.tnsif.Class_Object;

import java.util.Scanner;

public class Driver {

	Scanner sc=new Scanner(System.in);
	int id;
	String city;
	String customername;
	{
	System.out.println("Enter the Id:");
	int id=sc.nextInt();
	System.out.println("Enter the city:");
	String city=sc.nextLine();
	System.out.println("Enter the customername:");
	String customername=sc.nextLine();
	System.out.println(id+" "+city+" "+customername);
	}
}
