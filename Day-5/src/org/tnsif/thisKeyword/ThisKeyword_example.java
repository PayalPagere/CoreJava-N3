package org.tnsif.thisKeyword;

public class ThisKeyword_example {
 int num;
 ThisKeyword_example(){
 }
 ThisKeyword_example(int num){
	 this.num=num;
 }


public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThisKeyword_example t=new ThisKeyword_example(5);
	System.out.println("Num value:"+t.num);
}

}
