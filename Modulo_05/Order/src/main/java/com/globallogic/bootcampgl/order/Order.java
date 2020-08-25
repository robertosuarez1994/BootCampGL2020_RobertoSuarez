package com.globallogic.bootcampgl.order;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String product;
	private Integer count;
	private Integer Customer;
	
	public Order() {
		this.product = "C-00221";
		this.count = 1000;
		this.Customer = 12342;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCustomer() {
		return Customer;
	}
	public void setCustomer(Integer customer) {
		Customer = customer;
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", count=" + count + ", Customer=" + Customer + "]";
	}
	
	
}
