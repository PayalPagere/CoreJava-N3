package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMCurrentAcc extends SavingAcc{
	private static final float MINBAL=0.0f;
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	
	
	
}