package umapath.net;

import java.util.Iterator;
import java.util.List;

public class Address {

	private String city;  
	private String state;  
	private String country;
	private List<Employee> employees;
	
	

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}



	public Address(String city, String state, String country,
			List<Employee> employees) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.employees = employees;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public void displayInfo(){  
	    System.out.println("City "+city);  
	    System.out.println("State "+state);
	    System.out.println("Coutry "+country);
	    System.out.println("Employee  are:");  
	    System.out.println("ID    Name    Salary");
	    Iterator<Employee> itr=employees.iterator();  
	    while(itr.hasNext()){  
	        Employee obj=itr.next();
	        obj.show();
	    }  

	}

}
