package com.globallogic.app;

public class ClausulaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		separador("Ejercicio_4.7");
		cycleWhileOneToTen();
		
		separador("Ejercicio_4.8");
		printPairOdd();
	}

	private static void cycleWhileOneToTen() {
		int i = 1;
		while(i <= 10) {
			System.out.println("Valor iterador: " + i);
			i++;
		}
	}
	
	private static void printPairOdd() {
		int i = 1;
		while (i <= 50) {
			if(i % 2 == 0) {
				System.out.println("Valor iterador " + i + " es par");
			}else {
				System.out.println("Valor iterador " + i + " es impar");
			}
			i++;
		}
	}
	
	private static void separador(String tittle) {
		System.out.println("******"+tittle+"*******");
	}
}
