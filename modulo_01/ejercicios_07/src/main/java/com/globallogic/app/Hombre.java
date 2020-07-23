package com.globallogic.app;

public class Hombre implements Animal,Persona {
	
	public static void main(String[] args) {
		System.out.println("******** Ejercicio 7.3*********");
		Hombre hombre = new Hombre();
		hombre.hablar();
		hombre.dormir();
		hombre.sonidoAnimal();
		hombre.come();
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		 System.out.println("Las personas hablan mucho");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("El hombre duerme muchas horas");
	}

	@Override
	public void sonidoAnimal() {
		// TODO Auto-generated method stub
		System.out.println("El hombre no hace sonidos de animal");
	}


}
