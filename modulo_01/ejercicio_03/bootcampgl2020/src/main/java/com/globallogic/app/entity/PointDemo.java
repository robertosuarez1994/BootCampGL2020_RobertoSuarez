package com.globallogic.app.entity;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableInstancia vI = new VariableInstancia();
		vI.engPoint    = 50;
		vI.mathsPoints = 80;
		
		System.out.println(
			String.format("engPoint: %d | mathsPoint: %d", vI.engPoint,vI.mathsPoints)
		);
	}

}
