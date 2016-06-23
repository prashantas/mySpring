package umapath.net;

import java.io.FileWriter;  
import java.io.IOException;  
import javax.xml.transform.stream.StreamResult;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.oxm.Marshaller;  
  
public class Test{  
 public static void main(String[] args)throws IOException{  
  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");  
  Marshaller marshaller = (Marshaller)context.getBean("jaxbMars");  
          
  employee emp=new employee();  
  emp.setId(55555);  
  emp.setName("XYYZZZ");  
  emp.setSalary(500000);  
          
  marshaller.marshal(emp, new StreamResult(new FileWriter("emp1.xml")));  
    
  System.out.println("XML Created Sucessfully");  
 }  
}  