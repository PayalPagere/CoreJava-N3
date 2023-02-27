package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//Program to demonstrate on Parametrized test
class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"Diya","Nia"})
	void test() {
		System.out.println("Hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings={"Diya","Nia"})
	void display(String str) {
		assertNotNull("Nia"=="Diya");
	}

}
