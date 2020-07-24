package com.globallogic.app;

public class Perro implements Animal {

	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Zzzzzzz");
	}

	public void sonidoAnimal() {
		// TODO Auto-generated method stub
		System.out.println("El perro hace guau guau");
	}

	public void come(String s) {
		// TODO Auto-generated method stub
		System.out.println("El "+ s + "se alimenta");
		
	}

	public void camina(String s) {
		// TODO Auto-generated method stub
		System.out.println("El "+ s +"camina" );
	}

}
