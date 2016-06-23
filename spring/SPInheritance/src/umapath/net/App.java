package umapath.net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml"); 
		
		Welcome objB = (Welcome) context.getBean("welcome");
		objB.getX();
		objB.getY();
		
		Hello objA = (Hello) context.getBean("hello"); 
	//	objA.getX(); 
		//objA.getY();
		objA.getX1();
		objA.getY1();
		
		
		
		}
	

}
