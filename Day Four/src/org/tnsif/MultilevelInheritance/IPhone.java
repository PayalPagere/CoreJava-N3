package org.tnsif.MultilevelInheritance;

public class IPhone extends Nokia{
	
	private String slottype;
	
	public void slot()
	{
		System.out.println("Slottype is:"+slottype);
	}
	//Getter and Setter

	public String getSlottype() {
		return slottype;
	}

	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}

	public IPhone(int modelno, String version, String slottype2) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IPhone(String slottype) {
		
		super(slottype);
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "IPhone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
	
}
