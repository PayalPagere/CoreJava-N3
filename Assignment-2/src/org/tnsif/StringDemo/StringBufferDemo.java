package org.tnsif.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Shiwani");
		System.out.println(s1);
		//Capacity =16 +length of the String
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		String str;
		int a=34;
		s1=new StringBuffer(40);
		str=s1.append(a).toString();
		System.out.println(str);
		System.out.println(s1);
		System.out.println(s1.reverse());
	}

}
