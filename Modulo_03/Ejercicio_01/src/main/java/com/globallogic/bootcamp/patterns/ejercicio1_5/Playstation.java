package com.globallogic.bootcamp.patterns.ejercicio1_5;

public class Playstation {
	private Game videoGame;
	
	public Playstation(Game videoGame) {
		this.videoGame = videoGame;
	}

	public Game getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(Game videoGame) {
		this.videoGame = videoGame;
	}
	
	public String askMyGame() {
		if(videoGame == null) {
			return "Estoy vacio !!!";
		}
		return "El videojuego que estoy corriendo es: " + videoGame.getTittle();
	}
	
}
