package com.globallogic.app;

public class Cafetera extends Electrodomestico {
	private double litros;
	
	@Override
	public void encender() {
		System.out.println("Se encendio la cafetera");
	}
	
	public void elegirSabor(String sabor) {
		
	}
	

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
}
