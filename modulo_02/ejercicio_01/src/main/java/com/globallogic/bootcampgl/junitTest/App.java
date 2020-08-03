package com.globallogic.bootcampgl.junitTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static Integer suma(Integer n1, Integer n2) {
    	Integer result = n1 + n2;
    	return result;
    }
    
    public static Boolean loop(Integer limit) {
    	for (Integer i = 0; i < limit ; i++) {
    		if(i.equals(3)) {return true;}
    	}
    	return false;
    }
}
