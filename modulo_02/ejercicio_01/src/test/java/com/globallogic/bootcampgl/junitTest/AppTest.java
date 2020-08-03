package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test//Ejercicio 1.1
	void test() { 
		assertEquals("Tests","Tests");
	}
	
	@Test //Ejercicio 1.2
	void test2(){ 
		String s1 = "Test", s2 = "Test", s3 = "no Test";
		
		assertEquals(s1,s2);
		assertFalse(s1.equals(s3));
	}
	@Test //Ejercicio 1.3
	void test3() { 
		Integer int1 = 25, int2 = 12, int3 = 27;
		assertTrue(int1>int2);
		assertFalse(int1>int3);
	}
	@Test //Ejercicio 1.4
	void test4() { 
		Long id = null;
		assertNull(id);
		id = 1L;
		assertNotNull(id);
	}
	//Ejercicio 1.5
	/*
	 * @Test void test2_throw_error(){ //Ejercicio 1.2 String s1 = "Test", s2 =
	 * "no Test", s3 = "Test";
	 * 
	 * assertEquals(s1,s2); assertFalse(s2.equals(s3)); }
	 * 
	 * @Test void test3_throw_error() { //Ejercicio 1.3 Integer int1 = 25, int2 =
	 * 12, int3 = 27; assertTrue(int1<int2); assertFalse(int1<int3); }
	 * 
	 * @Test void test4_throw_error() { //Ejercicio 1.4 Long id = null;
	 * assertNotNull(id); id = 1L; assertNull(id); }
	 */
	
	@Test //Ejercicio 1.6
	void test_function_suma() {
		Integer n1 = 2, n2 = 5, expectedResult = 7;
		Integer resultSuma = App.suma(n1, n2);
		assertEquals(resultSuma,expectedResult);
		
	}
	@Test //Ejercicio 1.7
	void test_loop() {
		assertTrue(App.loop(20),"Esta variable no es true:");
		assertFalse(App.loop(2),"Esta variable no es false");
	}
	
	
}
