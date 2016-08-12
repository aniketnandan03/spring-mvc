package com.tcs.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tcs.bean.Employee;

public interface IEmployeeDao {
	public int CreateNewEmployee(Employee e) throws SQLException;
	public ArrayList<Employee> fetchEmployees() throws SQLException;
	public Employee getEmployee(int id) throws SQLException;
	public int updateEmployee(Employee e) throws SQLException;
}
