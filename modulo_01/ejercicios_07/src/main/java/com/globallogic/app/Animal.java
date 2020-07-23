package com.globallogic.app;

public interface Animal {
	public void dormir();
	public void sonidoAnimal();
	default public void come(String s) {
		System.out.println("El " + s + " se alimenta");
	};
	public static void camina(String s) {
		System.out.println("El " + s + " camina");
	}
}
