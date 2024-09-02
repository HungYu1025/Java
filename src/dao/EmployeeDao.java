package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	
	//create
	void add(Employee e);
	
	//read
	List<Employee> selectAll();
	List<Employee> selectEmployee(String employeeusername,String employeepassword);
	List<Employee> selectById(int id);
	List<Employee> selectByUsername(String employeeusername);
	Employee queryEmployee(String employeeusername,String password);
	Employee querEmployee(String employeeusername);
	
	//update
	public void update(Employee e);
	public void employeepdate(Employee e);
	
	//delete
	public void delete(String employeeusername);
	

}