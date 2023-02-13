package org.tnsif.WrapperClasessDemo;
//using Command line Argument
public class WrapperClass_CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to TNSIF");
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int res=a*b;
		System.out.println(res);
	}

}
