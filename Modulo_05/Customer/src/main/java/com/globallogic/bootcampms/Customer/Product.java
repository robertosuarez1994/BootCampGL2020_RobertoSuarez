package com.globallogic.bootcampms.Customer;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String id;
	private String name;
	
	
	public Product() {
		this.id = "C-00221";
		this.name = "clavos";
	}
	
	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
