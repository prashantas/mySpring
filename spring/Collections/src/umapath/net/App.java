package umapath.net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	
		public static void main(String[] args) 
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			Collections jc=(Collections)context.getBean("javaCollection");
			jc.getAddressList(); jc.getAddressSet(); 
			jc.getAddressMap(); jc.getAddressProp(); 
		}
	}


