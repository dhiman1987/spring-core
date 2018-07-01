package com.dexter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher3 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig2.class);
		
		MyBean2 myBean2 = context.getBean(MyBean2.class);
		System.out.println("MyBean2 param "+myBean2.getParam());
		myBean2.setParam("New Value");
		System.out.println("MyBean2 param "+myBean2.getParam());
		
		myBean2.display();
			
		System.out.println("=========================================");
		System.out.println("closing context");
		((ConfigurableApplicationContext)context).close();
		
		
	}

}
