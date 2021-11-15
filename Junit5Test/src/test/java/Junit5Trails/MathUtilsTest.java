package Junit5Trails;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected  = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "This is running Junit 5 tests");
	}

}
