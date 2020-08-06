package com.globallogic.bootcamp.patterns.ejercicio1_2;

public class Order {
	private Currency currency;
	private String description;
	private Integer count;
	private Product product;
	
	public Order(String description,Integer count) {
		this.currency = Currency.getInstance();
		this.product = Product.getInstance();
		this.description = description;
		this.count = count;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
