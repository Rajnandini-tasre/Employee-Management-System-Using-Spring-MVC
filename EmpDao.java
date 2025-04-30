package abc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int save(Emp p) {
		String sql="insert into Emp(name,salary,designatio) values('"+p.getName()+"','"+p.getSalary()+"','"+p.getDesignation()+"')";
	    return template.update(sql);
	}
	public int update(Emp p) {
			
	    String sql = "UPDATE emp SET name = ?, salary = ?, designatio = ? WHERE id = ?";
	    return template.update(sql, p.getName(), p.getSalary(), p.getDesignation(), p.getId());
	}
	public int delete(int id) {
		String sql="delete from emp where id ="+id+"";
		return  template.update(sql);
	}
	public List<Emp> getEmployee(){
		return template.query("select * from emp ", new RowMapper<Emp>(){
			public Emp mapRow(ResultSet rs, int row)throws SQLException{
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
				
			}
		
		});
	}
	
	public Emp getEmpById(int id) {
	    String sql = "SELECT * FROM emp WHERE id = ?";
	    return template.queryForObject(
	        sql,new BeanPropertyRowMapper<>(Emp.class),id);
	}
}
