package org.tnsif.ExceptinHandling;
//Progarm to demonstrate on TRY catch finally block
public class FinalllyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{	
			int arr[]=new int[] {101,23,54};
			System.out.println("C2TC");
			System.out.println(arr[3]);
			//System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
		finally
		{
			int res=12/0;
			System.out.println(res);
			System.out.println("Finally Block");
		}
	}

}
