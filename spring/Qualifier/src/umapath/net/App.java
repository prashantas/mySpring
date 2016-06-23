package umapath.net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); 
		Profile profile = (Profile) context.getBean("profile");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ProfileConfig.class);
		Profile profile1 = (Profile) context.getBean("profile");
		
		profile1.printAge();
		
		
		
		profile.printName();
		
		System.out.println(profile.isame());
	}

}
