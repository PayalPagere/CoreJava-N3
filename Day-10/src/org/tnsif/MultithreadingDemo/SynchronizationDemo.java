package org.tnsif.MultithreadingDemo;
public class SynchronizationDemo {
	void print(int num)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(num*i);
		}
		
	}
	class Thread1 extends Thread
	{
		SynchronizationDemo d;

		public Thread1(SynchronizationDemo d) {
			super();
			this.d = d;
		}
		void display()
		{
			d.print(10);
		}
	}
}