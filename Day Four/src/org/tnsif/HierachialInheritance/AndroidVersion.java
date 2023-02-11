package org.tnsif.HierachialInheritance;

public class AndroidVersion {
	private String type;
	
	public AndroidVersion()
	{
		System.out.println("Parent class-Android version:");
		
	}
	//Getters and Setters

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//parameterzied Constructor
	public AndroidVersion(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
	
}
