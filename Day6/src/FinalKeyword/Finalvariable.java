package FinalKeyword;

public class Finalvariable {
	 static final int x =234;
	 public static void display() 
	 {
		 
		 //We can't change the value of x here as it is final
		 System.out.println("The value is:"+x);
	 }
	 public static void main(String args[])
	 {
		 Finalvariable.display();
	 }
}
