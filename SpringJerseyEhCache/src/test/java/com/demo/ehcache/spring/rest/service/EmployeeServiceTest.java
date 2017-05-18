package com.demo.ehcache.spring.rest.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.ehcache.spring.rest.service.EmployeeData;

/**
 * @author Wasil
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class EmployeeServiceTest {

	@Autowired
	private EmployeeData employeeData;
	private static final Logger LOG = Logger
			.getLogger(EmployeeServiceTest.class);
	/**
	 * 
	 */
	@Test
	public void empDataTest(){
		LOG.info("first service call to get employees details...");
		employeeData.getEmployeeData();
		LOG.info("second service call [CACHED] to get employees details...");
		employeeData.getEmployeeData();
	}
}
