package umapath.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService service =(ShapeService)context.getBean("shapeservice",ShapeService.class);
		System.out.println(service.getCircle().getName());
		//service.getCircle().setName("Dummy name");
		//service.getCircle().setNameReturn("Dummy name");
		
	}

}
