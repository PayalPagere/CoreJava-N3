package ThreadLifeCycle;
//Program to demonstrate on Thread life lifecycle
public class Tech extends Thread{
	public void run()
	{
		System.out.println("Java full stack Training");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			try
			{
				//sleep for 2s
				Thread.sleep(2);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Technical Session");
	}
}
