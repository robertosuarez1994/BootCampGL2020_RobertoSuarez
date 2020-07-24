package com.globallogic.app;

public class MyException extends Exception {
	private String msg = "Error Personalizado";
	
	public String getMessage() {
		return msg;
	}
}
