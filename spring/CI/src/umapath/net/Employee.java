package umapath.net;

public class Employee
{

	private int id;  
	private String name;  
	private Address address;//Aggregation  
	  
	public Employee() 
	{
		System.out.println("def cons");
		}  
	  
	public Employee(int id, String name, Address address) 
	{  
		System.out.println("five");
//	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	    System.out.println("six");
	}  
	
	/*public Employee(int id, String name) {  
//	    super();  
	    this.id = id;  
	    this.name = name;  
	     
	}  */
	
	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/

	void show()
	{  
		System.out.println("seven");
	    System.out.println(id+" "+name);  
	    System.out.println("eight");
	    System.out.println(address);
	    System.out.println("nine");
	}  

}
