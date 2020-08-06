package com.globallogic.bootcamp.patterns.ejercicio1_1;

public class ElectricalOven extends ElectricalAppliance {

	LedAppliance led;
	
	public ElectricalOven(LedAppliance led) {
		this.led = led;
	}
	
	@Override
	public Integer TurnOn() {
		this.power = this.power - 75;	
		return this.power;
	}
	
	public Integer turnLed() {
		return this.power = led.turnOn(this.power);
	}
	
}
