package org.tnsif.Polymorphism;

//Program to demonstrate constructor overloading

public class Hondacity {
	private int speed;
	private String colour;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	//this is constructor overloading
	//no argument vala constructor
	public Hondacity() {
		System.out.println("I like to drive a HondaCity:");
		// TODO Auto-generated constructor stub
	}
	public Hondacity(int speed, String colour) {
		super();
		this.speed = speed;
		this.colour = colour;
		System.out.println("Speed:"+speed+" Color:"+colour);
	}
	
	
}
