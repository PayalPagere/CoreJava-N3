package org.tnsif.MultilevelInheritance;
//Parent class1
public class Android {
	//private Data Members
	private int modelno;
	public void display()
	{
		System.out.println("The model no is:"+modelno);
	}
	//default Constructor
	public Android()
	{
		System.out.println("Nokia Class");
	}
	//Parametrized Constructor
	public Android(int modelno) {
		super();
		this.modelno = modelno;
	}
	//Getters and Setters
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
}
