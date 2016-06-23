package net.umapath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	  
		  public static void main(String[] args) 
		  { 
			  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); 
			  Profile st = (Profile) context.getBean("profile");
			 //st.getStudent().getName();
			 st.dis();
			  
			  }
		  }
	  