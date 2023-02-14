package org.tnsif.ExceptinHandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	
			try {
			int arr1[]=new int[] {101,23,54};
			//System.out.println("C2TC");
			System.out.println(arr1[4]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception 1 Block: "+e);
				
			}
			try {
				int x=10;
				int y=0;
				 int res=x/y;
				//System.out.println("C2TC");
				System.out.println(res);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Exception 2 Block: "+e);
					
				}
		}
		finally
		{
			//int res=12/0;
			//System.out.println(res);
			System.out.println("Finally Block");
		}
	}
	}

