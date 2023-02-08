package org.tnsif.Instance_Demo;

public class Child_instace extends Instace_1 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child_instace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child_instace(String name, String adress) {
		super(name, adress);
		// TODO Auto-generated constructor stub
	}

	public Child_instace(String name, String addresss, int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child_instace [age=" + age + ", getName()=" + getName() + ", getAdress()=" + getAdress() + "]";
	}
	
}
