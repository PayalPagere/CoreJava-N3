package org.tnsif.ArrayDemo;

import java.util.Scanner;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student arr[];
		System.out.println("Enter the number of Elements in the array:");
		int n=sc.nextInt();
		arr=new Student[n];
		int i=0;
		while(i<n)
		{
		arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
		i++;
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j].getRollno()+" "+arr[j].getName()+" "+arr[j].getPercentage());
		}
	}

}
