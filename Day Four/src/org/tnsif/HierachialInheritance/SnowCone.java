package org.tnsif.HierachialInheritance;

public class SnowCone extends AndroidVersion{
	
	private int version;

	//Getter and setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SnowCone(String type,int version) {
		super();
		this.version = version;
	}

	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
