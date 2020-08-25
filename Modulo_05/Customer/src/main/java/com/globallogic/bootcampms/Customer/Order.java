package com.globallogic.bootcampms.Customer;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String product;
	private Integer count;
	private Long customer;
	
	
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
	public Long getCustomer() {
		return customer;
	}
	public void setCustomer(Long customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", count=" + count + ", customer=" + customer + "]";
	}
}
