package net.umapath;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Resource resource=new ClassPathResource("Appcontext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student st =(Student) factory.getBean("student");*/
		
			
		ApplicationContext context = new ClassPathXmlApplicationContext("Appcontext.xml");
		Student st =(Student)context.getBean("Hai");
		
		
		st.dispinfo();
		
		((AbstractApplicationContext) context).registerShutdownHook();



	}

}
