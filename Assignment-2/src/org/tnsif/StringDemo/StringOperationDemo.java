package org.tnsif.StringDemo;
//Program to Demonstrate different String Operation
public class StringOperationDemo {
	public static void main(String[] args)
	{
		String s1=new String("BHujbal");
		String s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(4,7));
		System.out.println(s1.isEmpty());
	}
}
