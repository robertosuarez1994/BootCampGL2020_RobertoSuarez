package com.globallogic.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("******** Ejercicio 7.1*********");
    	Perro dog = new Perro();
        dog.sonidoAnimal();
        dog.dormir();
        
        System.out.println("******** Ejercicio 7.2*********");
        dog.come("perro");
        dog.camina("perro");
        
    }
}
