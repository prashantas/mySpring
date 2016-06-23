package umapath.net;

public class Employee {

	private int id;  
	private String name;  
    private int salary;
	  
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(int id, String name,int sal) {  
//	    super();  
	    this.id = id;  
	    this.name = name;
	    this.salary = sal;  
	      
	}  
	

	void show(){  
	    System.out.println(id+" "+name+" "+salary);
	      
	}  

}
