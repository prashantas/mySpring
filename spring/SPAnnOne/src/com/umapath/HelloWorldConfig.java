package com.umapath;

import org.springframework.context.annotation.*; 
@Configuration 
public class HelloWorldConfig {
	@Bean()
	@Scope(value="prototype") 
	public HelloWorld helloWorld(){ 
		return new HelloWorld();
		} 
	}