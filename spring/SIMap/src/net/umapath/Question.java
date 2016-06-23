package net.umapath;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;  
	private String name;  
	private Map<Answers,User> answers;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Answers, User> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answers, User> answers) {
		this.answers = answers;
	}

	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<Answers, User>> set=answers.entrySet();  
	    Iterator<Entry<Answers, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answers, User> entry=itr.next();  
	        Answers ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	} 
	
	}

