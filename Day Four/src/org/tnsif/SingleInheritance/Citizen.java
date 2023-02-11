package org.tnsif.SingleInheritance;

public class Citizen {
	
	private String name;
	private String adharno;
	private String city;
	private long mobileno;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Citizen(String name, String adharno, String city, long mobileno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mobileno = mobileno;
	}
	public Citizen() {
		System.out.println("Parent class");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mobileno=" + mobileno + "]";
	}
	
	
	
}
