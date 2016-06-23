package umapath.net;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*	Resource resource=new ClassPathResource("Bean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);*/
		
		/*Hello student=(Hello)factory.getBean("studentbean");
		//Hello student1=(Hello)factory.getBean("studentbean1");
		student.show();*/
		//System.out.println(student1);
		
	
   //ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Administrator\\java\\Bean.xml"); //("C:/Users/Nikhil/workspace/HelloSpring/src/Sconf.xml");
	Hello obj = (Hello) context.getBean("studentbean");
		
		obj.show();
		
		
		
	}

}
