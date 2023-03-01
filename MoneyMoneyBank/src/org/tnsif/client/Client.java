package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {
	public static void main(String args[])
	{
		BankFactory b=new MMBankFactory();
		MMCurrentAcc c=new MMCurrentAcc(54535,"Pratik",15000.0f,5.0f);
		MMSavingAcc s=new MMSavingAcc(13223,"Payal",1000.0f,true);
		System.out.println("Saving Account");
		System.out.println(s);
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		System.out.println(c);
		c.withdraw(c.getAccBal());
		
	}
}