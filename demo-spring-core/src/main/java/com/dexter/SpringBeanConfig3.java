package com.dexter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.dexter.my.aop.MyAspects;

@Configuration
@ComponentScan("com.dexter.my.aop")
@EnableAspectJAutoProxy()
public class SpringBeanConfig3 {}