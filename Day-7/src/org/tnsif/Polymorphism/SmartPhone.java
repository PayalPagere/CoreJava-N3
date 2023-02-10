package org.tnsif.Polymorphism;
//Program to demonstrate on Method Overloading
public class SmartPhone {
	
	private int resolution;
	private String slotype;
	//overloading in terms of passing no of arguments
	void display(int resolution)
	{
		System.out.println("Camera Resolution:"+resolution);
	}
	void display(int resolution, String slottype)
	{
		System.out.println("Camera Resolution:"+resolution+",Slotype: "+slotype);
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlotype() {
		return slotype;
	}
	public void setSlotype(String slotype) {
		this.slotype = slotype;
	}
}
