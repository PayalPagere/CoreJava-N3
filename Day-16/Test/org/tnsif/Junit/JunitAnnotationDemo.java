package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	@BeforeEach
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit test case");
	}
	@Test
	@BeforeAll
	//if we use static then method name is not displayed to overcome this we have to use
	//method @TestInstance(Lifecycle.PER_CLASS)
	static void display() {
		System.out.println("This is Junit 5 testcase");
	}
	@Test
	@AfterEach
	@Disabled
	//for hiding this method from user
	void accept() {
		System.out.println("After Each Method");
	
	}
	@Test
	@AfterAll
	static void aftermethod()
	{
		System.out.println("After all");
	}
	@Test
	@Tag(value = "accept")
	void tagmethod()
	{
		System.out.println("Its an Tag method");
	}
	
}
