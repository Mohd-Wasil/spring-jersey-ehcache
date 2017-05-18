package com.demo.ehcache.spring.rest.resource.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.demo.ehcache.spring.rest.resource.model.Address;
import com.demo.ehcache.spring.rest.resource.model.Employee;

/**
 * @author Wasil
 *
 */
@Component
public class EmployeeDao {
	
	private static final Logger LOG = Logger
			.getLogger(EmployeeDao.class);

	/**
	 * @return employee list and caches it
	 */
	@Cacheable(value = "empdatacache")
	public List<Employee> getEmployeeData() {

		String[] firstNames = { "Mohd", "Sankalp", "Jolly", "Albert", "Teena",
				"Iqbal" };
		String[] lastNames = { "Wasil", "Jain", "LLB", "Pinton", "Talreja",
				"Ahmad" };
		final List<Employee> employees = new ArrayList<Employee>();
		try {
			LOG.info("processing employee details... ");
			// get Data base connection fetch data and process Data
			int j = 0;
			for (int i = 0; i < 1000; i++) {
				if (j > 5) {
					j = 0;
				}
				Employee employee = new Employee();
				employee.setEmployeeCode((int) (Math.random() * 100000 + 34500000L));
				employee.setAddress(new Address());
				employee.setPhoneNo((int) (Math.random() * 100000 + 91000000L));
				employee.setFirstName(firstNames[j]);
				employee.setLastName(lastNames[j]);
				employees.add(employee);
				Thread.sleep(10);
				j++;
			}

		} catch (Exception e) {

		}
		return employees;
	}
}
