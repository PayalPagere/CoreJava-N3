package org.tnsif.ExceptinHandling;

import java.io.IOException;

public class ThrowKeyword {
	static void donate(int age,int weight) throws Exception
	{
		if(age>18 && weight>50)
			System.out.println("Eligible to Donate Blood");
		else
			throw new IOException("Not Eligible");
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
			donate(17,55);
		}
		catch(IOException e)
		{
				System.out.println(e);
		}
	}

}
