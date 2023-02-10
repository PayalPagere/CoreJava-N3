package org.tnsif.Polymorphism;
//driver class
// constructor overloading
import java.util.Scanner;

public class Constructor_Overloading_Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Speed and Color for Honda City");
		int speed= sc.nextInt();
		sc.nextLine();
		String color=sc.nextLine();
		Hondacity h=new Hondacity();
		Hondacity h1=new Hondacity(speed,color);
		//System.out.println("Speed is:"+speed);
		//System.out.println("Color is:"+color);
	}

}
