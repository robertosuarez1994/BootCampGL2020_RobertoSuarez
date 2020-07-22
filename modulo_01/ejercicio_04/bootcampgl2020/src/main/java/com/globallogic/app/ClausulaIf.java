package com.globallogic.app;

public class ClausulaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("**** ejercicio 4.1*****");
		isGreaterThanTen();
		
		System.out.println("**** ejercicio 4.2*****");
		isUpperCase('A');
		isUpperCase('b');		
		
		System.out.println("**** ejercicio 4.3*****");
		Tienda tienda = new Tienda(400);
		tienda.aplicarDescuento();
		
	}
	
	public static void isGreaterThanTen() {
		int numOne = 3;
		int numTwo = 10;
		int result = numOne + numTwo;
		
		if(result <= 10) {
			System.out.println("La suma de los numeros es: " + result);
		}else {
			System.out.println("La suma de los numeros es Mayor a 10");
		}
	}
	
	public static void isUpperCase(char letter) {
		boolean isUpperCase = Character.isUpperCase(letter);
		if(isUpperCase) {
			System.out.println("Es una letra mayuscula");
		}else {
			System.out.println("No es una letra mayuscula");
		}
	}
	


}
