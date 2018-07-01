package com.dexter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dexter.my.aop.MyAop;

public class Launcher4 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig3.class);

		MyAop myAop = context.getBean(MyAop.class);
		System.out.println("AOP get message : "+myAop.getMessage("Hello World"));
		myAop.diaplayMessage("Hello World");
		myAop.diaplayMessage("some nonsense message");
		try {
			myAop.throwException();
		}catch(Exception ex) {
			System.out.println("Error occured : "+ex.getMessage());
		}


		System.out.println("=========================================");
		System.out.println("closing context");
		((ConfigurableApplicationContext)context).close();


	}

}
