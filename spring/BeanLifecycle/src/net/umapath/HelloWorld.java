package net.umapath;

public class HelloWorld
{

	private String message;

	/*public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	*/
	

	   public void setMessage(String message)
	   {
	      this.message  = message;
	      System.out.println("Setter Method value:"+message);
	   }

	   public void getMessage(){
	      System.out.println("Get method Message : " + message);
	   }

	   public void init(){
	      System.out.println("Bean is going through init.");
	   }

	   public void destroy()
	   {
	      System.out.println("Bean will destroy now.");
	   }
	   
}
