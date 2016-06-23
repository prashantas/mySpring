package umapath.net;

import org.springframework.context.annotation.*; 

@Configuration 
public class ProfileConfig {

@Bean()
public Profile Profile(Student student1, Student student2){
		 
		return new Profile(student1,student2);
	}

	
	}