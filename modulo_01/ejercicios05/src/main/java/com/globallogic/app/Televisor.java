package com.globallogic.app;

public class Televisor extends Electrodomestico {
	private double pulgadas;
	private String resolucion;
	
	public void cambiarCanal(int canal) {
		
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	@Override
	public void encender() {
		System.out.println("Se encendio el televisor");
	}
}
