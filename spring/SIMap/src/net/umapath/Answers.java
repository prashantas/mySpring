package net.umapath;

public class Answers {
	
	private int id;  
	private String answer;  
	 
	
	  
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public String toString(){  
	    return "Id:"+id+" Answer:"+answer;  
	}  
}
