package com.globallogic.bootcampms.Customer;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String name;
	private Long dni;
	private Long id;
	
	public Customer() {
		this.id = 12342L;
		this.dni = 23456780L;
		this.name = "Jose Perez";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", dni=" + dni + ", id=" + id + "]";
	}
	
}
