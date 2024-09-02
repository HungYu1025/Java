package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	
	//create
	void addEmployee(Employee e);
	
	//read
	List<Employee> queryAll();
	Employee queryEmployee(String username,String password);
	Employee queryById(int id);
	Employee queryByUsername(String username);
	
	//update
	void updateEmployee(int id,String employeename);
	void passwordupdateEmployee(String username,String password);
	void nameupdateEmployee(String employeeusername,String employeename);
	void genderupdateEmployee(String employeeusername,String gender);
	void cityupdateEmployee(String employeeusername,String city);
	void areaupdateEmployee(String employeeusername,String area);
	void roadupdateEmployee(String employeeusername,String road);
	void emailupdateEmployee(String employeeusername,String email);
	void phoneupdateEmployee(String employeeusername,String phone);
	
	//delete
	void deleteEmployee(String username);
	
}