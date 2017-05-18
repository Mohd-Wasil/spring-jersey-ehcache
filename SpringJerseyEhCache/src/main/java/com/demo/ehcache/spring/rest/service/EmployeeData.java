package com.demo.ehcache.spring.rest.service;

import java.util.List;

import com.demo.ehcache.spring.rest.resource.model.Employee;

/**
 * @author Wasil
 *
 */
public interface EmployeeData {
	
	/**
	 * @return list of employees
	 */
	public List<Employee> getEmployeeData();

}
