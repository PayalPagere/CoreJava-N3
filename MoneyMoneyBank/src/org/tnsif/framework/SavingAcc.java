package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc{

	private boolean isSalaried;
	private static final float MINBAL=500.0f;
	//Constructor
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	public void withdraw(float accBal)
	{
		System.out.println("Acc no:"+this.getAccNo()+" "+" Acc Name:"+this.getAccNm()+" "+" Acc Bal:"+this.getAccBal()+" Min bal"+this.MINBAL);
	}
}
