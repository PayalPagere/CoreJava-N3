package org.tnsif.setDemo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet is used to sort the elements in Increasing order
		SortedSet<Integer>obj=new TreeSet<>();
		obj.add(45);
		obj.add(1);
		obj.add(34);
		System.out.println(obj);
	}

}
