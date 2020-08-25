package com.globallogic.bootcampms.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
	
	@Autowired
	@Qualifier("order")
	private Order order;
	
	public Order getNewOrder() {
		return this.order;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder( Order order) {
		this.order = order;
	}
	
	
}
