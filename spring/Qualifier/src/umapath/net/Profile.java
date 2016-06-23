package umapath.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

	@Autowired
	@Qualifier("student1") 
	private Student student1;
	
	@Autowired(required=false)
	@Qualifier("student2") 
	private Student student2;
	
	public boolean isame(){
		
		return student1.getAge()==student2.getAge();
	}
	public Profile(){}
	
	public Profile(Student student1, Student student2){
		this.student1= student1;
		this.student2= student2;
		System.out.println(this.student2.getAge());
		System.out.println("Inside Profile constructor." ); 
	}
	public void printAge() { 
		System.out.println("Age : " + student1.getAge() ); 
	}
	public void printName() { 
		System.out.println("Name : " + student1.getName() ); 
	}
}
