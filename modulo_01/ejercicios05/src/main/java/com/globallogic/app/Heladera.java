package com.globallogic.app;

public class Heladera extends Electrodomestico {
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	@Override
	public void encender() {
		System.out.println("Se encendio la heladera");
	}
	
	public void guardarElemento(String objeto) {
		System.out.println("Se guardo " + objeto + " en la Heladera");
	}
	
	public void extraerElemento(String objeto) {
		System.out.println("Se extrajo " + objeto + " de la Heladera");
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneFreezer() {
		return tieneFreezer;
	}

	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}

	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}

	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}
	
}
