package com.globallogic.bootcampgl.customer.model;

public class Customer {
	private Long id;
	private String name;
	private Integer dni;
	
	
	public Customer(Long id,String name, Integer dni) {
		this.name = name;
		this.dni = dni;
		this.id = id;
	}
	
	public Customer() {
		this.id = 12342L;
		this.name = "Jose Perez";
		this.dni = 123122;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
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
		return "Customer [id=" + id + ", name=" + name + ", dni=" + dni + "]";
	}
}
