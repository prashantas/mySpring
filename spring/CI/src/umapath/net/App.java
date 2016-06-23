package umapath.net;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         System.out.println("one");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		System.out.println("two");
		Employee te = (Employee) context.getBean("e");
		System.out.println("three");
		
		
		te.show();
		System.out.println("four");
	}

}
