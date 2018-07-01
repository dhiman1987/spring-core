package com.dexter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dexter")
public class SpringBeanConfig2 {
	
	@Bean(name="myBean")
	public MyBean getBean(){
		MyBean bean =  new MyBean();
		bean.setParam("value1");
		return bean;
	}
	
}