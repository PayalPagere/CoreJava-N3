package org.tnsif.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//Program to demonstrate on difference between Hashset and LinkedHashset
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set1
		//Hashset will print the elements in unordered wise
		Set<Object>obj1= new HashSet<>();
		obj1.add(11);
		obj1.add("Naina");
		obj1.add(87.90f);
		obj1.add("Naina");
		System.out.println("Set elements are: "+obj1);
		
		//set2
		//Hashset will print the elements in Ordered wise
		Set<Object>obj2= new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Naina");
		obj2.add(87.90f);
		System.out.println("Set elements are: "+obj2);
		
	}

}
