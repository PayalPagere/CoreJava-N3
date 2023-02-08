package org.tnsif.Instance_Demo;

public class Instace_1 {
	private String name;
	private String adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Instace_1 [name=" + name + ", adress=" + adress + "]";
	}
	public Instace_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instace_1(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	

}
