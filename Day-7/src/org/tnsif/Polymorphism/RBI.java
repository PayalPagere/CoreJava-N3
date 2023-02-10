package org.tnsif.Polymorphism;
//to demonstarate the program on method overriding
//parent class
public class RBI {
	float getInterest()
	{
		return 10.8f;
	}
	/*float getInterest()
	{
		return 10.8f;
	}*/
	//If we use method overriding in same class we gets an error ,
	//we have to use Inheritance to achieve this Method Overriding
}
