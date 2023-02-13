package org.tnsif.StringDemo;
//Program to demonstrate on String Comparison
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating using Literal
		String s1="TNSIF";
		String s2="TNSIF";
		
		//uding new Operator
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
	}

}
