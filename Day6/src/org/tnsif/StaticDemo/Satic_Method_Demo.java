package org.tnsif.StaticDemo;
//Program to demonstrate on Static method 
public class Satic_Method_Demo {
	//Nonstatic method
	private static double salary=45000.0;
	static void display() 
	{
		System.out.println("Salalry is:"+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary1(double salary) {
		this.salary = salary;
	}
	public void setSalary(double salary2) {
		// TODO Auto-generated method stub
		
	}
}
