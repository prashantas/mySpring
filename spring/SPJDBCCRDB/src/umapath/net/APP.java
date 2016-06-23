package umapath.net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
	public static void main(String[] args) {
				
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); 
		
		AccountService as = (AccountService) context.getBean("accountservice");
		try{
			as.transferfunds(101,102,24000);		

	    }catch(Exception e){
	    	System.out.println(e);
	    }
	}
}