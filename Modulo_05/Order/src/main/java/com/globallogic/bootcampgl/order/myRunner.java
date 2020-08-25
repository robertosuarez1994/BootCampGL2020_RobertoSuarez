package com.globallogic.bootcampgl.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class myRunner implements CommandLineRunner{

	@Autowired
	OrderFactory oFactory;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(oFactory.getNewOrder());
	}

}
