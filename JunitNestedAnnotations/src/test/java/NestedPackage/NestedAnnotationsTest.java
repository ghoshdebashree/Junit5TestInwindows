package NestedPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedAnnotationsTest {

	NestedAnnotations nestedAnnotations;
	
	@BeforeEach
	void init() {
		nestedAnnotations = new NestedAnnotations();
	}
	
    @Nested
	class NestedAdd{
	@Test
	void testPositiveAdditons() {
		int expected = 8;
		int actual = nestedAnnotations.add(2, 6);
		assertEquals(expected, actual, "This test is to run add positive number");
	}
	@Test
	void testNegativeAdditons() {
		int expected = -2;
		int actual = nestedAnnotations.add(-1, -1);
		assertEquals(expected, actual, "This test is to run negative positive number");
	}

	}
}
