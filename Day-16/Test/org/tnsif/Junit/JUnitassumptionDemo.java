package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
//assumptions
class JUnitassumptionDemo {

	@Test
	void test() {
		Assumptions.assumeFalse(false);
		//if true=then executes
		//if false then skipped
	}
	@Test
	void accept() {
		Assumptions.assumeFalse(true);
	}

}
