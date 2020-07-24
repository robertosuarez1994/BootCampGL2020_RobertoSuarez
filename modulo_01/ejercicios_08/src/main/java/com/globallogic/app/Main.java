package com.globallogic.app;

public class Main {

	public static void main(String[] args) {
		  
		System.out.println("*********ejercicio 8.1 y 8.2*************");
		  
		  try { 
			  throw new Exception();   
		  }catch(Exception e) { 
			  //debe imprimir como mensaje null (ejercicio 8.2) 
			  System.err.println("Se prdujo una excepcion: "+e.getMessage());
		  }finally {
			  System.out.println("Esto se ejecuta sin importar si se presentan errores"); 
		  }
		 
		
		System.out.println("*********ejercicio 8.3*************");
		
		String[] sArray = {"Lunes","Martes","Miercoles"};
		
		try {
			for( int i = 0 ; i < 5 ; i++) {
				System.out.println(sArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción: índice de array fuera de límites");
		}

		
		System.out.println("*********ejercicio 8.4*************");
		
		try {
			throw new MyException();
		}catch (MyException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
