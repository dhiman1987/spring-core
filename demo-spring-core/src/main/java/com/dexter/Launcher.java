package com.dexter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		//MyBean myBean = context.getBean(MyBean.class);
		// can be done when only one type of Bean exists
		
		MyBean myBean = context.getBean("myBean", MyBean.class);
		System.out.println("myBean param : "+myBean.getParam());
		
		MyBean myBean2 = context.getBean("myBean2", MyBean.class);
		System.out.println("myBean2 param : "+myBean2.getParam());
		
		MyBean myBean3 = context.getBean("myBean3", MyBean.class);
		System.out.println("myBean3 param : "+myBean3.getParam());
		
		MyBean myBean4 = context.getBean("myBean4", MyBean.class);
		System.out.println("myBean4 param : "+myBean4.getParam());
		
		MyBean myBean5 = context.getBean("myBean5", MyBean.class);
		System.out.println("myBean5 param : "+myBean5.getParam());
		
		myBean.setParam("new value");
		myBean = context.getBean("myBean", MyBean.class);
		System.out.println("myBean param : "+myBean.getParam());
		
		myBean5.setParam("new value 1");
		myBean5 = context.getBean("myBean5", MyBean.class);
		System.out.println("myBean5 param : "+myBean5.getParam());
		
		System.out.println("=========================================");
		System.out.println("closing context");
		((ConfigurableApplicationContext)context).close();
		
		
	}

}
