package com.globallogic.app;

public class Employee extends Person {
	
	private double baseSalary;
	private int extraHours;
	private double typeIRPF;
	private boolean single;
	private int numChildren;
	public static double IMPORT_PER_EXTRA_HOURS = 0;
	
	public Employee(int dni) {
		this.setId(dni);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}
	
	public double getTypeIRPF() {
		return typeIRPF;
	}

	public void setTypeIRPF(double typeIRPF) {
		this.typeIRPF = typeIRPF;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public int getNumChildren() {
		return numChildren;
	}

	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}
	
	
	
	
	private double getOvertimeBalance() {
		return this.extraHours * IMPORT_PER_EXTRA_HOURS;
	}
	
	private double getGrossSalary() {
		return this.baseSalary + this.getOvertimeBalance();
	}
	
	private double getRetention() {
		double percentajeRetention = this.getTypeIRPF() - this.getNumChildren();
		if(!this.isSingle()) {
			percentajeRetention = percentajeRetention - 2;
			
		}
		return this.getGrossSalary() * (percentajeRetention/100);
	}
	
	public double getNetSalary() {
		return this.baseSalary + this.getOvertimeBalance() - this.getRetention();
	}
	
	public String toString() {
		char merried = this.isSingle()?'N':'S';
		
		return( 
				this.getId()+ " "   + this.getName()       +"\n"
				+ "Saldo Base: "    + this.getBaseSalary() +"\n"
				+"Horas Extras: "   + this.getExtraHours() +"\n"
				+"Tipo IRPF: "      + this.getTypeIRPF()   +"\n"
				+"Casado: "         + merried              +"\n"
				+"Numero de Hijos: "+this.getNumChildren() +"\n"
				);
	}
	
}
