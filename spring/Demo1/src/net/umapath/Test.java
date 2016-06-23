package net.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("xyz.xml");
		
			HelloWorld hello = (HelloWorld) context.getBean("abc");
			
		      hello.dis();
		
	}

}
