package org.tnsif.Super_Demo;

public class Flower {
	private String flowername;

	public String getFlowername() {
		return flowername;
	}

	public void setFlowername(String flowername) {
		this.flowername = flowername;
	}

	public Flower() {
		System.out.println("Flower-parent class");
		// TODO Auto-generated constructor stub
	}

	public Flower(String flowername) {
		super();
		this.flowername = flowername;
	}
	
}
