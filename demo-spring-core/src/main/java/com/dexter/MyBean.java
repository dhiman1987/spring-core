package com.dexter;

public class MyBean {
	
	private String param;
	
	public MyBean() {
		System.out.println("Bean constructed....");
		if(null==param) {
			System.out.println("param value is null");
		}else {
			System.out.println("param value is "+param);
		}
		System.out.println("-----------------------------------\n");
	}
	
	public void init() {
		System.out.println("Bean initialized.... param value is "+param);
		System.out.println("-----------------------------------\n");
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	} 
	
	public void cleanUp() {
		System.out.println("Bean cleaningup....");
		System.out.println("-----------------------------------\n");
	}



}
