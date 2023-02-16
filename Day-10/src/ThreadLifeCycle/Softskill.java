package ThreadLifeCycle;

public class Softskill extends Thread{
	synchronized public void run()
	{
		System.out.println("Professional Ethics");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("soft-skill Session");
	}
}
