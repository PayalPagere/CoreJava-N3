package org.tnsif.Genericsdemo;

class GenericMethod
{
	public static <E>void print(E[] elements)
	{
		for(E itr:elements)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}
public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod m=new GenericMethod();
		Integer[] array1= {10,20,30,40};
		Character[] array2= {'p','r','a','t'};
		
		m.print(array1);
		System.out.println(array1);
		m.print(array2);
		System.out.println(array2);
	}

}
