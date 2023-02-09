package org.tnsif.StaticDemo;

public class Static_Variable {
	//static variable
    static String companyName="Bosch";
	//non static
	private String name;
	public Static_Variable(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Static_Variable [name=" + name + "]";
	}
	
}
