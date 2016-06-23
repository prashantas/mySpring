package umapath.net;

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
	    int status=dao.saveEmployee(new Employee(303,"qqqqq",78000)); 
	    //int status1=dao.saveEmployee2(new Employee(302,"abCD",56000));
	    System.out.println(status);  
	    
	}

}
