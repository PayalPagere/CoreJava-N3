package org.tnsif.HierachialInheritance;


public class Tiramisu extends AndroidVersion{
	public int version;
	//Getters and Setters
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version1) {
		this.version = version;
	}

	public Tiramisu(String type,int version) {
		super();
		this.version = version;
	}

	
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
