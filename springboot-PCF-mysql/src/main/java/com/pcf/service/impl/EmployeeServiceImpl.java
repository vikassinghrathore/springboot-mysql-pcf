package com.pcf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcf.dao.EmployeeDao;
import com.pcf.model.Employee;
import com.pcf.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

}
