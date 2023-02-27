package org.tnsif.Junit;
//program to demonstrate on first Junit 5 testing
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgramTesting {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit test case");
	}
	@Test
	void display() {
		System.out.println("This is Junit 5 testcase");
	}
}
