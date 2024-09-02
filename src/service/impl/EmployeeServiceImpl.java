package service.impl;

import java.util.List;

import dao.impl.EmployeeDaoImpl;
import model.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	private static EmployeeDaoImpl edi = new EmployeeDaoImpl();

	@Override
	public void addEmployee(Employee e) {
		edi.add(e);
	}

	@Override
	public List<Employee> queryAll() {
		return edi.selectAll();
	}

	@Override
	public Employee queryEmployee(String employeeusername, String password) {
		List<Employee> l = edi.selectEmployee(employeeusername, password);
		Employee[] e = l.toArray(new Employee[1]); 
		return e[0];
	}

	@Override
	public Employee queryById(int id) {
		List<Employee> l = edi.selectById(id);
		Employee[] e = l.toArray(new Employee[1]);
		return e[0];
	}

	@Override
	public Employee queryByUsername(String employeeusername) {
		List<Employee> l = edi.selectByUsername(employeeusername);
		Employee[] e = l.toArray(new Employee[1]);
		return e[0];
	}

	@Override
	public void updateEmployee(int id, String employeename) {
		Employee e = queryById(id);
		e.setEmployeename(employeename);
		edi.update(e);
	}

	@Override
	public void passwordupdateEmployee(String employeeusername, String password) {
		Employee e = queryByUsername(employeeusername);
		e.setPassword(password);
		edi.update(e);
	}

	@Override
	public void nameupdateEmployee(String employeeusername, String employeename) {
		Employee e = queryByUsername(employeeusername);
		e.setEmployeename(employeename);
		edi.update(e);
	}

	@Override
	public void genderupdateEmployee(String employeeusername, String gender) {
		Employee e = queryByUsername(employeeusername);
		e.setGender(gender);
		edi.update(e);
	}

	@Override
	public void cityupdateEmployee(String employeeusername, String city) {
		Employee e = queryByUsername(employeeusername);
		e.setCity(city);
		edi.update(e);
	}

	@Override
	public void areaupdateEmployee(String employeeusername, String area) {
		Employee e = queryByUsername(employeeusername);
		e.setArea(area);
		edi.update(e);
	}

	@Override
	public void roadupdateEmployee(String employeeusername, String road) {
		Employee e = queryByUsername(employeeusername);
		e.setRoad(road);
		edi.update(e);
	}

	@Override
	public void emailupdateEmployee(String employeeusername, String email) {
		Employee e = queryByUsername(employeeusername);
		e.setEmail(email);
		edi.update(e);
	}

	@Override
	public void phoneupdateEmployee(String employeeusername, String phone) {
		Employee e = queryByUsername(employeeusername);
		e.setPhone(phone);
		edi.update(e);
	}

	@Override
	public void deleteEmployee(String employeeusername) {
		Employee e = queryByUsername(employeeusername);
		e.setEmployeeusername(employeeusername);
		edi.update(e);
	}

}