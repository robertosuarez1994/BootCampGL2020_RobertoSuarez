package com.globallogic.app.entity;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> letters = new ArrayList<String>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		printStrList(letters);
		
		System.out.println(
				String.format("Letters contiene %d elementos", letters.size())
		);
		
		System.out.println("**************");
		
		letters.add(0,"X");
		
		printStrList(letters);
		
	}
	
	private static void printStrList(List<String> list) {
		for (String element : list) {
			System.out.println(element);
		}
	}

}
