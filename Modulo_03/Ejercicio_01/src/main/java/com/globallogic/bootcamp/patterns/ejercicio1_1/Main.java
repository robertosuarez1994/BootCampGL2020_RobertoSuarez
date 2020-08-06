package com.globallogic.bootcamp.patterns.ejercicio1_1;

public class Main {

	public static void main(String[] args) {
		LedAppliance led = new LedAppliance();
		ElectricalOven electricalOven = new ElectricalOven(led);
		
		System.out.println(electricalOven.getPower());
		electricalOven.TurnOn();
		System.out.println(electricalOven.getPower());
		electricalOven.turnLed();
		System.out.println(electricalOven.getPower());
	}

}
