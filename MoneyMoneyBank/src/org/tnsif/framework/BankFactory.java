package org.tnsif.framework;

import org.tnsif.application.MMCurrentAcc;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int AccNo,String accNm,float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,float creditLimit);
	/*public abstract CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal) {
		// TODO Auto-generated method stub
		return null;
	}*/
}