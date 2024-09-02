package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.EmployeeDao;
import model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void add(Employee e) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into employee(employeeusername,password,employeename,gender,city,area,road,email,phone) values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, e.getEmployeeusername());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmployeename());
			ps.setString(4, e.getGender());
			ps.setString(5, e.getCity());
			ps.setString(6, e.getArea());
			ps.setString(7, e.getRoad());
			ps.setString(8, e.getEmail());
			ps.setString(9, e.getPhone());
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public List<Employee> selectAll() {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from employee";
		List<Employee> l = new ArrayList<Employee>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setEmployeeusername(rs.getString("employeeusername"));
				e.setPassword(rs.getString("password"));
				e.setEmployeename(rs.getString("employeename"));
				e.setGender(rs.getString("gender"));
				e.setCity(rs.getString("city"));
				e.setArea(rs.getString("area"));
				e.setRoad(rs.getString("road"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getString("phone"));
				l.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Employee> selectEmployee(String employeeusername, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from employee where employeeusername=? and password=?";
		List<Employee> l = new ArrayList<Employee>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, employeeusername);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setEmployeeusername(rs.getString("employeeusername"));
				e.setPassword(rs.getString("password"));
				e.setEmployeename(rs.getString("employeename"));
				e.setGender(rs.getString("gender"));
				e.setCity(rs.getString("city"));
				e.setArea(rs.getString("area"));
				e.setRoad(rs.getString("road"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getString("phone"));
				l.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Employee> selectById(int id) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from employee where id=?";
		List<Employee> l = new ArrayList<Employee>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setEmployeeusername(rs.getString("employeeusername"));
				e.setPassword(rs.getString("password"));
				e.setEmployeename(rs.getString("employeename"));
				e.setGender(rs.getString("gender"));
				e.setCity(rs.getString("city"));
				e.setArea(rs.getString("area"));
				e.setRoad(rs.getString("road"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getString("phone"));
				l.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Employee> selectByUsername(String username) {
		Connection conn = DbConnection.getDb();
		String SQL ="select * from employee where employeeusername=?";
		List<Employee> l = new ArrayList<Employee>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setEmployeeusername(rs.getString("employeeusername"));
				e.setPassword(rs.getString("password"));
				e.setEmployeename(rs.getString("employeename"));
				e.setGender(rs.getString("gender"));
				e.setCity(rs.getString("city"));
				e.setArea(rs.getString("area"));
				e.setRoad(rs.getString("road"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getString("phone"));
				l.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	@Override
	public Employee queryEmployee(String username, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from employee where employeeusername=? and password=?";
		Employee e = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				e = new Employee();
				e.setEmployeeusername(rs.getString("employeeusername"));
				e.setPassword(rs.getString("password"));
				e.setEmployeename(rs.getString("employeename"));
				e.setGender(rs.getString("gender"));
				e.setCity(rs.getString("city"));
				e.setArea(rs.getString("area"));
				e.setRoad(rs.getString("road"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public Employee querEmployee(String username) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from employee where employeeusername=?";
		Employee e = null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				e = new Employee();
				e.setEmployeeusername(rs.getString("employeeusername"));
				e.setPassword(rs.getString("password"));
				e.setEmployeename(rs.getString("employeename"));
				e.setGender(rs.getString("gender"));
				e.setCity(rs.getString("city"));
				e.setArea(rs.getString("area"));
				e.setRoad(rs.getString("road"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public void update(Employee e) {
		Connection conn = DbConnection.getDb();
		String SQL = "update employee set password=?,employeename=?,gender=?,city=?,area=?,road=?,email=?,phone=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, e.getPassword());
			ps.setString(2, e.getEmployeename());
			ps.setString(3, e.getGender());
			ps.setString(4, e.getCity());
			ps.setString(5, e.getArea());
			ps.setString(6, e.getRoad());
			ps.setString(7, e.getEmail());
			ps.setString(8, e.getPhone());
			ps.setInt(9, e.getId());
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void employeepdate(Employee e) {
		Connection conn = DbConnection.getDb();
		String SQL = "update employee set password=?,employeename=?,gender=?,city=?,area=?,road=?,email=?,phone=? where employeeusername=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, e.getPassword());
			ps.setString(2, e.getEmployeename());
			ps.setString(3, e.getGender());
			ps.setString(4, e.getCity());
			ps.setString(5, e.getArea());
			ps.setString(6, e.getRoad());
			ps.setString(7, e.getEmail());
			ps.setString(8, e.getPhone());
			ps.setString(9, e.getEmployeeusername());
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void delete(String username) {
		Connection conn = DbConnection.getDb();
		String SQL = "delete from employee where employeeusername=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}