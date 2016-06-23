package umapath.net;

public class Hello {

	private String name,message;

	
	
	public Hello(String name, String message) {
		this.name = name;
		this.message = message;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}*/

	/*public String toString(){
		return "NAME "+name +" message " +message;
	}*/
	public void show(){
		System.out.println("NAME "+name+" "+"message: "+message);
	
	}

	
}