package umapath.com;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("circle's name");
		throw(new RuntimeException());
	}
	public String setNameReturn(String name){
		this.name = name;
		System.out.println("circle's name return");
		 
		return name;
	}
                                         	
}
