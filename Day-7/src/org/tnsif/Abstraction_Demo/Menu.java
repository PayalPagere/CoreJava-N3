package org.tnsif.Abstraction_Demo;

public abstract class Menu {

	abstract void recipe();
	abstract void salad();
	//Concrete method
	
	void menuType() {
		System.out.println("Non Veg");
	}
}
