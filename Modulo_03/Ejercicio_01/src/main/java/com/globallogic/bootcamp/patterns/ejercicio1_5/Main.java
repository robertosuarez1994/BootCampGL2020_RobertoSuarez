package com.globallogic.bootcamp.patterns.ejercicio1_5;

public class Main {

	public static void main(String[] args) {
		Game residentGame = new Game("Resident Evil");
		Game brawlGame = new Game("Brawlhalla");

		Playstation play = new Playstation(residentGame);
		System.out.println(play.askMyGame());
		play.setVideoGame(brawlGame);
		System.out.println(play.askMyGame());
		play.setVideoGame(null);
		System.out.println(play.askMyGame());
	}

}
