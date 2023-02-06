package org.tnsif.Assignment;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String x=Integer.toString(n);
        for(int i=0;i<x.length();i++){
            sum++;
        }
        System.out.println(sum);
        sc.close();
    }
}
