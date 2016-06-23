package umapath.net;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;


public class StudentJDBCTemplate implements StudentDAO { 
	private DataSource dataSource; 
	private SimpleJdbcCall jdbcCall;
	
	public void setDataSource(DataSource dataSource) { 
		this.dataSource = dataSource; 
		this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord"); 
	} 
	public void create(Integer id,String name1, Integer age1) {
	JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
	String SQL = "insert into Student values (?,?,?)";
	jdbcTemplateObject.update( SQL,id,name1, age1); 
	System.out.println("Created Record Name = " + name1 + " Age = " + age1); 
	return;
	} 
	public Student getStudent(Integer id) 
	{ 
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
		Student student = new Student(); 
		student.setId(id); 
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age")); 
		return student;
	}
	public List<Student> listStudents() {
		String SQL = "select * from Student"; 
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
	/*@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
	}*/
}
