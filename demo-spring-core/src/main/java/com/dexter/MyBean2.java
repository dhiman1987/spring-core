package com.dexter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {
	
	@Value("Value 1")
	private String param;
	
	@Autowired
	private MyBean myBean;
	
	public MyBean2() {
		System.out.println("Bean2 constructed....");
		if(null==param) {
			System.out.println("param value is null");
		}else {
			System.out.println("param value is "+param);
		}
		System.out.println("-----------------------------------\n");
	}
	
	public void display() {
		if(null!= myBean) {
			System.out.println("Autowired bean value "+myBean.getParam());
		}
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean2 initialized.... param value is "+param);
		System.out.println("-----------------------------------\n");
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	} 
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Bean2 cleaningup....");
		System.out.println("-----------------------------------\n");
	}



}
