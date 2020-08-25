package com.globallogic.bootcampgl.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);

		SpringApplication.run(OrderApplication.class, args);
		//OrderFactory oFactory = context.getBean("orderFactory", OrderFactory.class);

		//System.out.println(oFactory.getNewOrder());
	}

}
