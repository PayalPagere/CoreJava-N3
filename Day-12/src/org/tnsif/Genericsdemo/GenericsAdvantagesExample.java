package org.tnsif.Genericsdemo;

import java.util.ArrayList;
//Program to demonstrate on Advantages of Generics
public class GenericsAdvantagesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Type-safety
		//without Generics
		ArrayList obj=new ArrayList<>();
		obj.add(4);
		obj.add("4");
		System.out.println("Without Generics"+obj);
		
		//With Generics
		ArrayList<Integer> obj1=new ArrayList<>();
		obj1.add(4);
		//obj1.add("4");
		System.out.println("With Generics"+obj1);
		
		//2.Typecasting not allowed before Generics
		ArrayList obj3=new ArrayList<>();
		obj3.add("MET");
		//typecasting
		String str=(String)obj3.get(0);
		System.out.println(str);
		
		//with generics,Typecasting is not allowed
		ArrayList<String> obj4=new ArrayList<>();
		obj4.add("MET");
		String str1=obj4.get(0);
		System.out.println(obj4);
		//Compile time 
	}

}
