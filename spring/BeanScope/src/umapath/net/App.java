package umapath.net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SuppressWarnings("deprecation")
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		BScope objA = (BScope) context.getBean("helloWorld"); 
			objA.setMessage("I'm object A"); 
		objA.getMessage();
		System.out.println(objA.hashCode());
		
		BScope objB = (BScope) context.getBean("helloWorld");
		objB.setMessage("Hello java"); 
		objB.getMessage(); 
		System.out.println(objB.hashCode());
		objA.getMessage();
		System.out.println(objB.hashCode());
	}

}
