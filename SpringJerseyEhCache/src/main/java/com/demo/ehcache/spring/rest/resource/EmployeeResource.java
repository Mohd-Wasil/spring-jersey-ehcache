package com.demo.ehcache.spring.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.ehcache.spring.rest.resource.model.Employee;
import com.demo.ehcache.spring.rest.service.EmployeeData;


/**
 * @author Wasil
 *
 */
@Path("/api")
public class EmployeeResource {

	@Autowired
	private EmployeeData employeeData;
	/**
	 * @return gets the list of employees
	 */
	@GET
	@Path("/empdata")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Employee> getEmployeeData() {
		
		return employeeData.getEmployeeData();
	}
}
