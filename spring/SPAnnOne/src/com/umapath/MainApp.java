package com.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class); 
		HelloWorld helloWorld =(HelloWorld) ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello Ria!"); 
		helloWorld.getMessage();
		
		HelloWorld helloWorld1 =(HelloWorld) ctx.getBean(HelloWorld.class);
		helloWorld1.getMessage();
		}

	}


