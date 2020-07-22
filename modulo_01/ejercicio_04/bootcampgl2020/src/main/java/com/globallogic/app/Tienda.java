package com.globallogic.app;

public class Tienda {
	private double totalCompra;
	
	public Tienda(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	
	public void aplicarDescuento() {
		double descuento = 0;
		
		if (totalCompra > 350) {
			descuento = 0.25;
		}
		if (totalCompra == 300) {
			descuento = 0.20;
		}
		
		if (descuento > 0) {
			descuento = descuento * this.totalCompra;
			this.totalCompra = this.totalCompra - descuento;
			System.out.println("El descuento es de: " + descuento);
			System.out.println("Total compra con descuento: " + this.totalCompra );
		}else {
			System.out.println("Sin desceuntos, el Total es: " + this.totalCompra);
		}
		
		
		
	}
}
