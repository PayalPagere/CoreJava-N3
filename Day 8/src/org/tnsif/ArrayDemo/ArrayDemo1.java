package org.tnsif.ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
//Array elements by taking User Input
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n=sc.nextInt();
		System.out.println("Enter Array elements:");
		int arr[]=new int[n];
		/*for(int i=0;i<n;i++)
		{
			//System.out.println();
			arr[i]=sc.nextInt();
			
		}
		System.out.println("The Elements you Entered are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);	
		}
		Arrays.sort(arr);
		System.out.println("Sorted Values are:");
		for(int itr:arr)
		{
			System.out.print(itr+" ");
		}*/
		for(int value:arr)
		{
			System.out.println(sc.nextInt());
		}
		for(int itr:arr)
		{
			System.out.println(itr);
		}
	}

}
