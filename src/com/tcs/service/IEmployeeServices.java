package com.tcs.service;

import java.util.ArrayList;

import com.tcs.bean.Employee;

public interface IEmployeeServices {
	public String createEmployee(Employee e);
	public ArrayList<Employee> fetchEmployeeList();
	public Employee getParticularEmployee(int id);
	public int updateEmployee(Employee e);
}
