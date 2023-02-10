package org.tnsif.Polymorphism;
//child class
public class SBI extends RBI{
	float getInterest()
	{
		System.out.println("Interest for RBI: "+super.getInterest());
		System.out.print("Interest for SBI: ");
		return 12.8f;
	}
}
