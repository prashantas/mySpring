package umapath.net;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
				
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		StudentJDBCTemplate studentJDBCTemplate =(StudentJDBCTemplate)context.getBean("studentJDBCTemplate"); 
		System.out.println("------Records Creation--------" ); 
		studentJDBCTemplate.create(7,"test", 11); 
		studentJDBCTemplate.create(8,"java", 65);
		studentJDBCTemplate.create(9,"net", 19); 
		System.out.println("------Listing Multiple Records--------" ); 
		List<Student> students = studentJDBCTemplate.listStudents();
		   for (Student record : students) {
			System.out.print("ID : " + record.getId() ); 
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
			} 
		    
		   Student student = studentJDBCTemplate.getStudent(9); 
		   System.out.println("----Listing Record with ID = "+ student.getId() );
		   System.out.print("ID : " + student.getId() ); 
		   System.out.print(", Name : " + student.getName() );
		   System.out.println(", Age : " + student.getAge()); 
		   }
	}