package com.globallogic.app;

public class ClausulaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		separador("Ejercicio_4.9");
		forEachIntegerArray();
		
		separador("ejercicio_4.10");
		printDaysOfTheWeek();
		
		separador("Ejercicio_4.11");
		forEachBootCamp2020();		
	}
	
	private static void forEachIntegerArray() {
		int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};
		for (int num : arrayNum) {
			System.out.println("Valor iterador "+ num); 
		}
	}
	
	private static void printDaysOfTheWeek() {
		String[] daysOfTheWeek = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		for(String day : daysOfTheWeek) {
			System.out.println("Dia de la semana "+ day);
		}
	}
	
	private static void forEachBootCamp2020() {
		String word = "BootCamp 2020";
		char[] letters = word.toCharArray();
		for(char letter : letters) {
			System.out.println("Letra: " + letter);
		}
	}
	
	private static void separador(String tittle) {
		System.out.println("******"+tittle+"*******");
	}

}
