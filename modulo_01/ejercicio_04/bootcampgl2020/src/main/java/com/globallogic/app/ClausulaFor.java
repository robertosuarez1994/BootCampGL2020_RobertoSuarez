package com.globallogic.app;

public class ClausulaFor {

	public static void main(String[] args) {
		String daysOfTheWeek[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; 
		
		// TODO Auto-generated method stub
		
		separador("ejercicio_4.4");
		cycleForOneToTen();
		
		separador("ejercicio_4.5");
		countNumbersDivisibleBy20(10000);
		
		separador("ejercicio_4.6");
		printDaysOfTheWeek(daysOfTheWeek);
	}
	
	private static void separador(String tittle) {
		System.out.println("******"+tittle+"*******");
	}
	
	private static void cycleForOneToTen() {
		for (int i=1; i<=10; i++) {
			System.out.println("valor iterador:" + i);
		}
	}
	
	private static void countNumbersDivisibleBy20(int limit) {
		int count = 0;
		for (int i = 0; i <= limit; i++) {
			if(i % 20 == 0) {
				count++;
			}
		}
		System.out.println("Hay "+count+" numeros divisibles por 20");
	}
	
	private static void printDaysOfTheWeek(String daysOfTheWeek[]) {
		for(int i = 0; i <= daysOfTheWeek.length-1;i++) {
			System.out.println("Dia de la semana: "+ daysOfTheWeek[i]);
		}
	}
	
}
