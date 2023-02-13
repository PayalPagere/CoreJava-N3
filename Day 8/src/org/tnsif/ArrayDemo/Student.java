package org.tnsif.ArrayDemo;
//Program to Demonstrate on array 
public class Student {
	private int rollno;
	private String name;
	private float percentage;
	//Getters and Setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	//Parameterized Constructor
	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	//Default Constructor
	
	
}
