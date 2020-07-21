package com.globallogic.app.entity;

public class StudentDetail {
	
	public static void main(String[] args) {
		StudentDetail  student = new StudentDetail();
    	student.studentAge(17);
	}
	public void studentAge(int age) {
		System.out.println(String.format("la edad del estudiante es %d", age));
	}
}
