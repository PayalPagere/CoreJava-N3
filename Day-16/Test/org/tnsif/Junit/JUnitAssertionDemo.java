package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Program to demonstrate on Assertion Annotations
class JUnitAssertionDemo {

	@Test
	void test() {
		assertEquals(12,12);
	}
	@Test
	void display()
	{
		assertFalse(12==2);
	}
}
