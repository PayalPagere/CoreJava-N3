package org.tnsif.ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	
			int arr[]=new int[] {101,23,54};
			System.out.println("C2TC");
			System.out.println(arr[3]);
			try {
			int arr1[]=new int[] {101,23,54};
			//System.out.println("C2TC");
			System.out.println(arr1[4]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception 1 Block: ");
				
			}
		}
		catch(Exception e1){
			System.out.println("Exception 2 Block "+e1);
		}
		finally
		{
			//int res=12/0;
			//System.out.println(res);
			System.out.println("Finally Block");
		}
	}

}
