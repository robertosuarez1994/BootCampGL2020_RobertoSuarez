package com.globallogic.bootcampgl.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.globallogic.bootcampgl.customer.model.Customer;

@Component
public class myRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println(new Customer());
		
	}
	
}
