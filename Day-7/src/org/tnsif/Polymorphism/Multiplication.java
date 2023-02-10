package org.tnsif.Polymorphism;

public class Multiplication {
	
	//Method Overloading in terms of Changing the datatype
	int mul(int x,int y) {
		return x*y;
	}
	int mul(float x,int y)
	{
		return (int) (x*y);
	}
	
	
	
}
