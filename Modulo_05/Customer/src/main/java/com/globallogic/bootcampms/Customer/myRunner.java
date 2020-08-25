package com.globallogic.bootcampms.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;



@Component
public class myRunner implements CommandLineRunner{
	@Autowired
	ProductRepository repo;
	
	@Autowired
	Customer customer;
	
	@Autowired
	Product product;
	
	@Autowired
	OrderFactory oFactory;
	
	@Override
	public void run(String... args) throws Exception {
		
		Order order = oFactory.getNewOrder();
		order.setCount(1000);
		order.setCustomer(customer.getId());
		order.setProduct(product.getId());
		
		System.out.println(customer);
		System.out.println(order);
		repo.addProducts(product);
		System.out.println(repo.getById(product.getId()));
	}
	
}
