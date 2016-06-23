package net.umapath;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
private String name;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	//@Autowired
	private Address address;
	
	@Autowired
	public Student(Address address) {
		super();
		this.address = address;
	}
	
	
	
	
	/*public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}*/
	
	
	public void dis(){
		System.out.println("Sname:"+name+" "+"Address:"+address.getCity());
	}
	
	
}
