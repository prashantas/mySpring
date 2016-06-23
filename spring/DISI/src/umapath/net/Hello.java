package umapath.net;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	//@Autowired
	private Welcome welcome;
	
	/*@Autowired
	public Hello(Welcome welcome) 
	{ 
		System.out.println("Inside Hello constructor." );
		this.welcome = welcome; 
	}*/
	
	public Welcome getWelcome() {
		return welcome;
	}

	@Autowired
	public void setWelcome(Welcome welcome) {
		System.out.println("Inside setWelcome." );
		this.welcome = welcome;
	}
	
	public void welcomeCheck()
	{ 
		welcome.checkWelcome();
	}
	

}
