package net.umapath;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args)
	{
		
		AbstractApplicationContext context = 
            new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("pradum");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
