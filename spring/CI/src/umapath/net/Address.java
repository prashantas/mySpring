package umapath.net;

public class Address {
	
	private String city;  
	private String state;  
	private String country;
	
	public Address(String city, String state, String country)
	{
		System.out.println("ten");
	//	super();
		this.city = city;
		this.state = state;
		this.country = country;
		System.out.println("eleven");
	}

	public String toString()
	{  
		System.out.println("12");
	    return city+" "+state+" "+country;  
	    
	}  
	
	

}
