package com.globallogic.app;

public interface Persona {
	public void hablar();
	public void dormir();
	default public void come() {
		System.out.println("esta comiendo");
	}
}
