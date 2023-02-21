package org.tnsif.Genericsdemo;

class GenericClass<T> {
	T x;
	//to add the elements in the generic class
	void display(T x)
	{
		this.x=x;
		
	}
	//to return elements
	T accept()
	{
		return x;
	}
}
public class GenericClassDemo{
	public static void main(String args[])
	{
		GenericClass<String>obj1 =new GenericClass<>();
		obj1.display("TechnoServe India");
		System.out.println(obj1.accept());
	}
}
