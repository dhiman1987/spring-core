package com.dexter.my.aop;

import org.springframework.stereotype.Component;

@Component
public class MyAop {
	
	public void diaplayMessage(String message) {
		System.out.println("The message is "+message);
	}
	
	public String getMessage(String message) {
		return message.toUpperCase();
	}
	
	public String throwException() throws Exception{
		throw new Exception("Dummy Exception");
	}
	
}
