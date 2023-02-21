package org.tnsif.QueueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> obj=new PriorityQueue<>();
		obj.offer(67);
		obj.add(55);
		obj.offer(91);
		obj.add(15);
		//Queue is linear data structure
		//.add,.offer -for inserting
		//.poll, .remove- for deleting
		//System.out.println("Head Elements are: "+obj.head);
		obj.poll();
		System.out.println("Queue Elements are: "+obj);
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		System.out.println("Queue Elements are: "+obj);
	}

}
