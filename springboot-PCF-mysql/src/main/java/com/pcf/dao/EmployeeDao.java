package com.pcf.dao;

import java.util.List;

import com.pcf.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
}