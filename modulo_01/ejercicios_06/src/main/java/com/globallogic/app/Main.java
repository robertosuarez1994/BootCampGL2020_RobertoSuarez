package com.globallogic.app;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		int        LIMIT_EMPLOYEE  = 20;
		int		   numEmployees    = 0;
		Scanner    input           = new Scanner(System.in);
		
		while(numEmployees <= 0 || numEmployees > LIMIT_EMPLOYEE) {
			System.out.println("Cuanto empleados se van a registrar?(max 20)");
			numEmployees = input.nextInt();
		}
		Employee[] employees = new Employee[numEmployees];
		
		for(int i = 0 ; i <= numEmployees - 1; i++) {
			System.out.println("*********Ingresa los datos del empleado*********");
		
			System.out.println("DNI:");
			Employee employee = new Employee(input.nextInt());
		
			System.out.println("Nombre:");
			employee.setName(input.next());
			
			System.out.println("Casado(S/N):");
			boolean isSingle = input.next().equals("S") ? true : false;
			employee.setSingle(isSingle);
			
			System.out.println("Sueldo Base:");
			employee.setBaseSalary(input.nextDouble());
			
			System.out.println("Horas extras:");
			employee.setExtraHours(input.nextInt());
			
			System.out.println("Cantidad de hijos:");
			employee.setNumChildren(input.nextInt());
			
			System.out.println("Tipo IRPF");
			employee.setTypeIRPF(input.nextDouble());
		
			employees[i] = employee;
		}	
		 
		System.out.print("Ingrese valor por hora extra: ");
		Employee.IMPORT_PER_EXTRA_HOURS = input.nextDouble();
		
		System.out.println("**************************************");
		
		System.out.println("El empleado con el salario mas alto es:");
		System.out.println(getEmployeeWithMaxSalary(employees).toString());
		
		System.out.println("El empleado con el salario mas bajo es:");
		System.out.println(getEmployeeWithMinSalary(employees).toString());
		
		System.out.println("El empleado con mas horas extras es:");
		System.out.println(getEmployeeMaxExtraHours(employees).toString());
		
		System.out.println("El empleado con menos horas extras es:");
		System.out.println(getEmployeeMinExtraHours(employees).toString());
		
		System.out.println("****************************************");
		
		for (Employee employeeElement : sortEmployeesBySalary(employees)) {
			System.out.println(employeeElement.toString());
		}
		
	}
	
	public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
		Employee employWithMaxSalary = employees[0];
		for(Employee employee : employees) {
			employWithMaxSalary = employee.getNetSalary() > employWithMaxSalary.getNetSalary() ? employee : employWithMaxSalary; 
		}
		return employWithMaxSalary;
	}
	
	
	public static Employee getEmployeeWithMinSalary(Employee[]employees) {
		Employee employWithMinSalary = employees[0];
		for(Employee employee : employees) {
			employWithMinSalary = employee.getNetSalary() < employWithMinSalary.getNetSalary() ? employee : employWithMinSalary; 
		}
		return employWithMinSalary;
	}
	
	public static Employee getEmployeeMaxExtraHours(Employee[]employees) {
		Employee employWithMaxExtraHours = employees[0];
		for(Employee employee : employees) {
			employWithMaxExtraHours = employee.getExtraHours() < employWithMaxExtraHours.getExtraHours() ? employee : employWithMaxExtraHours; 
		}
		return employWithMaxExtraHours;
	}
	
	public static Employee getEmployeeMinExtraHours(Employee[]employees) {
		Employee employWithMinExtraHours = employees[0];
		for(Employee employee : employees) {
			employWithMinExtraHours = employee.getExtraHours() < employWithMinExtraHours.getExtraHours() ? employee : employWithMinExtraHours; 
		}
		return employWithMinExtraHours;
	}
	
	public static Employee[] sortEmployeesBySalary(Employee[] employees) {
		boolean sorted = false;
	    Employee temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < employees.length - 1; i++) {
	            if (employees[i].getNetSalary() < employees[i+1].getNetSalary()) {
	                temp = employees[i];
	                employees[i] = employees[i+1];
	                employees[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
		return employees;
	}
	
	

}
