package Junit5Trails;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all it needs to execute");
	}
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning up");
	}
	@DisplayName("Testing add method")
	@Test
	void testAdd() {
		int expected  = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "This is running Junit 5 tests");
	}
	@Test
	void testDivide() {
		boolean serverUp = true;
		assumeTrue(serverUp);
		assertThrows(ArithmeticException.class, () -> mathUtils.devide(1, 0), "Divide by zero is handled");	}
	
	@Test
	void testMultiply() {
		assertAll(() -> assertEquals(4, mathUtils.multiply(2, 2)),
				  () -> assertEquals(0, mathUtils.multiply(2,  0)),
				  () -> assertEquals(-2, mathUtils.multiply(2, -1))
				  );
	}
}
