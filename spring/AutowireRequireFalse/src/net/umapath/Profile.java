
package net.umapath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Profile {
	
	@Autowired
	@Qualifier("student1") 
	private Student student;

	
	public Student getStudent() {
		return student;
	}
     
	public void setStudent(Student student) {
		this.student = student;
	}
	public void dis()
	{
		System.out.println(student);
	}

	
}
