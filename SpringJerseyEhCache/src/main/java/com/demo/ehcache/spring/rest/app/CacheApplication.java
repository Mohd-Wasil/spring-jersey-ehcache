package com.demo.ehcache.spring.rest.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.demo.ehcache.spring.rest.resource.EmployeeResource;

/**
 * @author Wasil
 *
 */
@ApplicationPath("/*")
public class CacheApplication extends ResourceConfig {

	/**
	 *  registers Resources declared
	 */
	public CacheApplication() {
		register(EmployeeResource.class);
	}
}