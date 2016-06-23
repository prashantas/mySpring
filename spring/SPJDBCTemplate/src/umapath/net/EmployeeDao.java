package umapath.net;

import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeDao {

	private JdbcTemplate jdbcTemplate1;
	

	
	public JdbcTemplate getJdbcTemplate1() {
		return jdbcTemplate1;
	}

	public void setJdbcTemplate1(JdbcTemplate jdbcTemplate1) {
		this.jdbcTemplate1 = jdbcTemplate1;
	}

	
	  
	public int saveEmployee(Employee e){  
	    String query="insert into emp102 values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    
	    return jdbcTemplate1.update(query);
	}  
	
	
	/*public int updateEmployee(Employee e){  
	    String query="update emp102 set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from emp102 where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	*/
	  
}
