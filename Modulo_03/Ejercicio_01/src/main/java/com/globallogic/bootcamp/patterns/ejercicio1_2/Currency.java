package com.globallogic.bootcamp.patterns.ejercicio1_2;

public class Currency {
	private static Currency INSTANCE;
	private String name;
	
	private Currency() {
		name = "ARS";
	}

	public static Currency getInstance() {
		if(INSTANCE == null) {
			return INSTANCE = new Currency(); 
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
