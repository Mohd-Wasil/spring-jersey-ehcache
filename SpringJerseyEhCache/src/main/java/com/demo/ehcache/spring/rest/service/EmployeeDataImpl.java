/**
 * 
 */
package com.demo.ehcache.spring.rest.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ehcache.spring.rest.resource.dao.EmployeeDao;
import com.demo.ehcache.spring.rest.resource.model.Employee;

/**
 * @author Wasil
 *
 */
@Service
public class EmployeeDataImpl implements EmployeeData {

	private static final Logger LOG = Logger
			.getLogger(EmployeeDataImpl.class);
	@Autowired
	private EmployeeDao empDao;

	/* (non-Javadoc)
	 * @see com.demo.ehcache.spring.rest.service.EmployeeData#getEmployeeData()
	 */
	@Override
	public List<Employee> getEmployeeData() {

		long startTime = new Date().getTime();
		LOG.info("fetching Employee Details... ");
		List<Employee> employees = empDao.getEmployeeData();
		LOG.info("employee details fetched in :"
				+ (new Date().getTime() - startTime) / 1000 + " seconds");
		return employees;
	}
}
