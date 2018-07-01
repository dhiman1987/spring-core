package com.dexter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		//MyAnnotationBean myBean = context.getBean(MyAnnotationBean.class);
		// can be done when only one type of Bean exists
		
		MyAnnotationBean myBean = context.getBean("myBean", MyAnnotationBean.class);
		System.out.println("myBean param : "+myBean.getParam());
		
		MyAnnotationBean myBean2 = context.getBean("myBean2", MyAnnotationBean.class);
		System.out.println("myBean2 param : "+myBean2.getParam());
		
		MyAnnotationBean myBean3 = context.getBean("myBean3", MyAnnotationBean.class);
		System.out.println("myBean3 param : "+myBean3.getParam());
		
		MyAnnotationBean myBean4 = context.getBean("myBean4", MyAnnotationBean.class);
		System.out.println("myBean4 param : "+myBean4.getParam());
		
		MyAnnotationBean myBean5 = context.getBean("myBean5", MyAnnotationBean.class);
		System.out.println("myBean5 param : "+myBean5.getParam());
		
		myBean.setParam("new value");
		myBean = context.getBean("myBean", MyAnnotationBean.class);
		System.out.println("myBean param : "+myBean.getParam());
		
		myBean5.setParam("new value 1");
		myBean5 = context.getBean("myBean5", MyAnnotationBean.class);
		System.out.println("myBean5 param : "+myBean5.getParam());
		
		
	}

}
