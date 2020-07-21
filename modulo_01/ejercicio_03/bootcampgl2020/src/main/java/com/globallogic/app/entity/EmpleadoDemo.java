package com.globallogic.app.entity;

public class EmpleadoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		empleado.salario = 1000;
		
		System.out.print(
			String.format("%s tiene un salario promedio de %g (muy bajo)",empleado.nombre,empleado.salario)
		);
		
	}

}
