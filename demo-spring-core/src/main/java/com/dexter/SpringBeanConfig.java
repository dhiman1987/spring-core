package com.dexter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

public class SpringBeanConfig {
	
	@Bean(name="myBean")
	public MyAnnotationBean getMyAnnotationBean(){
		MyAnnotationBean bean =  new MyAnnotationBean();
		bean.setParam("value1");
		return bean;
	}
	
	@Bean(name="myBean2")
	public MyAnnotationBean getMyAnnotationBean2(){
		MyAnnotationBean bean =  new MyAnnotationBean();
		bean.setParam("value2");
		return bean;
	}
	
	@Bean(name="myBean3", initMethod="init", destroyMethod="cleanUp")
	public MyAnnotationBean getMyAnnotationBean3(){
		MyAnnotationBean bean =  new MyAnnotationBean();
		bean.setParam("value3");
		return bean;
	}
	
	@Bean(name="myBean4")
	@Lazy(value=true)
	public MyAnnotationBean getMyAnnotationBean4(){
		MyAnnotationBean bean =  new MyAnnotationBean();
		bean.setParam("value4");
		return bean;
	}
	
	@Bean(name="myBean5")
	@Scope(scopeName="prototype")
	public MyAnnotationBean getMyAnnotationBean5(){
		MyAnnotationBean bean =  new MyAnnotationBean();
		bean.setParam("value5");
		return bean;
	}

}
