package umapath.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
//		BeanFactory factory = new XMLBeanFactory(new FileSytemResource("StudentConf.xml"));
		
		
		Resource resource=new ClassPathResource("Studentconf.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Triangle triangle =(Triangle) factory.getBean("triangle");
		
		triangle.draw();

	}

}
