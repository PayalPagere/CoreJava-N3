package org.tnsif.Assignment;

import java.util.Scanner;

public class Sum_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int sum=0,num=0;
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        
        while(n>0)
        {
        	num=n%10;
        	sum=sum+num;
        	n=n/10;
        }
        
        System.out.println(sum);
        sc.close();

	}

}
