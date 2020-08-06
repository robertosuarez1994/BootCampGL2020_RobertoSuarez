package com.globallogic.bootcamp.patterns.ejercicio1_2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CurrencyTest {
	
	@Test
	void singletonCurrency() {
		assertEquals(Currency.getInstance(),Currency.getInstance());
	}
}
