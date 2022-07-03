package com.rajeshanthari.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class MathUtilTest {

	static MathUtils mu = null;

	@BeforeAll
	static void beforeEach() {
		mu = new MathUtils();
	}

	@AfterAll
	static void afterEach() {
		System.out.println("afterEach");
	}

	@DisplayName("Test Null check")
	@Test
	public void test_Null_Check() {
		assertNull(mu.isNull(null));
		assertNotNull(mu.isNull("new"));
	}

	@Test
	public void test_equals_or_not_equals() {
		assertEquals(10, mu.add(6, 4));
	}
	
	@Test
	public void test_equals_or_not_equals_array() {
		char[] sorted = "rajesh".toCharArray();
		Arrays.sort(sorted);
		assertArrayEquals("aehjrs".toCharArray(), sorted);
	}
	@Test
	public void exception() {
		char[] sorted = "rajesh".toCharArray();
		Arrays.sort(sorted);
		assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> {Arrays.asList("").get(3);});
		assertDoesNotThrow(() -> {Arrays.asList("").get(0);});
	}
	
	
	

}
