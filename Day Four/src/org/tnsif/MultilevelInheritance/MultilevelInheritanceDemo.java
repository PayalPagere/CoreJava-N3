package org.tnsif.MultilevelInheritance;

import java.util.Scanner;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the modelno,Version, slotype");
		int modelno=sc.nextInt();
		sc.nextLine();
		String version=sc.nextLine();
		String slottype=sc.nextLine();
		IPhone i=new IPhone();
		IPhone i1=new IPhone(modelno,version,slottype);
		i1.setModelno(modelno);
		i1.setSlottype(slottype);
		i1.setVersion(version);
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);
	}

}
