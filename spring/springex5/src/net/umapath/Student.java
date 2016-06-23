package net.umapath;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void dispinfo()
	{
		System.out.println("Name is "+name);
	}
	
	public void init()
	{ 
		System.out.println("Bean is going through init."); 
	}
	public void destroy()
	{
		System.out.println("Bean will destroy now.");
	}

}
