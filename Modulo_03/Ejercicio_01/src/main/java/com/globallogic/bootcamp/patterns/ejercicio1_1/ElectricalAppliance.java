package com.globallogic.bootcamp.patterns.ejercicio1_1;

public class ElectricalAppliance {
	protected Integer power = 500;

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}
	
	public Integer TurnOn() {
		return power =- 100;
	}
	
	
	
}
