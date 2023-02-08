package org.tnsif.Super_Demo;

public class Rose extends Flower{
	
	private String flowername;

	public String getFlowername() {
		return flowername;
	}

	public void setFlowername(String flowername) {
		this.flowername = flowername;
	}

	public Rose() {
		System.out.println("Flower-parent class");
		// TODO Auto-generated constructor stub
	}

	public Rose(String flowername) {
		super();
		this.flowername = flowername;
	}
	public void display()
	{
		System.out.println(flowername);
		super.setFlowername("Flower");
		System.out.println(super.getFlowername());
	}
}
