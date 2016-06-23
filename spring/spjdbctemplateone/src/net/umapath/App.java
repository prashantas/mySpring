package net.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(101,"amir",33456)); 
	   /* 
	    Employee e1=new Employee();
	    e1.setId(99);*/
	    
	    System.out.println(status);  
	    
	}

}
