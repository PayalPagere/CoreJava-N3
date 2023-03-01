package org.tnsif.application;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s1=new MMSavingAcc(AccNo,accNm,accBal,isSalaried);
		return s1;
	}


	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		
		MMCurrentAcc c1=new MMCurrentAcc(AccNo,accNm,accBal,creditLimit);
		return c1;
	}

}