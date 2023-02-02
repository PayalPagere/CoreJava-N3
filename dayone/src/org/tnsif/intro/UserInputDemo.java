package org.tnsif.intro;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	/*int x=sc.nextInt();
	float y=sc.nextFloat();
	double z=sc.nextDouble();*/
	//char ch=sc.next().charAt(0);
	String str=sc.nextLine();
    //System.out.println("Integer value:"+x);
    //System.out.println("Float value:"+y);
    //System.out.println("Double value:"+z);
    //System.out.println("Character  value:"+ch);
    System.out.println("String value:"+str);
    sc.close();
	}

}
