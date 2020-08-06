package com.globallogic.bootcamp.patterns.ejercicio1_2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {
	
	@Test
	void checkSameInstanceOfCurrencyInOreder() {
		
		Order order = new Order("Descripcion",2);
		Order order2 = new Order("Descripcion2",10);
		
		assertEquals(order.getCurrency(),order2.getCurrency());
		assertEquals(order.getProduct(),order2.getProduct());
	}
}
