package com.globallogic.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**************** Ejercicio 5.1 y 5.2 ************
		Heladera heladera = new Heladera();
		Televisor tele = new Televisor();
		Cafetera cafetera = new Cafetera();
		
		List<Electrodomestico> electrodomesticoList = new ArrayList<Electrodomestico>();
		
		electrodomesticoList.add(cafetera);
		electrodomesticoList.add(tele);
		electrodomesticoList.add(heladera);
		
		for (Electrodomestico electrodomestico : electrodomesticoList ) {
			electrodomestico.encender();
		}
		
		
		//**************** Ejercicio 5.3 ************
		Gato miGato = new Gato();
		miGato.setNombre("mity");
		miGato.setPatas(4);
		System.out.println("Mi gato se llama "+miGato.getNombre()+" y tiene " +miGato.getPatas()+" patas");
		
		
		//***************** Ejercicio 5.4 ************
		Berlina berlina = new Berlina();
		berlina.avanzar(); //metodo implementado en la clase padre
		berlina.retroceder(); //metodo sobre escrito en la clase hijo
	}

}
