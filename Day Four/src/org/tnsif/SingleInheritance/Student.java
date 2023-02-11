package org.tnsif.SingleInheritance;

public class Student extends Citizen {
	
	
	private int rollno;
	private String studname;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String adharno, String city, long mobileno, int rollno, String studname) {
		super(name, adharno, city, mobileno);
		// TODO Auto-generated constructor stub
		this.rollno =rollno;
		this.studname=studname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getName()=" + getName() + ", getAdharno()="
				+ getAdharno() + ", getCity()=" + getCity() + ", getMobileno()=" + getMobileno() + "]";
	}
	
	
	
}
