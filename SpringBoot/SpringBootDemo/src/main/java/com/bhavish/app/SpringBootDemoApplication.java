package com.bhavish.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		Alein obj = context.getBean(Alein.class);
		obj.code();
//
//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();
//		Alein obj1 = context.getBean(Alein.class);
//		obj.code();
	}

}
