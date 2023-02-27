package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	//@Test
	@RepeatedTest(5)
	void test() {
		//int num=1;
		{
			System.out.println("Hello Guys!");
		}
	}

}
