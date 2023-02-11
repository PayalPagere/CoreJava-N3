package org.tnsif.MultilevelInheritance;

public class Nokia extends Android{
	
	private String version;
	public void accept()
	{
		System.out.println("The Nokia version is:"+version);
	}
	//Getters and Setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Nokia(String version) {
		super();
		this.version = version;
	}  
	public Nokia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
