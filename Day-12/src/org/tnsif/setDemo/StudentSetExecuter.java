//Driver classss
//Program to demonstrate on user-defined Objects
package org.tnsif.setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecuter {
	
	//User-defined Method
	public static void addStudent(Set<Student>obj1 )
	{
		Student student1=new Student(101,"Payal",87.56f);
		Student student2=new Student(102,"Pallavi",35.0f);
		Student student3=new Student(103,"Sayali",0.00f);
		obj1.add(student1);
		obj1.add(student2);
		obj1.add(student3);
	}
	public static void main(String[] args) {
		Set<Student> obj1=new LinkedHashSet<Student>();
		addStudent(obj1);
		System.out.println(obj1);
	}
}
