package com.bhavish.app;

import com.bhavish.app.model.Alein;
import com.bhavish.app.model.Laptop;
import com.bhavish.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
//		Alein obj = context.getBean(Alein.class);
//		System.out.println(obj.getAge());
//		obj.code();
//
//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();
//		Alein obj1 = context.getBean(Alein.class);
//		obj.code();
	}

}
