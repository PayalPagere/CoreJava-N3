package org.tnsif.StaticDemo;

import java.util.Scanner;

public class StaticBlock{
	private static int num;
	private static String name;
	static {
		name="Payal";
	}
	static Scanner sc=new Scanner(System.in);
	public static void accept() {
		System.out.println("Enter you salary"+sc.nextInt());
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		StaticBlock.name = name;
	}

}
