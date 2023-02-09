package org.tnsif.StaticDemo;

public class Staticblock_Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticBlock.getName());
		StaticBlock s=new StaticBlock();
		//s.accept();
		s.setNum(21);
		System.out.println(s.getNum());
	}

}
