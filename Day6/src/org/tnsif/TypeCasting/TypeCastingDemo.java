package org.tnsif.TypeCasting;

//Program to demonstrate type Casting

public class TypeCastingDemo {
	//Implicit Type casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		float y=x;
		//Implicit conversion
		System.out.println("The value of y is:"+y);
		double d=12.5;
		//Explicit conversion
		long l=(long) d;
		System.out.println("The value of l is:"+l);
	}

}
