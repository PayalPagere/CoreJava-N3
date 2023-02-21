package org.tnsif.QueueDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
	public static void main(String args[])
	{
		Deque<String>obj=new ArrayDeque<>();
		obj.add("Pratik");
		obj.addFirst("Vrush");
		obj.addLast("Saurav");
		System.out.println("Array Deque  elements are:"+obj);
		//Extract the elements from Deque
		for(String itr:obj)
		{
			System.out.print(itr+" ");
		}
		obj.removeFirst();
		System.out.println("Array Deque  elements are:"+obj);
		obj.removeLast();
		System.out.println("Array Deque  elements are:"+obj);
		obj.remove();
		System.out.println("Array Deque  elements are:"+obj);
	}
}
