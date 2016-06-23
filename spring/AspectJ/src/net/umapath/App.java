package net.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("1");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		System.out.println("2");
		
		 
		CustomerBo customer = (CustomerBo)appContext.getBean("cBo");
		System.out.println("3");
		customer.addCustomer();
		System.out.println("4");
		//customer.addCustomerReturnValue();
		
		/*try {
			customer.addCustomerThrowException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		//customer.addCustomerAround("abC");
	}

}
