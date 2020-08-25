package com.globallogic.bootcampms.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productRepository")
public class ProductRepository {
	
	List<Product> products = new ArrayList<Product>();
	
	public ProductRepository() {
		
	}
	
	public void addProducts(Product product){
		this.products.add(product);
	}
	
	public Product getById(String id) {
		for (Product prod : this.products) {
			if(prod.getId().equals(id)) {
				return prod;
			}
		}
		return null;
	}
}
