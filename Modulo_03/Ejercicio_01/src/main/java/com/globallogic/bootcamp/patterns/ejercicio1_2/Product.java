package com.globallogic.bootcamp.patterns.ejercicio1_2;

public class Product {
	private static Product INSTANCE;
	private String name;
	
	private Product() {
		name = "Clavos";
	}
	
	public static Product getInstance() {
		if(INSTANCE == null) {
			return INSTANCE = new Product(); 
		}
		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
