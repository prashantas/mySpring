package net.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
		Employee emp =(Employee) context.getBean("repo");
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
	}
}