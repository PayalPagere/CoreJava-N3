package org.tnsif.WrapperClasessDemo;
//Auto and UnBoxing
public class WrapperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		Integer y=x;
		System.out.println(y);
		
		//Unboxing
		
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
	}

}
