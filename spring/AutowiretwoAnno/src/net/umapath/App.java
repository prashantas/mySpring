package net.umapath;

	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class App {
	    public static void main(String... args) {
	    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("appautowire.xml");
	            Student st=(Student) context.getBean("student");
	            
	            st.dis();
	            
	           	    } 
	    
	  
	}
